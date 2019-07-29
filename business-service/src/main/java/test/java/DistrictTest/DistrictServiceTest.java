package test.java.DistrictTest;

import com.codegym.entity.District;
import com.codegym.entity.Province;
import com.codegym.repository.DistrictRepository;
import com.looo.service.DistrictServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DistrictServiceTest {
    @InjectMocks
    private DistrictServiceImpl districtService;

    @Mock
    private DistrictRepository districtRepository;

    private List<District> districtList = new ArrayList<>();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        for (int i = 0; i < 10; i++) {
            districtList.add(i,new District((long) i,"District" + i));
        }
        districtList.get(1).setProvince(new Province(1L,"Hà Nội"));
        districtList.get(5).setProvince(new Province(1L,"Hà Nội"));
    }

    @Test
    public void testFindAllDistrict(){
        when(districtRepository.findAll()).thenReturn(districtList);
        Assert.assertEquals(10, districtService.findAll().size());
    }

    @Test
    public void findDistrictByProvinceId(){
        when(districtRepository.findAllByProvince_Id(1L)).thenAnswer(new Answer<List<District>>() {
            @Override
            public List<District> answer(InvocationOnMock invocationOnMock) throws Throwable {
                List<District> newList = new ArrayList<>();
                newList.add(districtList.get(1));
                newList.add(districtList.get(5));
                return newList;
            }
        });
        Assert.assertEquals(2,districtService.findAllById_Province(1L).size());
    }

    @Test
    public void findDistrictByProvinceIdBeingNull(){
        when(districtRepository.findAllByProvince_Id(null)).thenThrow(new Error("Id is null"));
        try{
            districtService.findAllById_Province(null);
        }catch (Error e){
            Assert.assertEquals("Id is null",e.getMessage());
        }
    }

    @Test
    public void findAllDistrictByProvinceName(){
        final String provinceName = "Hà Nội";

        District district1 = new District(1L,"District1");
        district1.setProvince(new Province(1L,provinceName));

        District district2 = new District(5L,"District5");
        district2.setProvince(new Province(5L,provinceName));

        when(districtRepository.findAllByProvince_Name(provinceName)).thenAnswer(new Answer<List<District>>() {
            @Override
            public List<District> answer(InvocationOnMock invocationOnMock) throws Throwable {
                List<District> newList = new ArrayList<>();
                newList.add(district1);
                newList.add(district2);
                return newList;
            }
        });
        Assert.assertEquals(2,districtService.findAllDistrictByName_Province(provinceName).size());
    }
}

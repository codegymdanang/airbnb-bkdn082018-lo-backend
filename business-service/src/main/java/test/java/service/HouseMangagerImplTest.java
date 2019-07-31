package test.java.service;

import com.codegym.entity.House;
import com.codegym.repository.HouseRepository;
import com.looo.service.HouseService;
import com.looo.service.HouseServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HouseMangagerImplTest {
    @InjectMocks
    private HouseServiceImpl houseMangager;
    @Mock
    private HouseRepository houseRepository;

    private List<House> houseList = new ArrayList<>();

    @Before
    public void prepare(){
        MockitoAnnotations.initMocks(this);
        houseList.add(new House("lo","test1",2,3, 34.2));
        houseList.add(new House("loo","test2",3,4, 36.2));
        houseList.add(new House("looo","test3",4,5, 37.2));
        houseList.add(new House("loooo","test4",5,6, 38.2));
    }

    @Test
    public void getAllHousesTest() {
        when(houseRepository.findAll()).thenReturn(houseList);
        Assert.assertEquals(houseMangager.getAllHouse().size(),4);
    }

}

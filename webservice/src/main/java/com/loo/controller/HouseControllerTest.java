package com.loo.controller;

import com.codegym.entity.House;
import com.looo.service.HouseServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.hamcrest.Matchers;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@RunWith(MockitoJUnitRunner.class)
public class HouseControllerTest {
    public MockMvc mockMvc;

    @Mock
    public HouseServiceImpl houseMangager;
    @InjectMocks
    public HouseController houseController;

    public List<House> houseList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(houseController).build();

        MockitoAnnotations.initMocks(this);
        houseList.add(new House("lo", "test1", 2, 3, 34.2));
    }

    @Test
    public void getAllHousesTest() throws Exception {
        when(houseMangager.getAllHouse()).thenReturn(houseList);
        mockMvc.perform(get("/api/houses")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", Matchers.is("lo")))
                .andExpect(jsonPath("$.*", Matchers.hasSize(1)));
    }
    @Test
    public void testPost() throws Exception {
        String json = "{\n" +
                "  \"id\": \"1\",\n" +
                "  \"name\": \"lo\",\n" +
                "  \"desciption\": \"test1\"\n" +
                "  \"bathRoomQuanity\": \"3\"\n" +
                "  \"bedRoomQuanity\": \"2\"\n" +
                "  \"price\": \"34.2\"\n" +
                "}";
        mockMvc.perform(post("/api/houses/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", Matchers.is("lo")))
                .andExpect(jsonPath("$.value", Matchers.is("Hello World")))
                .andExpect(jsonPath("$.*", Matchers.hasSize(1)));
    }
}

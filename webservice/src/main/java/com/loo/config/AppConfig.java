package com.loo.config;

import com.looo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public VillageService villageService() {
        return new VillageServiceImpl();

    }
    @Bean
    public DistrictService districtService() {
        return new DistrictServiceImpl();
    }
    @Bean
    public ProvinceService provinceService() {
        return new ProvinceServiceImpl();
    }
}

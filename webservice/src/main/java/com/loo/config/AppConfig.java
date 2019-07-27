package com.loo.config;

import com.codegym.repository.AccountDAO;
import com.looo.service.*;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        // Tải file: validation.properties
        messageSource.setBasename("classpath:validation");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
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

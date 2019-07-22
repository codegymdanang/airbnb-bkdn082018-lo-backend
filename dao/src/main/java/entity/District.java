package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_district;

    private String name_district;

    public Long getId_district() {
        return id_district;
    }

    public void setId_district(Long id_district) {
        this.id_district = id_district;
    }

    public String getName_district() {
        return name_district;
    }

    public void setName_district(String name_district) {
        this.name_district = name_district;
    }
    public District(){}

    public District(Long id_district,String name_district){
        this.id_district = id_district;
        this.name_district = name_district;
    }
}

package entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_province;

    private String name_province;

    public Long getId_province() {
        return id_province;
    }

    public String getName_province() {
        return name_province;
    }

    public void setId_province(Long id_province) {
        this.id_province = id_province;
    }

    public void setName_province(String name_province) {
        this.name_province = name_province;
    }
    public Province(){}

    public Province(Long id_province,String name_province){
        this.id_province = id_province;
        this.name_province = name_province;
    }
}

package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_village;

    private String name_village;

    public Long getId_village() {
        return id_village;
    }

    public String getName_village() {
        return name_village;
    }

    public void setId_village(Long id_village) {
        this.id_village = id_village;
    }

    public void setName_village(String name_village) {
        this.name_village = name_village;
    }
    public Village(){}

    public Village(Long id_village,String name_village){
        this.id_village = id_village;
        this.name_village = name_village;
    }
}

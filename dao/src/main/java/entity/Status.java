package entity;


import javax.persistence.*;
import java.util.List;

public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @OneToMany(targetEntity = House.class)
    private List<House> houseList;

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}

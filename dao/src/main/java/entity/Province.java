package entity;


import javax.persistence.*;
import java.util.List;

public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(targetEntity = District.class)
    private List<District> districtList;


    @OneToMany(targetEntity = House.class)
    private List<House> houseList;

    @OneToMany(targetEntity = Account.class)
    private List<Account> accountList;

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(){}

    public Province(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public List<House> getHouseList() {
        return houseList;

    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}

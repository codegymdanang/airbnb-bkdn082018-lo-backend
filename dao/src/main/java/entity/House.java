package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String image;

    private String description;

    private int bathRoomQuantity;

    private int bedRoomQuantity;

    private int price;

    public House() {
    }
    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "id_status")
    private Status status;

    @ManyToOne(targetEntity = Province.class)
    @JoinColumn(name = "id_province")
    private Province province;

    @OneToMany(targetEntity = OrderDetail.class)
    private List<OrderDetail> orderDetailList;

    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "id_account")
    private Account account;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public int getBathRoomQuantity() {
        return bathRoomQuantity;
    }

    public int getBedRoomQuantity() {
        return bedRoomQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBathRoomQuantity(int bathRoomQuantity) {
        this.bathRoomQuantity = bathRoomQuantity;
    }

    public void setBedRoomQuantity(int bedRoomQuantity) {
        this.bedRoomQuantity = bedRoomQuantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

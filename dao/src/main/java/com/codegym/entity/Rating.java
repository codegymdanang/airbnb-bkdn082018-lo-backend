package com.codegym.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    private Long ratingStar;

    private Timestamp postDate;


    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "id_account")
    private User user;

    public Rating() {
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Long getRatingStar() {
        return ratingStar;
    }

    public Timestamp getPostDate() {
        return postDate;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRatingStar(Long ratingStar) {
        this.ratingStar = ratingStar;
    }

    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }

    public void setUser(User user) {
        this.user= user;
    }
}

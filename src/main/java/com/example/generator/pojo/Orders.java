package com.example.generator.pojo;

public class Orders {
    private Integer id;
    private String number;
    private Integer user_id;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", user_id=" + user_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}

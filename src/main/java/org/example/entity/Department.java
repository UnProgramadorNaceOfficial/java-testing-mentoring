package org.example.entity;

import java.util.List;

public class Department {
    private Long id;
    private String city;
    private List<User> userList;

    public Department(Long id, String city, List<User> userList) {
        this.id = id;
        this.city = city;
        this.userList = userList;
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", userList=" + userList +
                '}';
    }
}

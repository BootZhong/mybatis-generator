package com.example.generator.pojo;

public class Customer {
    private Integer id;

    private String username;

    private Integer usernum;

    private String jobs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs == null ? null : jobs.trim();
    }
}
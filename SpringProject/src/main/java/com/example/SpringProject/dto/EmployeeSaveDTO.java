package com.example.SpringProject.dto;

public class EmployeeSaveDTO {
    private String name;
    private String address;
    private int mobile;

    public EmployeeSaveDTO() {
    }

    public String getName() {
        return name;
    }

    public EmployeeSaveDTO(String name, String address, int mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}

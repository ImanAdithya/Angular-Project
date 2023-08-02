package com.example.SpringProject.dto;


public class EmployeeDTO {

    private int employeeId;

    private String name;

    private String address;

    private int mobile;


    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeId, String name, String address, int mobile) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
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

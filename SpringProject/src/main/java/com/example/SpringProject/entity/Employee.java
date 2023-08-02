package com.example.SpringProject.entity;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "empId",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    @Column(name = "empName",length = 50)
    private String name;

    @Column(name = "empAddress",length = 50)
    private String address;
    @Column(name = "empMobile",length = 50)
    private int mobile;

    public Employee() {
    }

    public Employee(int employeeId, String name, String address, int mobile) {
        this.setEmployeeId (employeeId);
        this.setName (name);
        this.setAddress (address);
        this.setMobile (mobile);
    }

    public Employee( String name, String address, int mobile) {
        this.setName (name);
        this.setAddress (address);
        this.setMobile (mobile);
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
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }

}

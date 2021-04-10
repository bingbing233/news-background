package com.example.news.dao;

public class Employee {
    private Integer empId;
    private String empName;
    private String empGender;
    private String empPassword;
    private String empPhone;
    private String empApartment;
    private String empRole;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpApartment() {
        return empApartment;
    }

    public void setEmpApartment(String empApartment) {
        this.empApartment = empApartment;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empApartment='" + empApartment + '\'' +
                ", empRole='" + empRole + '\'' +
                '}';
    }
}

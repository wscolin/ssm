package com.colin.crud.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer deptId;
    private Deptment deptment;

    public Deptment getDeptment() {
        return deptment;
    }

    public void setDeptment(Deptment deptment) {
        this.deptment = deptment;
    }

    public Integer getEmpId() {
        return empId;
    }


    public Employee(Integer empId, String empName, String gender, String email, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.deptId = deptId;
    }

    public Employee() {
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
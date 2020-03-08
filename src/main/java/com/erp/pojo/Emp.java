package com.erp.pojo;

public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String tel;
    private String idCardNo;
    private String realName;
    private String gender;
    private String email;
    private String address;
    private String birthDate;
    private Integer deptId;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTel() {
        return tel;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public String getRealName() {
        return realName;
    }

    public String getGender() {
        return gender;
    }

    public String getemail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Integer getDeptId() {
        return deptId;
    }
}

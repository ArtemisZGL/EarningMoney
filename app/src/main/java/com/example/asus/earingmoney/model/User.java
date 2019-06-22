package com.example.asus.earingmoney.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class User{
    @SerializedName("userId")
    private int id;
    @SerializedName("userType")
    private int userType;//判断是普通用户还是管理员
    @SerializedName("name")
    private String name;
    @SerializedName("avator")
    private String avator;//头像
    @SerializedName("nickName")
    private String nickName;//昵称
    @SerializedName("age")
    private int age;
    @SerializedName("sex")
    private int sex;// 0 = female 1 = male 2 = not sure
    @SerializedName("grade")
    private int grade;
    @SerializedName("major")
    private String major;
    @SerializedName("mailAddr")
    private String mailAddr;
    @SerializedName("phoneNum")
    private String phoneNum;
    @SerializedName("stuId")
    private String stuId;//学号
    @SerializedName("balance")
    private int balance;//余额
    @SerializedName("tags")
    private String tags;//标签，用于分类
    @SerializedName("password")
    private String password;

    public User(int _id, int _userType, String _name, String _avator, String _nickName, int _age, int _sex, int _grade, String _major, String _mailAddr, String _phoneNum, String _stuId, int _balance, String _tags, String _password) {

        id = _id;
        userType = _userType;
        name = _name;
        avator = _avator;
        nickName = _nickName;
        age = _age;
        sex = _sex;
        grade = _grade;
        major = _major;
        mailAddr = _mailAddr;
        phoneNum = _phoneNum;
        stuId = _stuId;
        balance = _balance;
        tags = _tags;
        password = _password;
    }

    public int getId() {
        return id;
    }

    public int getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public String getAvator() {
        return avator;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public int getGrade() {
        return grade;
    }

    public String getTags() {
        return tags;
    }

    public int getBalance() {
        return balance;
    }

    public String getstuId() {
        return stuId;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public String getMajor() {
        return major;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setstuId(String stuId) {
        this.stuId = stuId;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

}

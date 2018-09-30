package com.example.demospringboot.entity;


public class TbUser {

  private long id;
  private String userName;
  private String userPassword;
  private String userFace;
  private String userSex;
  private String userPhone;
  private String userOicq;
  private String userEmail;
  private String userFrom;
  private String userAble;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserFace() {
    return userFace;
  }

  public void setUserFace(String userFace) {
    this.userFace = userFace;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserOicq() {
    return userOicq;
  }

  public void setUserOicq(String userOicq) {
    this.userOicq = userOicq;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserFrom() {
    return userFrom;
  }

  public void setUserFrom(String userFrom) {
    this.userFrom = userFrom;
  }


  public String getUserAble() {
    return userAble;
  }

  public void setUserAble(String userAble) {
    this.userAble = userAble;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", userFace='" + userFace + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userPhone='" + userPhone + '\'' +
            ", userOicq='" + userOicq + '\'' +
            ", userEmail='" + userEmail + '\'' +
            ", userFrom='" + userFrom + '\'' +
            ", userAble='" + userAble + '\'' +
            '}';
  }
}

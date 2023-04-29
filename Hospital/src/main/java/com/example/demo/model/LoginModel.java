 package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class LoginModel {
@Id
private int userid;
private String username;
private String password;
LoginModel(){}
public int getUserid() {
return userid;
}
public void setUserid(int userid) {
this.userid = userid;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}

public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

}

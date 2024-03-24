package com.wang.Bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Manager {
    private int id;
    private String username;
    private String password;
    private String nickName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Manager() {
    }

    public Manager(int id, String username, String password, String nickName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
    }

}

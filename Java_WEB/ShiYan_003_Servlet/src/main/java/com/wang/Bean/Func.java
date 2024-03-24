package com.wang.Bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Func {
    private String name;
    private Integer id;
    private String url;
    private Integer manager_id;

    public Func() {
    }

    public Func(String name, Integer id, String url, Integer manager_id) {
        this.name = name;
        this.id = id;
        this.url = url;
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return "Func{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", manager_id=" + manager_id +
                '}';
    }

}

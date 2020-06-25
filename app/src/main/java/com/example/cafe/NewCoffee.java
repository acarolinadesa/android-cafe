package com.example.cafe;

import java.io.Serializable;

public class NewCoffee implements Serializable {
    private Integer id;
    private String coffebean;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getCoffebean() {
        return coffebean;
    }

    public void setCoffebean(String coffebean) {
        this.coffebean = coffebean;
    }
    @Override
    public String toString(){
        return coffebean;
    }
}

package com.company;

public class Weapon {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon(String name, String type) {
        this.setType(type);
        this.setName(name);

    }
}

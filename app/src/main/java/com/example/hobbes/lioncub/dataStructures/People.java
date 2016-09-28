package com.example.hobbes.lioncub.dataStructures;
/**
 * Created by Kelvin Meyer on 2016/09/24.
 * MYRKEL002
 */
public class People {
    private String name;
    private String sname;
    private String ID;
    private String userId;

    public People(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String toString(){
        return name+" "+sname;
    }
}

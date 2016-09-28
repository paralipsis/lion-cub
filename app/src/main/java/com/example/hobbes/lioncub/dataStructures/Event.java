package com.example.hobbes.lioncub.dataStructures;

import java.util.ArrayList;
import java.util.Date;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

/**
 * Created by Kelvin Meyer on 2016/09/24.
 * MYRKEL002
 */

@DynamoDBTable(tableName = "Events")
public class Event {
    private String nameOfEvent;
    private Date time;
    private String place;
    private ArrayList<People> people = new ArrayList<>();
    private People owner;
    private boolean pub;
    private String userId;

    public Event(String nameOfEvent, Date time, String place, ArrayList<People> people, People owner, boolean pub, String userId) {
        this.nameOfEvent = nameOfEvent;
        this.time = time;
        this.place = place;
        this.people = people;
        this.owner = owner;
        this.pub = pub;
        this.userId = userId;
    }

    @DynamoDBIndexRangeKey(attributeName = "NameOfEvent")
    public String getNameOfEvent() {
        return nameOfEvent;
    }

    @DynamoDBAttribute(attributeName = "Time")
    public Date getTime() {
        return time;
    }

    @DynamoDBAttribute(attributeName = "Place")
    public String getPlace() {
        return place;
    }

    @DynamoDBAttribute(attributeName = "People")
    public ArrayList<People> getPeople() {
        return people;
    }

    @DynamoDBAttribute(attributeName = "Owner")
    public People getOwner() {
        return owner;
    }

    @DynamoDBAttribute(attributeName = "Public")
    public boolean isPub() {
        return pub;
    }

    @DynamoDBHashKey(attributeName = "userID")
    public String getUserId() {
        return userId;
    }
}

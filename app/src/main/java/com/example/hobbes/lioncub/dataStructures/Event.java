package com.example.hobbes.lioncub.dataStructures;

import java.util.ArrayList;
import java.util.Date;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

/**
 * Created by Kelvin Meyer on 2016/09/24.
 * MYRKEL002
 */

@DynamoDBTable(tableName = "lioncubdev-mobilehub-1707615705-Events")
public class Event {
    private String nameOfEvent;
    private String time;
    private String place;
    private String people;
    //private ArrayList<People> people = new ArrayList<>();
    private String owner;
    private boolean pub;
    private String userId;

    public Event(String nameOfEvent, String time, String place, String people, String owner, boolean pub, String userId) {
        this.nameOfEvent = nameOfEvent;
        this.time = time;
        this.place = place;
        this.people = people;
        this.owner = owner;
        this.pub = pub;
        this.userId = userId;
    }

    public Event(Event e) {
        this(e.nameOfEvent, e.time, e.place, e.people, e.owner, e.pub, e.userId);
    }

    @DynamoDBIndexRangeKey(attributeName = "NameOfEvent")
    public String getNameOfEvent() {
        return nameOfEvent;
    }

    @DynamoDBAttribute(attributeName = "Time")
    public String getTime() {
        return time;
    }

    @DynamoDBAttribute(attributeName = "Place")
    public String getPlace() {
        return place;
    }

    @DynamoDBAttribute(attributeName = "People")
    public String getPeople() {
        return people;
    }

    @DynamoDBAttribute(attributeName = "Owner")
    public String getOwner() {
        return owner;
    }

    @DynamoDBAttribute(attributeName = "Public")
    public boolean isPub() {
        return pub;
    }

    @DynamoDBHashKey(attributeName = "userId")
    public String getUserId() {
        return userId;
    }
}

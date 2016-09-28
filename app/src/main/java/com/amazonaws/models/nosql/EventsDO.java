package com.amazonaws.models.nosql;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "lioncubdev-mobilehub-1707615705-Events")

public class EventsDO {
    private String _userId;
    private String _nameOfEvent;
    private String _date;
    private String _owner;
    private String _people;
    private String _place;
    private Boolean _public;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBRangeKey(attributeName = "NameOfEvent")
    @DynamoDBAttribute(attributeName = "NameOfEvent")
    public String getNameOfEvent() {
        return _nameOfEvent;
    }

    public void setNameOfEvent(final String _nameOfEvent) {
        this._nameOfEvent = _nameOfEvent;
    }
    @DynamoDBAttribute(attributeName = "Date")
    public String getDate() {
        return _date;
    }

    public void setDate(final String _date) {
        this._date = _date;
    }
    @DynamoDBAttribute(attributeName = "Owner")
    public String getOwner() {
        return _owner;
    }

    public void setOwner(final String _owner) {
        this._owner = _owner;
    }
    @DynamoDBAttribute(attributeName = "People")
    public String getPeople() {
        return _people;
    }

    public void setPeople(final String _people) {
        this._people = _people;
    }
    @DynamoDBAttribute(attributeName = "Place")
    public String getPlace() {
        return _place;
    }

    public void setPlace(final String _place) {
        this._place = _place;
    }
    @DynamoDBAttribute(attributeName = "Public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(final Boolean _public) {
        this._public = _public;
    }

}

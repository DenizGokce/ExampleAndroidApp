package com.example.deniz.exampleandroidapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.JsonObject;

/**
 * Created by Deniz on 30.11.2017.
 */
@Entity
public class Person {
    @PrimaryKey
    @NonNull
    private int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public JsonObject getJson() {
        JsonObject json = new JsonObject();
        json.addProperty("firstname", this.firstname);
        json.addProperty("lastname", this.lastname);
        return json;
    }
}

package com.bluohazard.tourdengalam.models;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Mountain {
    public String name;
    public String image_url;
    public String location_title;

    public Mountain() {

    }

    public Mountain(String name, String image_url, String location_title) {
        this.name = name;
        this.image_url = image_url;
        this.location_title = location_title;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("image_url", image_url);
        result.put("location_title", location_title);
        return result;
    }
}

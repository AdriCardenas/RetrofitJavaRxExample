package com.example.adriancardenasjimene.testretrofit;

import com.google.gson.annotations.SerializedName;

public class Hero {
    String name;
    @SerializedName("realname")
    String realName;
    String team;
    @SerializedName("firstappearance")
    String firstAppearance;
    @SerializedName("createdby")
    String createdBy;
    String publisher;
    @SerializedName("imageurl")
    String imageUrl;
    String bio;

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBio() {
        return bio;
    }
}

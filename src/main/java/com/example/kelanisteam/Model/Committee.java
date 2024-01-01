package com.example.kelanisteam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "committee")
public class Committee {

    @Id
    private String id;
    private String club;
    private String name;
    private String position;
    private String imageUrl;

    // Constructors, getters, setters

    public Committee() {
        // Default constructor
    }

    public Committee(String id, String club, String name, String position, String imageUrl) {
        this.id = id;
        this.club = club;
        this.name = name;
        this.position = position;
        this.imageUrl = imageUrl;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

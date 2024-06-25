// albums.java

package com.example.kelanisteam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Document(collection = "Albums")
public class Album {

    @Id
    private String id;
    private String albumName;
    private String albumLink;
    private String[] photographedBy;
    private String[] editedBy;
    private String[] imageUrls;

    private Date createdDate;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumLink() {
        return albumLink;
    }

    public void setAlbumLink(String albumLink) {
        this.albumLink = albumLink;
    }

    public String[] getPhotographedBy() {
        return photographedBy;
    }

    public void setPhotographedBy(String[] photographedBy) {
        this.photographedBy = photographedBy;
    }

    public String[] getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String[] editedBy) {
        this.editedBy = editedBy;
    }

    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

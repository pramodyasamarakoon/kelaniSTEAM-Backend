package com.example.kelanisteam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;
    private String name;
    private String university;
    private String event;
    private String email;
    private String mobile;
    private String description;
    private String expectation;
    private String whatWeGet;
    private String proposalLink;

    private String other;
    private String bookingDate;

    // Constructors, getters, setters

    public Booking() {
        // Default constructor
    }

    public Booking(String name, String university, String event, String email, String mobile,
                   String description, String expectation, String whatWeGet, String proposalLink, String other, String bookingDate) {
        this.name = name;
        this.university = university;
        this.event = event;
        this.email = email;
        this.mobile = mobile;
        this.description = description;
        this.expectation = expectation;
        this.whatWeGet = whatWeGet;
        this.proposalLink = proposalLink;
        this.bookingDate = bookingDate;
        this.other = other;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpectation() {
        return expectation;
    }

    public void setExpectation(String expectation) {
        this.expectation = expectation;
    }

    public String getWhatWeGet() {
        return whatWeGet;
    }

    public void setWhatWeGet(String whatWeGet) {
        this.whatWeGet = whatWeGet;
    }

    public String getProposalLink() {
        return proposalLink;
    }

    public void setProposalLink(String proposalLink) {
        this.proposalLink = proposalLink;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

package com.example.kelanisteam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tshirt_orders")
public class TShirtOrder {

    @Id
    private String id;
    private String name;
    private String department;
    private String studentNumber;
    private String contactNumber;
    private String email;
    private String size;
    private String paymentMethod;
    private String paymentAmount;
    private String imageUrl;

    // Constructors, getters, setters

    public TShirtOrder() {
        // Default constructor
    }

    public TShirtOrder(String name, String department, String studentNumber, String contactNumber, String email,
                       String size, String paymentMethod, String paymentAmount, String imageUrl) {
        this.name = name;
        this.department = department;
        this.studentNumber = studentNumber;
        this.contactNumber = contactNumber;
        this.email = email;
        this.size = size;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.imageUrl = imageUrl;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

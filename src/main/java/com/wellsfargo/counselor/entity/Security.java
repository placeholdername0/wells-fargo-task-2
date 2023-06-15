package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private float purchasePrice;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }
    public Security(Portfolio portfolio, String name, String category, float purchasePrice, String purchaseDate, float quantity){
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }
    public void setName (String name) {this.name = name;}
    public String getName() {return name;}

    public  void setCategory(String category) {this.category = category}
    public String getCategory(String category) {return category;}
    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
    public void setQuantity(float quantity) {this.quantity = quantity;}
    public float getQuantity() {return quantity;}

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}

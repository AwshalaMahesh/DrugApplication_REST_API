package com.paharma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "DrugDB")
public class Drug {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Price")
    private double price;
    @Column(name = "Mfg_Date")
    @JsonFormat(pattern = "dd-MMM-yyyy", shape = JsonFormat.Shape.STRING)
    private Date mfg_dt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getMfg_dt() {
        return mfg_dt;
    }

    public void setMfg_dt(Date mfg_dt) {
        this.mfg_dt = mfg_dt;
    }

    public Drug() {
    }

    public Drug(int id, String name, double price, Date mfg_dt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mfg_dt = mfg_dt;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mfg_dt='" + mfg_dt + '\'' +
                '}';
    }
}

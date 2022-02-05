/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author haarikakatlaparthi
 */
public class Product {
    
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engine_No;
    private String seats_number;
    private String license_plates;
    private String owner_Name;
    private String owner_Telephone_numbers;
    private String owner_Email_addresses;
    private String owner_Driver_License;
    private String owner_SSN;
    private String owner_address;
    private String service_records;
    private String warranty_Year;
    private ImageIcon photo;
    private ImageIcon photo1;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String Brand) {
        this.brand = Brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String Model) {
        this.model = Model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String Year) {
        this.year = Year;
    }

    public String getEngine_No() {
        return engine_No;
    }

    public void setEngine_No(String Engine_No) {
        
        //if(Engine_No== null || Engine_No.length()==0 )
        
        this.engine_No = Engine_No;
    
    }

    public String getSeats_number() {
        return seats_number;
    }

    public void setSeats_number(String Seats_number) {
        this.seats_number = Seats_number;
    }

    public String getLicense_plates() {
        return license_plates;
    }

    public void setLicense_plates(String License_plates) {
        this.license_plates = License_plates;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void setOwner_Name(String Owner_Name) {
        this.owner_Name = Owner_Name;
    }

    public String getOwner_Telephone_numbers() {
        return owner_Telephone_numbers;
    }

    public void setOwner_Telephone_numbers(String Owner_Telephone_numbers) {
        this.owner_Telephone_numbers = Owner_Telephone_numbers;
    }

    public String getOwner_Email_addresses() {
        return owner_Email_addresses;
    }

    public void setOwner_Email_addresses(String Owner_Email_addresses) {
        this.owner_Email_addresses = Owner_Email_addresses;
    }

    public String getOwner_Driver_License() {
        return owner_Driver_License;
    }

    public void setOwner_Driver_License(String Owner_Driver_License) {
        this.owner_Driver_License = Owner_Driver_License;
    }

    public String getOwner_SSN() {
        return owner_SSN;
    }

    public void setOwner_SSN(String Owner_SSN) {
        this.owner_SSN = Owner_SSN;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String Owner_address) {
        this.owner_address = Owner_address;
    }

    public String getService_records() {
        return service_records;
    }

    public void setService_records(String Service_records) {
        this.service_records = Service_records;
    }

    public String getWarranty_Year() {
        return warranty_Year;
    }

    public void setWarranty_Year(String Warranty_Year) {
        this.warranty_Year = Warranty_Year;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon Photo) {
        this.photo = Photo;
    }
    
}

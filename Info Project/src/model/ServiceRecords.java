/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haarikakatlaparthi
 */
public class ServiceRecords {
    
    private String serviceDate;
    private double carMileage;
    private String carChangeOil;
    private String carChangeTires;
    private String carChangeOilFilter;
    private String carRotateTires;
    private String carAirFilter;
    private String otherService;
    private double totalServiceCost;

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String ServiceDate) {
        this.serviceDate = ServiceDate;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(double CarMileage) {
        this.carMileage = CarMileage;
    }

    public String getCarChangeOil() {
        return carChangeOil;
    }

    public void setCarChangeOil(String CarChangeOil) {
        this.carChangeOil = CarChangeOil;
    }

    public String getCarChangeTires() {
        return carChangeTires;
    }

    public void setCarChangeTires(String CarChangeTires) {
        this.carChangeTires = CarChangeTires;
    }

    public String getCarChangeOilFilter() {
        return carChangeOilFilter;
    }

    public void setCarChangeOilFilter(String CarChangeOilFilter) {
        this.carChangeOilFilter = CarChangeOilFilter;
    }

    public String getCarRotateTires() {
        return carRotateTires;
    }

    public void setCarRotateTires(String CarRotateTires) {
        this.carRotateTires = CarRotateTires;
    }

    public String getCarAirFilter() {
        return carAirFilter;
    }

    public void setCarAirFilter(String CarAirFilter) {
        this.carAirFilter = CarAirFilter;
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String OtherService) {
        this.otherService = OtherService;
    }

    public double getTotalServiceCost() {
        return totalServiceCost;
    }

    public void setTotalServiceCost(double TotalServiceCost) {
        this.totalServiceCost = TotalServiceCost;
    }
    
    @Override
    
    public String toString(){
        return serviceDate;
    }
}

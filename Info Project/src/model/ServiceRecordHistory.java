/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author haarikakatlaparthi
 */
public class ServiceRecordHistory {
    
    private ArrayList<ServiceRecords> history1;
     //System.out.println("")
     
    public ServiceRecordHistory(){
        
        this.history1=new ArrayList<ServiceRecords>();
        
    }

    public ArrayList<ServiceRecords> getHistory() {
        return history1;
    }

    public void setHistory(ArrayList<ServiceRecords> history) {
        this.history1 = history;
    }

    public ServiceRecords addnewRecords(){
  
      ServiceRecords newRecords= new ServiceRecords();
      history1.add(newRecords);
      return newRecords;
    }
    
    public void deleteRecords(ServiceRecords sr){
        history1.remove(sr);
    }
            
}

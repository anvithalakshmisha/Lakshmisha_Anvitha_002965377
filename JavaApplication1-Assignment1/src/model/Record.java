/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anvithalakshmisha
 */
public class Record {
    
    private ArrayList<Product> record;
    
    public Record () {
        this.record = new ArrayList<Product>();
    }

    public ArrayList<Product> getRecord() {
        return record;
    }

    public void setRecord(ArrayList<Product> record) {
        this.record = record;
    }
    
    public Product addNewRecord() {
        Product newService = new Product();
        record.add(newService);
        return newService;
    }

    public void deleteRecord(Product selectedProduct) {
        record.remove(selectedProduct);
    }
    
}

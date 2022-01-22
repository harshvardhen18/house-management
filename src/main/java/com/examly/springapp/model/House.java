package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class House {
    @Id
    @Column
    private int houseId;
    @Column
    private int houseNo;
    @Column
    private String status;
    @Column
    private String type;
    public int getHouseId() {
        return houseId;
    }
    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }
    public int getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}

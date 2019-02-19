package com.service.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable{

    @Id
    private String id;

    private String name;

    private String msisdn;

    private String nic;

    private String pinCode;

    public Customer(String id, String name, String msisdn, String nic, String pinCode) {
        this.id = id;
        this.name = name;
        this.msisdn = msisdn;
        this.nic = nic;
        this.pinCode = pinCode;
    }

    public Customer() {
    }

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

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}

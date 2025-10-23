package com.juanboterojuangaleano.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider extends Person{

    @Column(name = "name_company", nullable = false)
    private String nameCompany;

    @Column(nullable = false, unique = true)  //unique??
    private String number;

    public Provider(long id, String name, String nameCompany, String number) {
        super(id, name);
        this.nameCompany = nameCompany;
        this.number = number;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Provider [nameCompany=" + nameCompany + ", number=" + number + ", toString()=" + super.toString() + "]";
    }

}

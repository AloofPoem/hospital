package com.juanboterojuangaleano.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.juanboterojuangaleano.enums.Rol;

@Entity
@Table(name = "employee")
public class Employee extends Person{

    @Column(nullable = false)
    private Rol rol;

    public Employee(long id, String name, Rol rol) {
        super(id, name);
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Employee [rol=" + rol + ", toString()=" + super.toString() + "]";
    }
}

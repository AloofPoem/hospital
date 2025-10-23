package com.juanboterojuangaleano.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.juanboterojuangaleano.enums.EquipmentStatus;
import com.juanboterojuangaleano.enums.TypeEquipment;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type_equipment")
    private TypeEquipment typeEquipment;

    @Column(name = "cod_qr")
    private CodQR codQr;

    @OneToMany(mappedBy = "equipment", cascade = {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Registration> registration;

    @Column(name = "equipment_status", nullable = false)
    private EquipmentStatus equipmentStatus;

    public Equipment(long id, TypeEquipment typeEquipment, CodQR codQr, EquipmentStatus equipmentStatus) {
        this.id = id;
        this.typeEquipment = typeEquipment;
        this.codQr = codQr;
        this.equipmentStatus = equipmentStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeEquipment getTypeEquipment() {
        return typeEquipment;
    }

    public void setTypeEquipment(TypeEquipment typeEquipment) {
        this.typeEquipment = typeEquipment;
    }

    public CodQR getCodQr() {
        return codQr;
    }

    public void setCodQr(CodQR codQr) {
        this.codQr = codQr;
    }

    public List<Registration> getRegistration() {
        return registration;
    }

    public void setRegistration(List<Registration> registration) {
        this.registration = registration;
    }

    public EquipmentStatus getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(EquipmentStatus equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    @Override
    public String toString() {
        return "Equipment [id=" + id + ", typeEquipment=" + typeEquipment + ", codQr=" + codQr + ", registration="
                + registration + ", equipmentStatus=" + equipmentStatus + "]";
    }

    
}

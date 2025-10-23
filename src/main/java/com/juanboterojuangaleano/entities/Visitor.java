package com.juanboterojuangaleano.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "visitor")
public class Visitor extends Person {

    @Column(name = "visit_reason", nullable = false)
    private String visitReason;

    public Visitor(long id, String name, String visitReason) {
        super(id, name);
        this.visitReason = visitReason;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    @Override
    public String toString() {
        return "Visitor [visitReason=" + visitReason + ", toString()=" + super.toString() + "]";
    }


}

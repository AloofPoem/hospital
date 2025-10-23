package com.juanboterojuangaleano.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.juanboterojuangaleano.enums.Status;

@Entity
@Table(name = "registration")
public class Registration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "time_get_in", nullable = false)
    private LocalDateTime timeGetIn;

    @Column(name = "time_get_out", nullable = true)
    private LocalDateTime timeGetOut;

    @Column(nullable = false)
    private Status status;

    public Registration(long id, LocalDateTime timeGetIn, LocalDateTime timeGetOut, Status status) {
        this.id = id;
        this.timeGetIn = timeGetIn;
        this.timeGetOut = timeGetOut;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTimeGetIn() {
        return timeGetIn;
    }

    public void setTimeGetIn(LocalDateTime timeGetIn) {
        this.timeGetIn = timeGetIn;
    }

    public LocalDateTime getTimeGetOut() {
        return timeGetOut;
    }

    public void setTimeGetOut(LocalDateTime timeGetOut) {
        this.timeGetOut = timeGetOut;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registration [id=" + id + ", timeGetIn=" + timeGetIn + ", timeGetOut=" + timeGetOut + ", status="
                + status + "]";
    }

}

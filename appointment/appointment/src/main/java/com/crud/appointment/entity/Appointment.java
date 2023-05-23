package com.crud.appointment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="APPOINTMENT_TBL")
public class Appointment implements Serializable {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String date;
    private String description;
}

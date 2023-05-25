package com.crud.appointment.controller;


import com.crud.appointment.entity.Appointment;
import com.crud.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/appointment")
    public Appointment addAppointment(@RequestBody Appointment appointment){
        return service.saveAppointment(appointment);
    }

    @GetMapping("/appointments")
    public List<Appointment> findAllAppointments() {


        System.out.println("HE");

        return service.getAppointments();
    }

    @GetMapping("/appointment/{id}")
    public Appointment findAppointmentById(@PathVariable int id) {
        return service.getAppointmentById(id);
    }

    @PutMapping("/update")
    public Appointment updateProduct(@RequestBody Appointment appointment) {
        return service.updateAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable int id) {
        return service.deleteAppointment(id);
    }







}

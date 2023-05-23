package com.crud.appointment.service;

import com.crud.appointment.entity.Appointment;
import com.crud.appointment.repository.AppointmentRepository;
//import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public Appointment saveAppointment(Appointment appointment){

        return repository.save(appointment);

    }
    public List<Appointment> getAppointments() {
        return repository.findAll();
    }

    public Appointment getAppointmentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteAppointment(int id) {
        repository.deleteById(id);
        return "Appointment removed !! " + id;
    }

    public Appointment updateAppointment(Appointment appointment) {
        Appointment existingAppointment = repository.findById(appointment.getId()).orElse(null);
        existingAppointment.setName(appointment.getName());
        existingAppointment.setDate(appointment.getDate());
        existingAppointment.setDescription(appointment.getDescription());
        return repository.save(existingAppointment);
    }

}

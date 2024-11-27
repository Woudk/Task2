package org.colleg.practice2.task2;

import java.util.ArrayList;
import java.util.List;
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    private static Hospital instance;

    private Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public static Hospital getInstance(String name) {
        if (instance == null) {
            instance = new Hospital(name);
        }
        return instance;
    }

    public boolean addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            return true;
        }
        return false;
    }

    public boolean removeDoctor(Doctor doctor) {
        return doctors.remove(doctor);
    }

    public Doctor getDoctor(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(name)) {
                return doctor;
            }
        }
        return null;
    }

    public int getDoctorCount() {
        return doctors.size();
    }

    public boolean addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            return true;
        }
        return false;
    }

    public boolean removePatient(Patient patient) {
        return patients.remove(patient);
    }

    public Patient getPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null;
    }

    public int getPatientCount() {
        return patients.size();
    }

    public String Hospital() {
        return "Назва лікарні: " + name + ", кількість лікарів: " + getDoctorCount() + ", кількість пацієнтів: " + getPatientCount();
    }
}


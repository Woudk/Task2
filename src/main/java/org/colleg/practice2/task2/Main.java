package org.colleg.practice2.task2;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance("Центральна лікарня");

        Doctor doctor1 = new Doctor("Dr. Smith", "Хірург", 10);
        Doctor doctor2 = new Doctor("Dr. Johnson", "Кардіолог", 15);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Patient patient1 = new Patient("John Doe", 35, "Грип");
        Patient patient2 = new Patient("Jane Roe", 28, "Мігрень");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        System.out.println(hospital.Hospital());
        System.out.println(doctor1.Doctor());
        System.out.println(doctor2.Doctor());
        System.out.println(patient1.Patient());
        System.out.println(patient2.Patient());
    }
}
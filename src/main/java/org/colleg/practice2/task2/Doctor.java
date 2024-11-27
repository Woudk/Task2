package org.colleg.practice2.task2;


class Doctor {
    private String name;
    private String specialization;
    private int yearsExperience;

    public Doctor(String name, String specialization, int yearsExperience) {
        this.name = name;
        this.specialization = specialization;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public String Doctor() {
        return "Ім'я доктора: " + name + ", спеціалізація: " + specialization + ", досвід: " + yearsExperience + " років";
    }
}


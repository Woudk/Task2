package org.colleg.practice2.task2;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String Patient() {
        return "Ім'я пацієнта: " + name + ", вік: " + age + ", діагноз: " + disease;
    }
}

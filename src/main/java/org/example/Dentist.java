package org.example;

public class Dentist extends Doctor {
    public Dentist(String name) {
        this.name = name;
    }

    // Лечение дантиста
    @Override
    public void heal(Patient person) {
        if (person.doctor == null)
            System.out.println(person.name + " у вас не назначен лечащий врач, обратитесь к Терапевту");
        else {
            if (person.doctor == "Прием у дантиста")
                System.out.println(person.name + " вылечен кариес");
        }
    }
}

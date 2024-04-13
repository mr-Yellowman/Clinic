package org.example;

public class Therapist extends Doctor {

    public Therapist(String name) {
        this.name = name;
    }

    // Лечение терапевта
    @Override
    public void heal(Patient person) {
        if (person.doctor == null)
            System.out.println(person.name + " у вас не назначен лечащий врач, обратитесь к Терапевту");
        else {
            if (person.doctor == "Прием у терапевта")
                System.out.println(person.name + " выдано направление в другую больницу");
        }
    }

    // Направление к врачу и проведение лечения
    public void healOrder(Patient person, Therapist doc1, Surgeon doc2, Dentist doc3) {
        switch (person.planHeal) {
            case 1:
                System.out.println(person.name + " вам назначен прием к хирургу " + doc2.name);
                person.doctor = "Прием у хирурга";
                doc2.heal(person);
                person.doctor = null;
                break;
            case 2:
                System.out.println(person.name + " вам назначен прием к дантисту " + doc3.name);
                person.doctor = "Прием у дантиста";
                doc3.heal(person);
                person.doctor = null;
                break;
            default:
                System.out.println(person.name + " вам назначен прием к терапевту " + doc1.name);
                person.doctor = "Прием у терапевта";
                doc1.heal(person);
                person.doctor = null;
        }
    }
}

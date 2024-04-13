package org.example;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        this.name = name;
    }

    // Лечение хирурга
    @Override
    public void heal(Patient person) {
        if (person.doctor == null)
            System.out.println(person.name + " у вас не назначен лечащий врач, обратитесь к Терапевту");
        else {
            if (person.doctor == "Прием у хирурга")
                System.out.println(person.name + " проведена ампутация");
        }

    }
}

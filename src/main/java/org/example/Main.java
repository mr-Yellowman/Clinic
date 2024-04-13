package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание пациентов
        Patient patient1 = new Patient("Пациент №1", 1);
        Patient patient2 = new Patient("Пациент №2", 2);
        Patient patient3 = new Patient("Пациент №3", 5);
        // Создание врачей
        Therapist therapist1 = new Therapist("Кузнецов В.А.");
        Surgeon surgeon1 = new Surgeon("Михайлов С.Г.");
        Dentist dentist1 = new Dentist("Петров И.А.");

        //выдача направления к врачу и лечение пациента №1
        therapist1.healOrder(patient1, therapist1, surgeon1, dentist1);

        //попытка получить лечение без направления к врачу
        dentist1.heal(patient2);

        //попытка повторного лечения без получения направления
        surgeon1.heal(patient1);

        //выдача направления к врачу и лечение пациентов №3 и №2
        therapist1.healOrder(patient3, therapist1, surgeon1, dentist1);
        therapist1.healOrder(patient2, therapist1, surgeon1, dentist1);

    }
}

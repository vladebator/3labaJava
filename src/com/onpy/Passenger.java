package com.onpy;

import java.util.Scanner;

public class Passenger {
    String passSurname;			    // Фамилия пассажира
    String passName;				// Имя пассажира
    String passPatronymic;		    // Отчество пассажира
    int numberFlight = 1;			// Номер рейса
    int numberBaggage;				// Номер багажной квитанции
    int quantityBaggage;			// Количество мест багажа
    double weightBaggage;			// Суммарный вес багажа пассажира

    Scanner scan = new Scanner(System.in);

    public void setPassSurname(String passSurname) {
        this.passSurname = this.passSurname;
    }

    public String getPassSurname() {
        return passSurname;
    }

    public void setPassName(String passName) {
        this.passName = this.passName;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassPatronymic(String passPatronymic) {
        this.passPatronymic = this.passPatronymic;
    }

    public String getPassPatronymic() {
        return passPatronymic;
    }

    public void setNumberFlight(int numberFlight) {
        this.numberFlight = numberFlight;
    }

    public int getNumberFlight() {
        return (int) numberFlight;
    }

    public void setWeightBaggage(double weightBaggage) {
        this.weightBaggage = weightBaggage;
    }

    public double getWeightBaggage() {
        return (double) weightBaggage;
    }

    public void setQuantityBaggage(int quantityBaggage) {

        if (quantityBaggage > 2 || quantityBaggage < 0)
        {
            int trueQuantityBaggage = 0;
            System.out.println("Некорректное значение. Количество мест багажа может быть равно от 0 до 2.");
            System.out.print("Введите количество багажа: ");
            trueQuantityBaggage = scan.nextInt();
        }
        this.quantityBaggage = quantityBaggage;
    }

    public int getQuantityBaggage() {
        return (int) quantityBaggage;
    }
}


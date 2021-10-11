package com.onpy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод исходных данных о пассажирах.");
        System.out.println("Укажите количество пассажиров: ");
        Scanner in = null;
        int numberPassengers = scan.nextInt();
        int countBaggageNumber = 0;
        int k = 0;
        Passenger[] passenger = new Passenger[numberPassengers];

        if (numberPassengers <= 0) {
            System.out.println("[Ошибка] Вы ввели отрицательное число!");
            return;
        } else {
            for (int i = k; i < numberPassengers; i++) {
                System.out.print("Введите фамилию пассажира: ");
                passenger[i].setPassSurname(scan.nextLine());

                System.out.print("Введите имя пассажира: ");
                passenger[i].setPassName(scan.nextLine());

                System.out.print("Введите отчество пассажира: ");
                passenger[i].setPassPatronymic(scan.nextLine());

                System.out.print("Проиведён автоматический расчёт номера багажной квитанции. ");
                passenger[i].numberBaggage = countBaggageNumber + 1;

                System.out.print("Введите вес багажа: ");
                passenger[i].setWeightBaggage(scan.nextDouble());

                System.out.print("Введите количество мест багажа: ");
                passenger[i].setWeightBaggage(scan.nextInt());
            }
        }
        System.out.println("[1] Выдача сведений о пассажирах, вес багажа которых превышает 30 кг.");
        System.out.println("[2] Выдача сведений о суммарном весе багажа всех пассажиров рейса.");
        System.out.println("[3] Выдача сведений о местонахождении багажа(номер рейса) по заданному номеру багажной квитанции.");
        System.out.println("[4] Удаление записей о пассажирах с заданной фамилией.");
        System.out.println("[5] Поиск пассажира по фамилии.");
        System.out.println("[6] Добавление сведений о пассажире.");
        System.out.println("[7] Изменение данных о пассажире.");
        System.out.println("[8] Выдача отчёта по запросу.");
        System.out.println("[9] Выход из программы");


        System.out.println("\nУкажите № функции: ");
        int way = scan.nextInt();

        if (way > 9 || way < 1) {
            System.out.println("Ошибка! Вы указали неверные № функции.");
            return;
        }
        if (way == 1) {
            System.out.println("Выдача сведений о пассажирах, вес багажа которых превышает 30 кг:");
            for (int i = 0; i < numberPassengers; i++) {
                if (passenger[i].weightBaggage > 30) {
                    System.out.println(passenger[i].passSurname);
                    System.out.println(passenger[i].passName);
                    System.out.println(passenger[i].passPatronymic);
                    System.out.println(passenger[i].numberFlight);
                    System.out.println(passenger[i].numberBaggage);
                    System.out.println(passenger[i].quantityBaggage);
                    System.out.println(passenger[i].weightBaggage);
                }
            }
        }

        if (way == 2) {
            double totalBaggageWeight = 0;
            for (int i = 0; i < numberPassengers; i++) {
                totalBaggageWeight = +passenger[i].weightBaggage;
            }
            System.out.println("Общий вес багажа на рейсе = " + totalBaggageWeight + " кг.");
        }

        if (way == 3) {
            int numberSearchBaggage = scan.nextInt();
            for (int i = 0; i < numberPassengers; i++) {
                if (numberSearchBaggage == passenger[i].numberBaggage) {
                    System.out.println("Багаж №" + numberSearchBaggage + " находится на рейсе №" + passenger[i].numberFlight);
                }
            }
        }

        if(way == 4) {
            String deleteInfoPassenger = scan.nextLine();
            for (int i = 0; i < numberPassengers; i++) {
                if(deleteInfoPassenger == passenger[i].passSurname) {
                    passenger[i].passSurname = "0";
                    passenger[i].passName = "0";
                    passenger[i].passPatronymic = "0";
                    passenger[i].numberFlight = 0;
                    passenger[i].numberBaggage = 0;
                    passenger[i].quantityBaggage = 0;
                    passenger[i].weightBaggage = 0;
                }
            }
        }

        if (way == 5) {
            System.out.println("Введите фамилию пассажира для поиска: ");
            String searchSurnamePassenger = scan.nextLine();
            for (int i = 0; i < numberPassengers; i++) {
                if (searchSurnamePassenger == passenger[i].passSurname) {
                    System.out.println(passenger[i].passSurname);
                    System.out.println(passenger[i].passName);
                    System.out.println(passenger[i].passPatronymic);
                    System.out.println(passenger[i].numberFlight);
                }
            }
        }
        if (way == 6) {
                k = numberPassengers;
                numberPassengers++;
            for (int i = k; i < numberPassengers; i++) {
                System.out.print("Введите фамилию пассажира: ");
                passenger[i].setPassSurname(scan.nextLine());
                System.out.print("Введите имя пассажира: ");
                passenger[i].setPassName(scan.nextLine());
                System.out.print("Введите отчество пассажира: ");
                passenger[i].setPassPatronymic(scan.nextLine());
                System.out.print("Проиведён автоматический расчёт номера багажной квитанции. ");
                passenger[i].numberBaggage = countBaggageNumber + 1;
                System.out.print("Введите вес багажа: ");
                passenger[i].setWeightBaggage(scan.nextDouble());
                System.out.print("Введите количество мест багажа: ");
                passenger[i].setWeightBaggage(scan.nextInt());
            }

        }

        if (way == 7) {
            System.out.println("Укажите номер пассажира для которого хотите изменить данные: ");
            int editInfoPassenger = scan.nextInt();

            for (int i = editInfoPassenger; i < editInfoPassenger + 1; i++) {
                System.out.print("Введите фамилию пассажира: ");
                passenger[i].setPassSurname(scan.nextLine());
                System.out.print("Введите имя пассажира: ");
                passenger[i].setPassName(scan.nextLine());
                System.out.print("Введите отчество пассажира: ");
                passenger[i].setPassPatronymic(scan.nextLine());
                System.out.print("Проиведён автоматический расчёт номера багажной квитанции. ");
                passenger[i].numberBaggage = countBaggageNumber + 1;
                System.out.print("Введите вес багажа: ");
                passenger[i].setWeightBaggage(scan.nextDouble());
                System.out.print("Введите количество мест багажа: ");
                passenger[i].setWeightBaggage(scan.nextInt());
            }
        }

        if (way == 8) {
            System.out.println("[ 1 ] Найти пассажира по номеру багажной квитанции.");
            System.out.println("[ 2 ] Найти пассажира по фамилии.");
            System.out.println("[ 3 ] Найти всех пассажиров на рейсе.");
            int number_report = scan.nextInt();
            if (number_report == 1) {
                System.out.println("Введите номер багажной квитанции для поиска: ");
                int baggageSearch = scan.nextInt();
                for (int i = 0; i < numberPassengers; i++) {
                    if (baggageSearch == passenger[i].numberBaggage) {
                        System.out.println("Багаж №" + baggageSearch + " пренадлежит пассажиру: " + passenger[i].passSurname + " " + passenger[i].passName + " " + passenger[i].passPatronymic);
                    }
                }
            }
            if (number_report == 2) {
                System.out.println("Введите фамилию пассажира для поиска: ");
                String searchSurnamePassenger = scan.nextLine();
                for (int i = 0; i < numberPassengers; i++) {
                    if (searchSurnamePassenger == passenger[i].passSurname) {
                        System.out.println("Пассажир " + passenger[i].passSurname + " " + passenger[i].passName + " " + passenger[i].passPatronymic + " находится на рейсе №" + passenger[i].numberFlight);
                    } else {
                        System.out.println("Нет пассажира с такой фамилией!");
                        return;
                    }
                }
            }
            if (number_report == 3) {
                System.out.println("Введите номер рейса для поиска: ");
                int searchFlight = scan.nextInt();
                int countPassengerInFlight = 0;
                for (int i = 0; i < numberPassengers; i++) {
                    if(searchFlight == passenger[i].numberFlight) {
                        countPassengerInFlight++;
                    }
                }
                System.out.println("На рейсе №" + searchFlight + " находится " + countPassengerInFlight + " пассажиров.");
            }
        }
        if (way == 9) {
            System.out.println("Вы вышли из программы.");
            return;
        }
    }
}
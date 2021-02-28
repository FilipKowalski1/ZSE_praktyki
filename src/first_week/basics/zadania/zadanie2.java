package first_week.basics.zadania;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        System.out.println("Zadanie 1");

        Scanner zad1 = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = zad1.nextInt();

        if (x > 0){
            System.out.println("Twoja liczba jest większa od 0");
        }
        else {
            System.out.println("Twoja liczba jest mniejsza od 0");
        }

        System.out.println("Zadanie 2");

        Scanner zad2 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = zad2.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = zad2.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = zad2.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Największa liczba to: " + a);
            }
        }
        if (a < b){
            if (c < b){
                System.out.println("Największa liczba to: " + b);
            }
        }
        if (a > b){
            if (a < c){
                System.out.println("Największa liczba to: " + c);
            }
        }

        System.out.println("Zadanie 3");

        Scanner zad3 = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = zad3.next();
        System.out.println("Podaj hasło: ");
        String hasło = zad3.next();

        if (login.equals("admin")){
            if (hasło.equals("tajnehaslo")){
                System.out.println("Zalogowano pomyślnie :D");
            }
            else{
                System.out.println("Niezautoryzowany użytkownik ");
            }
        }
        else{
            System.out.println("Niezautoryzowany użytkownik ");
        }

        System.out.println("Zadanie 4");

        Scanner zad4 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int MyintA = zad4.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int MyintB = zad4.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int MyintC = zad4.nextInt();
        if (MyintA > MyintB) {
            if (MyintB > MyintC) {
                System.out.println("Kolejność malejąca");
            }
        }
        if (MyintA < MyintB){
            if (MyintB < MyintC){
                System.out.println("Kolejność rosnąca");
            }
        }
        if (MyintA > MyintB){
            if (MyintB < MyintC){
                System.out.println("Brak kolejności");
            }
        }
        else {
            System.out.println("Brak kolejności");
        }

        System.out.println("Zadanie 5");

        Scanner zad5 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double MyIntX = zad5.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double MyIntY = zad5.nextDouble();
        System.out.println("Podaj swój wybór (+,- ,* ,/): ");
        char wybor = zad5.next().charAt(0);

        switch (wybor){
            case '+':
                double sum = MyIntX + MyIntY;
                System.out.println("Dodawanie równa sie: " + sum);
                break;
            case '-':
                double odejm = MyIntX - MyIntY;
                System.out.println("Odejmowanie równa się: " + odejm);
                break;
            case '*':
                double mnoz = MyIntX * MyIntY;
                System.out.println("Mnożenie równa się: " + mnoz);
                break;
            case '/':
                double dziel = MyIntX / MyIntY;
                System.out.println("Dzielenie równa się: " + dziel);
                break;
        }

    }
}

package first_week.statements.lekcja;

import java.util.Scanner;

public class statements {

    /* postać instrukcji warunkowej if:


    if (warunek) {
        Zrobcos1
        Zrobcos2
        ...
        ZrobcosX
    }
    else{
    ZrobCosinnego1
    ZrobCosinnego2
    ...
    ZrobCosinnegoX
    }

    */


    /*


    if (warunek) {
        Zrobcos1
        Zrobcos2
        ...
        ZrobcosX
    }
    else{
    ZrobCosinnego1
    ZrobCosinnego2
    ...
    ZrobCosinnegoX
    }

    */

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);


//        boolean stan = false;
//
//        if(stan){
//            System.out.println("Wykonała się instrukcja IF.");
//        }
//        else{
//            System.out.println("Wykonała się instrukcja ELSE");
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek: ");
//        int wiek = skaner.nextInt();
//
//        if(wiek >= 18){
//            System.out.println("Jesteś pełnoletni");
//        }
//        else{
//            System.out.println("Jesteś niepełnoletni");
//        }

//        System.out.println("Podaj liczbę: ");
//        int liczba = skaner.nextInt();
//        if(10 < liczba && liczba < 20){
//            System.out.println("Liczba mieści się w zakresie. ");
//        }
//        else{
//            System.out.println("Liczba nie mieści się w zakresie");
//        }

//        System.out.println("Podaj liczbę całkowitą A: ");
//        int a = skaner.nextInt();
//
//        System.out.println("Podaj liczbę całkowitą B: ");
//        int b = skaner.nextInt();
//
//        if(a > b){
//            System.out.println("A jest większa od B");
//        }
//
//        if(a < b){
//            System.out.println("A jest mniejsze od B");
//        }
//        if(a == b){
//            System.out.println("A jest równe B");
//        }
//
//
//        if(a > b){
//            System.out.println("A jest większa od B");
//        }
//        else{
//            if (a < b){
//                System.out.println("A jest mniejsze od B");
//            } else (a == b){
//                System.out.println("A jest równe B");
//            }



//         char charA = 'A';
//         char charB = 'B';
//
//         if (charA > charB){
//             System.out.println("charA ma większąwartość od charB w tabeli ASCI");
//         }
//         else{
//             System.out.println("charA ma mniejszą wartość od charB w tabeli ASCI");
//         }

//         String hello = "hello";
//         String world = "world";
//
//         if(hello.equals(world)){
//             System.out.println("Hello jest równe World");
//         }
//         else{
//             System.out.println("Hello nie jest równe world");
//         }

//        System.out.println("Podaj swój wybór (1,2,A,B): ");
//        char z = skaner.next().charAt(0);
//
//        switch (z){
//            case '1':
//                System.out.println("Przypadek 1");
//                break;
//            case '2':
//                System.out.println("Przypadek 2");
//                break;
//            case 'A':
//                System.out.println("Przypadek A");
//                break;
//            case 'B':
//                System.out.println("Przypadek B");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji");
//        }

        System.out.println("Podaj swój wybór (1,2,A,B): ");
        char z = skaner.next().charAt(0);

        switch (z){
            case '1':
                System.out.println("Przypadek 1");
            case '2':
                System.out.println("Przypadek 2");
            case 'A':
                System.out.println("Przypadek A");
            case 'B':
                System.out.println("Przypadek B");
            default:
                System.out.println("Nie wybrano poprawnej opcji");
        }



    }

}

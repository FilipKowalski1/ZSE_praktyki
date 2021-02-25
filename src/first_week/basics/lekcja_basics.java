package first_week.basics;

public class lekcja_basics {

    //metoda główna
    public static void main(String[] args) {


        //liczby całkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Wynik dodawania: " + sum );

        //odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Wynik odejmowania: " + sum );

        //mnożenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Wynik mnożenia: " + sum);

        //dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2: " + sum );

        sum = myIntC / 2;
        System.out.println("Dzielenie C = 77 przez 2: " + sum );

        // float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;

        sumDouble = myDoubleA * myDoubleB;
        System.out.println(sumDouble);




        // znaki ( characters )
        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';
        System.out.println("Moja ulubiona literka to: " + myCharA);
        System.out.println("Moj ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to: "+ sumChar);

        // string ciagi znaków slowa i wyrazy
        String myStringA = "Filip";
        String myStringB = "Lubie naleśniki";
        String myStringC = " z czekoladą";

        System.out.println(myStringA + "      " +  myStringB + myStringC);

        //boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);




    }


}

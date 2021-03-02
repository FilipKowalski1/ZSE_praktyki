package second_week.loops;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ZadaniaTablice {

    public static void main(String[] args) {

        System.out.println("Zadanie 1");

        char[] charArray = {'b', 'c', 'd', 'a', 'e', 'g', 'f', 'i', 'j', 'k', 'm', 'n', 'h', 'l'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie rosnąco: " + Arrays.toString(charArray));



        System.out.println("Zadanie 2");

        String[] stringArray = {"lubie", "jesc", "duzo", "slodyczy", "i", "hamburgerow"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));



        System.out.println("Zadanie 3");

        Integer[] intArray_1 = {1, 2, 3};
        Random rand = new Random();

        int rand_int1 = rand.nextInt(2) +1;

        String[] stringArrayy = {"Stefan", "Wladyslaw", "Marceli"};
        System.out.print("Imię dla psa to: ");
        System.out.println(stringArrayy[rand_int1]);



        System.out.println("Zadanie 4");

        Integer[] intArray_2 = {1, 2, 3};
        Integer[] intArray_3 = {1, 2, 3};
        Integer[] intArray_4 = {1, 2, 3};
        Random rand_1 = new Random();

        int rand_int2 = rand_1.nextInt(2) +1;
        int rand_int3 = rand_1.nextInt(2) +1;
        int rand_int4 = rand_1.nextInt(2) +1;

        String[] stringArray_0 = {"Bulke z dzemem", "Parowki", "Fasolke"};
        System.out.print("Na śniadanie zjem: ");
        System.out.print(stringArray_0[rand_int2]);
        String[] stringArrays_1 = {"Pizze", "Makaron", "Rosół"};
        System.out.print(", Na obiad zjem: ");
        System.out.print(stringArrays_1[rand_int3]);
        String[] stringArrays_2 = {"Kanapki", "Kebaba", "Kurczaka"};
        System.out.print(",Na kolację zjem: ");
        System.out.println(stringArrays_2[rand_int4]);



        System.out.println("Zadanie 5");

        Integer[] intArray_5 = {5, 12, 14, 10, 7, 6, 9, 11, 1, 3, 8, 2, 4, 20, 17, 16, 13, 15, 19, 18};

        Arrays.sort(intArray_5, 0, 10, Collections.reverseOrder());
        Arrays.sort(intArray_5, 9, 20);
        System.out.print("Tablica: "+ Arrays.toString(intArray_5));

    }
}



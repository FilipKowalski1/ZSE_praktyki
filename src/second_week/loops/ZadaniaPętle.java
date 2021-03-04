package second_week.loops;

public class ZadaniaPętle {
    public static void main(String[] args) {


                System.out.println("Zadanie 1");

                for (int liczba1 = 0; liczba1 < 20; liczba1 += 2) {
                    System.out.println(liczba1);
                }
                System.out.println("\n");



                System.out.println("Zadanie 2");

                for (int liczba2 = 30; liczba2 > 0; liczba2 -= 3) {
                    System.out.println(liczba2);
                }
                System.out.println("\n");



                System.out.println("Zadanie 3");

                for (int i = 1; i < 11; i++){
                    System.out.println(i + " Przejście pętli");
                    for(int j = 1; j < 11; j++){
                        System.out.println("[i:"+ i + "]"+"[j:"+ j +"]\t" + i +" * " + j + " = " + i * j +"\t");
                        if ((i*j)%2==0){
                            System.out.println("Liczba jest parzysta");
                        }

                        else{
                            System.out.println("Liczba jest nieparzysta");
                        }

                    }
                }
                System.out.println("\n");




                System.out.println("Zadanie 4");

                for (int liczba3=-40; liczba3 <= 40;liczba3++){
                    if (liczba3 % 4 == 0){
                        System.out.println(liczba3);
                    }
                }
                System.out.println("\n");




                System.out.println("Zadanie 5");

                int liczba5 = 0;
                while (liczba5 < 20){
                    System.out.println(liczba5);
                    liczba5 +=2;
                }


                int liczba6 = 30;
                do{
                    System.out.println(liczba6);
                    liczba6 -= 3;
                }while(liczba6 > 0);



                
            }

        }
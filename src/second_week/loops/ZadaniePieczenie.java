package second_week.loops;

public class ZadaniePieczenie {

    interface Piekacz {
        void pieczenieciastek();

        void pieczeniechleba();
    }

    interface Grill {
        void grillowaniekurczaka();
    }

    public static class Piec implements Piekacz, Grill {

        private int czas;
        private int temperatura;

        @Override
        public void pieczenieciastek() {
            czas = 45;
            temperatura = 220;
            wlacz();
        }

        @Override
        public void pieczeniechleba() {
            czas = 120;
            temperatura = 170;
            wlacz();
        }

        @Override
        public void grillowaniekurczaka() {
            czas = 100;
            temperatura = 200;
            wlacz();
        }

        private void wlacz() {
            System.out.println("Wlączamy piec i ustawiamy temperature na: " + temperatura + " stopni i czas: " + czas + "min");
        }

        public static void main(String[] args) {


            Piec piec = new Piec();

            Piekacz piekacz = piec;
            Grill grill = piec;

            piekacz.pieczeniechleba();
            piekacz.pieczenieciastek();
            grill.grillowaniekurczaka();

        }
    }
}
package pl.sda.warmup;

public class Main {

    public static void main(String[] args) {
        /*
        1. Napisz kod, ktory wypisze w konsoli prostokąt o wymiarach 5 na 6 złożony z gwiazdek (*)
        Kod powinno się dać łatwo zmodyfikować, żeby uzyskać inne wymiary prostokąta
        Przydadzą się do tego:
        Metody System.out.print i System.out.println
        pętla for lub while
        2. Napisany kod przenieś do metody o sygnaturze:
        public static void printRect(int w, int h)
        gdzie argumenty w i h to kolejno szerokość i wysokość prostokąta do narysowania
        3. Napisz kod, który wypisze w konsoli PUSTY W ŚRODKU prostokąt o wymiarach 5 na 6 złożony z gwiazdek (obwódka)
        i spacji w środku, dodatkowo przyda się do tego konstukcja "if"
        4. Napisany kod przenieś do metody o sygnaturze:
        public static void printEmptyRect(int w, int h)
        5. Czy można uprościć w myśl DRY (don't repeat yourself)
        Prostokąt o wymiarach 5 na 6 powinien wyglądać tak:

         *****
         *****
         *****
         *****
         *****
         *****
        Pusty prostokąt o wymiarach 5 na 6 powinien wyglądać tak:

         *****
         *   *
         *   *
         *   *
         *   *
         *****

         */

        int h = 10;
        int w = 10;
        printRect(w, h);
        System.out.println("-----------------");
        printChessRect(w, h);
    }

    private static void printChessRect(int w, int h) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (x == 0 || y == 0 || x == w - 1 || y == h - 1) {
                    System.out.print("*");
                } else {
                    if (x % 2 == 0 && y % 2 == 0) {
                        System.out.print(" ");
                    } else if (x % 2 != 0 && y % 2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void printRect(int w, int h) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

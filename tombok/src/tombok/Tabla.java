package tombok;

import java.util.Random;

public class Tabla {

    private char[][] T = new char[8][8];
    private char uresCella;
    Random rnd = new Random();

    public Tabla(char uresCella) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    void megjelenit() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println("");
        }
    }

    void elhelyez(int n) {
        for (int db = 0; db < n; db++) {
            int i = rnd.nextInt(0, 7);
            int j = rnd.nextInt(0, 7);
            if (T[i][j] != 'K') {
                T[i][j] = 'K';
            }
        }
    }

    void elhelyez() {
        int n = rnd.nextInt(1, 10);
        elhelyez(n);
    }

}

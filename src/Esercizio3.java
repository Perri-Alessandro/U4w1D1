import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // System.in vuol dire leggi gli input dal terminale
        System.out.println("INSEISCI IL IL LATO CORTO DEL RETTANGOLO");
        Double shorts = Double.parseDouble(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + shorts);

        System.out.println("INSEISCI IL LATO LUNGO DEL RETTANGOLO");
        Double longs = Double.parseDouble(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + longs);

        System.out.println("PERIMETRO DEL RETTANGOLO" + " " + perimetro(shorts, longs));

        System.out.println("INSEISCI UN NUMERO INTERO");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + num);

        int result = numpod(num);
        if (result == 0) {
            System.out.println("NUMERO PARI: " + result);
        } else {
            System.out.println("NUMERO DISPARI: " + result);
        }

        scanner.close();
    }
    public static double perimetro(Double shorts, Double longs) {
        return shorts + shorts + longs + longs;
        /// return 2* (shorts + longs);
    }
    public static int numpod (int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

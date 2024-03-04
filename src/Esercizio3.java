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

        System.out.println("INSERISCI IL LATO 1 PER CALCOLARE IL SEMIPERIMETRO E POI L'AREA DEL TRIANGOLO");
        double lato1 = Double.parseDouble(scanner.nextLine());
        System.out.println("HAI INSERITO 1 LATO" + " " + lato1);

        System.out.println("INSERISCI IL LATO 2 PER CALCOLARE IL SEMIPERIMETRO E POI L'AREA DEL TRIANGOLO");
        double lato2 = Double.parseDouble(scanner.nextLine());
        System.out.println("HAI INSERITO IL SECONDO LATO" + " " + lato2);

        System.out.println("INSERISCI IL LATO 3 PER CALCOLARE IL SEMIPERIMETRO E POI L'AREA DEL TRIANGOLO");
        double lato3 = Double.parseDouble(scanner.nextLine());
        System.out.println("HAI INSERITO IL TERZO LATO" + " " + lato3);

        System.out.println("AREA DEL TRIANGOLO" + " " + areaTriangolo(lato1, lato2, lato3));

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

    public  static double areaTriangolo (double lato1, double lato2, double lato3) {
double semiperimetro = (lato1 + lato2 + lato3) / 2.0;

double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
    return  area;
    }
}

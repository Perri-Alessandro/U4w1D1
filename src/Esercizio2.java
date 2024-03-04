import java.util.Scanner;
public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // System.in vuol dire leggi gli input dal terminale
        System.out.println("INSEISCI IL TUO NOME E PREMI INVIO");
        String name = scanner.nextLine(); // Aspetto il nome  e lo salverò in una variabile di tipo stringa
        System.out.println("HAI INSERITO" + " " + name);

        System.out.println("INSEISCI IL TUO COGNOME E PREMI INVIO");
        String surname = scanner.nextLine(); //
        System.out.println("HAI INSERITO" + " " + surname);

        System.out.println("INSEISCI LA TUA ETà");
        int età = Integer.parseInt(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + età);

        System.out.println("STAMPATI IN ORDINE DI INSERIMENTO" + " " + ord(name, surname, età));
        System.out.println("STAMPATI IN ORDINE INVERSO" + " " + inv(età, surname, name));

        scanner.close();
    }
    public static String ord(String name, String surname, int età) {
        return name + surname + età;
    }
    public static String inv(int età, String surname, String name) {
        return età + surname + name;
    }
}

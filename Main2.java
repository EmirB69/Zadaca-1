import java.util.*;

public class Main2 {
    public static void main(String[] args) {
    String rijec;
    int brojSlova;
    Scanner ulaz = new Scanner(System.in);

    System.out.println("Unesite string:");
    rijec = ulaz.nextLine();
    brojSlova = rijec.length();

    System.out.println("Broj karaktera u stringu: " + brojSlova);
    }
}
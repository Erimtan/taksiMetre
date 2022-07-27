import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int km;
        double perKm = 2.20;
        double total = 10;

        System.out.print("Mesafe Giriniz Km: ");
        km = input.nextInt();

        total += km * perKm;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}

import java.util.Scanner;

public class Armstrong_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak sayısı : ");
        int basamak = scanner.nextInt();
        int geçici_sayi = sayi;
        int toplam = 0;
        do {
            int basamak_degeri = geçici_sayi % 10;
            geçici_sayi = geçici_sayi / 10;
            toplam += Math.pow(basamak_degeri, basamak);


        } while (geçici_sayi > 0);
        if (sayi == toplam) {
            System.out.println("Armstrong ");

        } else {
            System.out.println("Not Armstrong");
        }
    }
}

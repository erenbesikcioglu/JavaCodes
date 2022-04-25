import java.util.Scanner;

public class ATM_Project {
    public static void main (String[]args){
        Scanner scanner =new Scanner(System.in);
        int bakiye =1000;
        String islemler = "1-Bakiye öğrenme \n"+"2-Para Cekme \n"+"3-Para yatırma\n"+"Çıkış için q'a basın";
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        while (true){
            System.out.println("İslem seçin : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("ÇIKILIYOR...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiye: "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("cekmek istediğiniz tutar : ");
                int tutar =scanner.nextInt();
                scanner.nextLine();
                if (bakiye-tutar<0){
                    System.out.println("Yeterli Bakiye yok , Bakiyeniz : "+bakiye);
                }
                else bakiye-=tutar;
                System.out.println("Yeni bakiyeniz : "+bakiye);
            }
            else if (islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiye : "+bakiye);
            }
            else{
                System.out.println("Geçersiz işlem...");
            }

        }



    }
}

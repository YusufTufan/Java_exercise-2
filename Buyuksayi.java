import java.util.Scanner;
public class Buyuksayi {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        int sayi3 = scanner.nextInt();
        
        int enBuyuk;
        enBuyuk = 0;
        if
        (sayi1 >= sayi2 && sayi1 >= sayi3){
            enBuyuk= sayi1;
        }else if(sayi2>=sayi1 && sayi2>=sayi3){
            enBuyuk= sayi2;
        }else if(sayi3>=sayi1 && sayi3>=sayi2){
            enBuyuk= sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
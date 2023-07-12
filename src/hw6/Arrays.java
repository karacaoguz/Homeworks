package hw6;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] array = new int[boyut];

        System.out.println("Dizi elemanlarını girin: ");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + " :");
            int eleman = scanner.nextInt();
            array[i] = eleman;
        }
        System.out.println();

        String islemler = "- - - Menü - - -\n"
                + "1. Dizi elemanlarını topla\n"
                + "2. Dizi elemanlarını çarp\n"
                + "3. Dizideki en büyük elemanı bul\n"
                + "4. Çıkış";

        while(true) {
            System.out.println(islemler);

            System.out.println();

            System.out.print("Seçiminizi yapın : ");
            int secim = scanner.nextInt();

            System.out.println();

            if(secim == 1) {
                int sum = 0;
                for(int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                System.out.println("Dizi elemanlarının toplamı : " + sum);
            }
            else if(secim == 2) {
                int mult = 1;
                for(int i = 0; i < array.length; i++) {
                    mult *= array[i];
                }
                System.out.println("Dizi elemanlarının çarpımı : " + mult);
            }
            else if(secim == 3) {
                int biggest = array[0];
                for(int i = 0; i < array.length; i++) {
                    if(biggest < array[i]) {
                        biggest = array[i];
                    }
                }
                System.out.println("Dizideki en büyük eleman : " + biggest);
            }
            else if(secim == 4) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else {
                System.out.println("Lütfen doğru bir değer giriniz");
            }
            System.out.println();
        }
    }
}

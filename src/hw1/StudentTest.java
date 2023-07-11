package hw1;

import java.time.Clock;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenci = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= ogrenci; i++){
            System.out.println("Öğrenci " + i);

            System.out.print("İsminizi giriniz: ");
            student.name = scanner.nextLine();


            System.out.print("Vize notu: ");
            student.midtermScore = scanner.nextInt();

            System.out.print("Final notu: ");
            student.finalScore = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Average: " + student.getAverageScore() + " - " + student.getLetterGrade());
            System.out.println("------------------------");
        }

    }
}
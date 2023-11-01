import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthDay, birthMonth;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz günü girin : ");
        birthDay = input.nextInt();

        System.out.println("Doğduğunuz ayı sayı olarak girin : ");
        birthMonth = input.nextInt();

        if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 && birthDay <= 20)) {
            System.out.println("Koç Burcu");
        } else if ((birthMonth == 4 && birthDay >= 21) || (birthMonth == 5 && birthDay <= 21)) {
            System.out.println("Boğa Burcu");
        } else if ((birthMonth == 5 && birthDay >= 22) || (birthMonth == 6 && birthDay <= 22)) {
            System.out.println("İkizler Burcu");
        } else if ((birthMonth == 6 && birthDay >= 23) || (birthMonth == 7 && birthDay <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22)) {
            System.out.println("Aslan Burcu");
        } else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22)) {
            System.out.println("Başak Burcu");
        } else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21)) {
            System.out.println("Yay Burcu");
        } else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((birthMonth == 1 && birthDay >= 22) || (birthMonth == 2 && birthDay <= 19)) {
            System.out.println("Kova Burcu");
        } else if ((birthMonth == 2 && birthDay >= 20) || (birthMonth == 3 && birthDay <= 20)) {
            System.out.println("Balık Burcu");
        } else {
            System.out.println("Geçersiz bir tarih girdiniz.");
        }
    }
}

package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        GuessNumber zgadnijLiczbę = new GuessNumber();
        System.out.println("Zgadnij liczbę z przedziału: [100 - 200]");
        zgadnijLiczbę.zgadnij();
    }

    public void zgadnij(){
        int liczbaPrawidłowa = 123;
        Scanner sc = new Scanner(System.in);
        int liczbaUżytkownika = sc.nextInt();
        boolean liczba = false;

        while (liczba == false){
            if (liczbaUżytkownika == liczbaPrawidłowa){
                System.out.println("Wygrana");
                liczba = true;
            }else if (liczbaUżytkownika < liczbaPrawidłowa){
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj kolejną liczbę: ");
                liczba = false;
                liczbaUżytkownika = sc.nextInt();
            }else if (liczbaUżytkownika > liczbaPrawidłowa){
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj kolejną liczbę: ");
                liczba = false;
                liczbaUżytkownika = sc.nextInt();
            }

        }
    }
}

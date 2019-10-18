package guessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        GuessNumber guessNum = new GuessNumber();
        System.out.println("Zgadnij liczbę z przedziału: [100 - 200]");
        guessNum.guess();
    }

    public void guess(){
        int liczbaPrawidłowa = 123;
        Scanner sc = new Scanner(System.in);
        int liczbaUżytkownika = sc.nextInt();
        boolean number = false;

        while (number == false){
            if (liczbaUżytkownika == liczbaPrawidłowa){
                System.out.println("Wygrana");
                number = true;
            }else if (liczbaUżytkownika < liczbaPrawidłowa){
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj kolejną liczbę: ");
                number = false;
                liczbaUżytkownika = sc.nextInt();
            }else if (liczbaUżytkownika > liczbaPrawidłowa){
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj kolejną liczbę: ");
                number = false;
                liczbaUżytkownika = sc.nextInt();
            }

        }
    }
}

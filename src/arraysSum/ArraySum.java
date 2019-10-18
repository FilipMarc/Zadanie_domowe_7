package arraysSum;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab01 = new int[5];
        System.out.println("Podaj kolejną liczbę: ");
        tab01[0] = sc.nextInt();
        System.out.println("Podaj kolejną liczbę: ");
        tab01[1] = sc.nextInt();
        System.out.println("Podaj kolejną liczbę: ");
        tab01[2] = sc.nextInt();
        System.out.println("Podaj kolejną liczbę: ");
        tab01[3] = sc.nextInt();
        System.out.println("Podaj kolejną liczbę: ");
        tab01[4] = sc.nextInt();

        int sum = tab01[0] + tab01[2] + tab01[4];

        System.out.println("Suma 1,3,5 wartości: " + sum);

//        while (i < tab01.length){
//            System.out.println("Podaj kolejną liczbę:");
//            tab01[i] = sc.nextInt();
//            suma += tab01[i];
//            i++;
//        }
    }
}

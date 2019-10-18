package reversal;

import java.util.Scanner;

public class ReversalGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tab01 = new String[5];

        for (int i = 0; i < tab01.length; i++) {
            System.out.println("Podaj kolejne imię: ");
            tab01[i] = sc.nextLine();
        }

        for (String tabela: tab01){
            System.out.println(tabela);
        }
        System.out.println("-------------------------------");

        String revers[] = new String[tab01.length];
        int n = tab01.length - 1;
        int j = n;
        for (int i = 0; i <=n; i++) {
            revers[i] = tab01[j];
            j--;
        }

        for (String tab: revers){
            System.out.println("Cześć: " + tab);
        }
    }
}

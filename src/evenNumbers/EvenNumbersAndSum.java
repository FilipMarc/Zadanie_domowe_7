package evenNumbers;

public class EvenNumbersAndSum {
    public static void main(String[] args) {
        EvenNumbersAndSum even = new EvenNumbersAndSum();
        System.out.println("Wypisanie liczb parzystch z przedziału od 0 - 100");
        even.printingEvenNumbers();
        System.out.println();
    }

    public void printingEvenNumbers(){
        int i = 0;
        int sum = 0;
        while (i <= 100){
            if (i%2==0){
                System.out.print(i +" ");
                sum += i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Suma liczb: " + sum);
    }
}

package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bubble = 202;
        int toffe = 118;
        int ice = 2250;
        int milkc = 1680;
        int doughnut = 1075;
        int pancake = 80;
        int all = bubble + toffe + ice + milkc + doughnut + pancake;
        System.out.println("Earned amount: ");
        System.out.println("Bubblegum: $" + bubble);
        System.out.println("Toffee: $" + toffe);
        System.out.println("Ice cream: $" + ice);
        System.out.println("Milk chocolate: $" + milkc);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
        System.out.println();
        System.out.println("Income: $" + all);

        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses: ");
        int staffexp = sc.nextInt();
        System.out.println("Other expenses: ");
        int otherexp = sc.nextInt();
        int income = all - staffexp - otherexp;
        System.out.println("Net income: $" + income);
    }
}
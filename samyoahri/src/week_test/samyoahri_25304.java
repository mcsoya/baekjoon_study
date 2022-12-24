package week_test;

import java.util.Scanner;

public class samyoahri_25304 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int total_amount = sc1.nextInt();
        int count = sc1.nextInt();
        for(int i = 0; i < count; i++){
            int price = sc1.nextInt();
            int quantity = sc1.nextInt();

            total_amount -= (price * quantity);
        }
        if (total_amount == 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

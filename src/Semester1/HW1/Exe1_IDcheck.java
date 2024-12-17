package Semester1.HW1;

import java.util.Scanner;

public class Exe1_IDcheck {
    public static boolean isValidId(int id){
        int counter  = 0;
        for (int i = 8; i >= 0; i--) {
            int num = id % 10;
            if (i % 2 == 0){
                counter += num;
            } else {
                num *= 2;
                if (num > 9){
                    counter += (num % 10) + (num / 10);
                } else counter += num;
            }
            id /= 10;
        }
        if (id > 0) return false;
        if (counter % 10 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an ID number: ");
            int id = sc.nextInt();
            System.out.println(isValidId(id));
        }
    }
}

package Semester1.Lesson3;

import java.util.Scanner;

public class forWhileExercises {
    public static void main(String[] args) {

    }
}

class Ex4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? ");
        int userIter = sc.nextInt();
        int result = 0;
        int num;
        for (int i = userIter; i > 0; i-- ){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if(num > 10){
                result++;
            }
        }
        System.out.println("This is the number: " + result);
    }

}

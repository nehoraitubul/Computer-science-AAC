package Semester1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class functions {
    public static boolean allNumAbove10(int num1, int num2, int num3){
        if (num1 > 9 && num2 > 9 && num3 > 9){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(allNumAbove10(num1, num2, num3));
    }
}

class Ex2{
    public static boolean dividedBy(int num1, int num2){
        if(num1 % num2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(dividedBy(num1, num2));

    }
}

class Ex3{
    public static boolean isTrue(int num1, int num2, int num3){
        int sum = 0;
        if (num1 > 0) sum += 1;
        if (num2 > 0) sum += 1;
        if (num3 > 0) sum += 1;
        if (sum >= 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(isTrue(num1, num2, num3));
    }
}

class Ex4{
    public static void printNumNumbers(int num){
        Random rnd = new Random();
        System.out.println("You random numbers are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(rnd.nextInt(num) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printNumNumbers(num);

    }
}

class Ex5{
    public static int printHighestNum(int num){
        Scanner sc = new Scanner(System.in);
        Integer highestNum = null;
        System.out.println("Enter " + num + " numbers: ");
        for (int i = 0; i < num; i++) {
            int num1 = sc.nextInt();
            if (highestNum != null && highestNum > num1){

            } else {
                highestNum = num1;
            }
        }
        return highestNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(printHighestNum(num));
    }
}

class Ex6{
    public static boolean isAvgGreaterThan60(int totalStudents){
        Scanner sc = new Scanner(System.in);
        int gradeSum = 0;
        System.out.println("Enter the students grades: ");
        for (int i = 0; i < totalStudents; i++) {
            gradeSum += sc.nextInt();
        }
        if (gradeSum/totalStudents > 60){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much students: ");
        int totalStudents = sc.nextInt();
        System.out.println(isAvgGreaterThan60(totalStudents));
    }
}

class Ex7{
    public static void randomNumbers(int num){
        Random rnd = new Random();
        int counter = num;
        while (counter > 0){
            int rnadomNumber = rnd.nextInt(0, 1001);
            if (rnadomNumber % num == 0){
                System.out.println(rnadomNumber);
                counter --;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        randomNumbers(num);
    }
}

class Ex8{
    public static boolean isAvgInNums(float num1, float num2, float num3, float num4){
        float avg = (num1+num2+num3+num4)/4f;
        if (avg == num1 || avg == num2 || avg == num3 || avg == num4){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        System.out.println(isAvgInNums(num1, num2, num3, num4));
    }
}

class Ex9{
    public static int highestNumber(){
        Scanner sc = new Scanner(System.in);
        int highestNum = Integer.MIN_VALUE;
        int num;
        System.out.println("Enter numbers, to stop enter 0. ");
        do {
            num = sc.nextInt();
            if (num > highestNum){
                highestNum = num;
            }
        } while (num != 0);
        return highestNum;
    }

    public static void main(String[] args) {
        System.out.println(highestNumber());
    }
}

class Ex10{
    public static void mpTable(int size){
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < size+1; j++) {
                System.out.print("\t" + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        mpTable(num);
    }
}

class Ex11{
    public static boolean isOneDigit(int num){
        if (num < 9 && num > -1){
            return true;
        }
        return false;
    }

//    public static boolean isDigitInNum(int num, int digit){
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isOneDigit = isOneDigit(num);
        if (isOneDigit){
            System.out.println("Enter 1 more number ");
            int num2 = sc.nextInt();
//            boolean y =

        }
    }
}
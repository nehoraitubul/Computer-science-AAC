package Semester1.Lesson5;


import java.util.Random;
import java.util.Scanner;

public class array {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static boolean isNumberExist(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int sumOfEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static int sumOfEvenNumbers(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isThereDuplicate(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int cuurNum = array[i];
            for (int j = i+1; j < array.length; j++) {
                int tempNum = array[j];
                if (cuurNum == tempNum){
                    return true;
                }
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[] arr = {4,5,6,7, 2,8, 8};
        int num = 1;
        printArray(arr);
        System.out.println();
        System.out.println(isNumberExist(arr, num));
        System.out.println(sumOfEven(arr));
        System.out.println(isThereDuplicate(arr));
    }
}

class Ex1{

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54,5};
        printArray(arr);
    }
}

class Ex2{

    public static int[] newArraySize(int num){
        int[] arr = new int[num];
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int[] arr = newArraySize(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

class Ex3{

    public static double[] newArray(int size, double value){
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        double value;
        System.out.println("Enter a number: ");
        size = sc.nextInt();
        System.out.println("Enter a double num: ");
        value = sc.nextDouble();

        double[] arr =  newArray(size, value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex4{

    public static int[] randomNumsInArray(int[] arr, int num){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(num);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        int num = 10;
        arr = randomNumsInArray(arr, num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex5{
    public static int[] newArray(int size, int firstNum){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = firstNum + i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 10;
        int firstNum = 7;
        int[] arr = newArray(size, firstNum);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex6{
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfArray(arr));
    }
}

class Ex7{
    public static void highestNum(int[] arr){
        int highestNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highestNum){
                highestNum = arr[i];
            }
        }
        System.out.println(highestNum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,65,6,7,8,9,10};
        highestNum(arr);
    }
}

class Ex8{
    public static int highestNum(int[] arr){
        int highestNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highestNum){
                highestNum = arr[i];
            }
        }
        return highestNum;
    }

    public static void main(String[] args) {
        int[] arr = {1,222,3,4,65,6,7,8,9,10};
        System.out.println(highestNum(arr));
    }
}

class Ex9{
    public static int doAll(int num){
        Random rnd = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > highest){
                highest = arr[i];
            }
        }
        System.out.println();
        return highest;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(doAll(num));
    }
}

class Ex10and11 {
    public static int repeatNum(int num, int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                counter++;
            }
        }
        return counter;
    }

    public static int[] arrayWithoutRepeatNum(int num, int[] arr, int size){
        int[] newArr = new int[arr.length-size];
        int integer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num){
                newArr[integer] = arr[i];
                integer++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        // EX10
        int num = 2;
        int[] arr = {4,5,6,2,2,2,4,6,2,5,2,5,2,4};
        int count = repeatNum(num, arr);

        // EX11
        int[] newArr = arrayWithoutRepeatNum(num, arr, count);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

class Ex12{
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] creatArray(int num){
        int[] arr = new int[num];
        return arr;
    }

//    public static int[] createRandomArray(int num){
//        Random rnd = new Random();
//        int[] arr = creatArray(num);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt(num*10);
//        }
//    }

    public static void main(String[] args) {

    }
}
package Semester1.Lesson6;

public class array2 {

    public static int[] arrayWithoutRepeatNum(int[] currNewArr, int[] arr, int num){
        for (int i : currNewArr) {
            if (i == num){
                return currNewArr;
            }
        }

        int[] newArr = new int[currNewArr.length+1];
        for (int i = 0; i < currNewArr.length; i++) {
               newArr[i] = currNewArr[i];
        }
        newArr[currNewArr.length] = num;
        return newArr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 1 ,8, 9, 2, 1, 3, 0, 1, 4, 7};
        int [] finaleArr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            finaleArr = arrayWithoutRepeatNum(finaleArr, arr, arr[i]);
        }
        printArray(finaleArr);
    }
}

class Ex2{
    public static boolean[] arrayIsEvenNumbers(int[] arr){
        boolean[] isEven = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                isEven[i] = true;
            }
            else {
                isEven[i] = false;
            }
        }
        return isEven;
    }

    public static void printBooleanArr(boolean[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 1 ,8, 9, 2, 1, 3, 0, 1, 4, 7, 11};
        boolean[] boolArr = arrayIsEvenNumbers(arr);
        printBooleanArr(boolArr);
    }
}

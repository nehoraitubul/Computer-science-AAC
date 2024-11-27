package Semester1.Lesson5;


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

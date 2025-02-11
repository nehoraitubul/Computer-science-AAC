package Semester1.TestPreperation;

import java.util.Arrays;

public class Exes {
    public static boolean func1(int[] array){
        if (array.length == 0){
            return false;
        }
        int diff = array[1] - array[0];
        for(int i = 0; i < array.length-1; i++){
            if ((array[i+1] - array[i]) != diff){
                return false;
            }
        }
        return true;
    }

    public static boolean func1b(int[] arr){
        if (arr.length == 0){
            return false;
        }
        int diff = arr[1] - arr[0];
        for(int i = 0; i < arr.length-1; i++){
            if ((arr[i+1] - arr[i]) != diff && ((arr[i+1] - arr[i])*-1) != diff){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {0,4,8, 4};
        System.out.println(func1b(arr));
    }
}

class Exe2{
    public static int[] func2(int[] arr1, int[] arr2, int num){
        int firstArr = 0;
        int secondArr = 0;
        for(int i = 0; i < arr1.length; i++){
            if (numberCounter(arr1[i]) == num){
                firstArr++;
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if(numberCounter(arr2[i]) == num){
                secondArr++;
            }
        }
        int[] biggest;
        int size = 0;
        if(firstArr > secondArr){
            biggest = arr1;
            size = firstArr;
        } else {
            biggest = arr2;
            size = secondArr;
        }
        int[] result = new int[size];
        int index = 0;
        for(int i = 0; i < biggest.length; i++){
            if(numberCounter(biggest[i]) == num){
                result[index] = biggest[i];
                index++;
            }
        }
        return result;
    }

    public static int numberCounter(int num){
        int counter = 0;
        while (num != 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = {44,543,12,53,6834,12,6544,123};
        int[] arr2 = {4332,76128,1,8768,6544,123};
        int[] result = func2(arr1, arr2, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Ex3{
    public static boolean isZigZagArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0){

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isZigZagPart(int[] arr, int num){
        int counter = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0){
                counter++;
                if (counter == num){
                    return true;
                }
            } else {
                counter = 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, -2, -1, 12, -2, -1};
        System.out.println(isZigZagArray(arr));
        System.out.println(isZigZagPart(arr, 3));
    }
}

class Ex4{
    public static int mostCommonNoExist(int[] arr1, int[] arr2){
        int mostCommonNum = arr1[0];
        int mostCommonCounter = 0;
        for(int i = 0; i < arr1.length; i++){
            int counter = 0;
            boolean isExist = false;
            for(int k = 0; k < arr2.length; k++){
                if(arr2[k] == arr1[i]){
                    isExist = true;
                }
            }
            if (!isExist){
                for(int j = 0; j < arr1.length; j++){
                    if(arr1[j] == arr1[i]){
                        counter++;
                    }
                }
                if(counter > mostCommonCounter){
                    mostCommonCounter = counter;
                    mostCommonNum = arr1[i];
                }
            }
        }
        return mostCommonNum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,8,3,7,1,3,6,2,7,1,6,7,1,7,8,1,2,1,5,7,7,1,1,3};
        int[] arr2 = {1,6,2};
        System.out.println(mostCommonNoExist(arr1, arr2));
    }
}

class Ex5{
    public static boolean isCoupleArray(int[] arr){
        int sum = 0;
        if(arr.length % 2 == 0 && arr.length >= 2){
            sum = arr[0] + arr[1];
        } else {
            return false;
        }
        for(int i = 0; i < arr.length; i+=2){
            if(arr[i] + arr[i+1] != sum){
                return false;
            }
        }
        return true;
    }

    public static boolean isPartCoupleArray(int[] arr){
        int sum = 0;
        if(arr.length % 2 == 0 && arr.length >= 2){
            sum = arr[0] + arr[1];
        } else {
            return false;
        }
        int counter = 0;
        for(int i = 0; i < arr.length; i+=2){
            if(arr[i] + arr[i+1] == sum){
                counter++;
            }
        }
        if(counter > arr.length/2/2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,3,12,10,5};
        System.out.println(isCoupleArray(arr));
        System.out.println(isPartCoupleArray(arr));
    }
}

class Ex6{
    public static char mostCommonCharInAraay(String[] arr){
        char mostCommonChar = arr[0].charAt(0);
        int mostCommonCounter = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                int counter = 0;
                for(int k = 0; k < arr.length; k++){
                    for(int h = 0; h < arr[k].length(); h++){
                        if(arr[i].charAt(j) == arr[k].charAt(h)){
                            counter++;
                        }
                    }
                }
                if(counter > mostCommonCounter){
                    mostCommonCounter = counter;
                    mostCommonChar = arr[i].charAt(j);
                }
            }
        }
        return mostCommonChar;
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bba", "cbbb", "cc", "abbbb", "cccccccccc"};
        System.out.println(mostCommonCharInAraay(arr));
    }
}

class Ex7{
    public static String[] reverseArray(String[] arr){
        String[] result = new String[arr.length];
        int index = 0;
        for(int i = arr.length-1; i >= 0; i--){
            result[i] = arr[index];
            index++;
        }
        return result;
    }

    public static boolean isReverseDuo(String[] arr1, String[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        String[] result = reverseArray(arr1);
        for(int i = 0; i < result.length; i++){
            if(result[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig"};
        String[] arr2 = {"fig", "date", "cherry", "banana", "apple"};
        String[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(isReverseDuo(arr, arr2));

    }
}

class Ex8{
    public static boolean isProxomityArray(int[] arr, int max){
        for(int i = 0;i < arr.length - 2; i++){
            if(Math.abs(arr[i] - arr[i+2]) > max){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,11,7,12,9,10,13,16,12,8,13,10};
        System.out.println(isProxomityArray(arr, 7));
    }
}

class Ex9{

    public static void main(String[] args) {

    }
}

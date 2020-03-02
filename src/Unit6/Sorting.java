package Unit6;

import java.util.Arrays;

public class Sorting {
    public static void selectionSort(int[] nums){
        for(int out = 0; out < nums.length; out++){
            int min = nums[out];
            int index = out;
            for (int in = out +1; in < nums.length; in++) {
                if(nums[in] < min){
                    min = nums[in];
                    index = in;
                }
            }
            int temp = min;
            nums[index] = nums[out];
            nums[out] = temp;
        }
    }
    public static void insertionSort(int[] nums){
       
    }

    public static void mergeSort(int[] nums){

    }

    public static void quickSort(int[] nums){

    }
    public static void main(String[] args) {
        int[] nums = {12,8,-3,21,27,81,-5,4,9,18,22,25,31,42,56};
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

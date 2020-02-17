package Unit6;

import java.util.ArrayList;
import java.util.Collections;

public class RecursionExamples {
    public int multiply(int a, int b){
        return (b>0)? a + multiply(a,b-1) : 0;
    }

    public static void main(String[] args) {
        RecursionExamples re = new RecursionExamples();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add((int)(Math.random()*100));
        }
        int target = (int)(Math.random()*100);
        Collections.sort(nums);
        int search = re.binarySearch(nums, target, nums.get(0), nums.get(nums.size()-1));
        System.out.println("Number to look for is " +target+ " and it is at index " + search);
    }

    public int binarySearch( ArrayList<Integer> list, int target, int low, int high){
        int mid = (low+high)/2;
        if(target == list.get(mid)){
            return mid;
        }else if (low > high){
            return -1;
        }else if(list.get(mid) > target){
            return binarySearch(list, target, low, mid-1);
        }else{
            return binarySearch(list, target, mid+1, high);
        }
    }
}

package Homework;

import java.util.Arrays;

public class Chapter9 {
    public static void main(String[] args) {
        String[] list = {"One", "Two", "Three"};
        for (String s: list) {
            s += "*";
        }
        System.out.println(Arrays.toString(list));
    }
    public int[] arraySwap(int[] input){
        if(input.length > 0){
            int t = input[0];
            input[0] = input[input.length-1];
            input[input.length-1] = t;
        }
    return input;
    }

    public void swap(int[] a, int initial, int fin) {
        int t = a[initial];
        a[initial] = a[fin];
        a[fin] = t;
    }
    public Boolean isSame(int[] vals){
        return vals[0] == vals[vals.length - 1];
    }
    public int[] fibonacci(int n){
        if(n == 0){
            return new int[]{0};
        }else if(n == 1){
            return new int[]{0,1};
        }else if(n > 1){
            int[] x = new int[n+1];
            x[0] = 0;
            x[1] = 1;
            for(int i = 2; i < x.length; i++) {
                x[i]=x[i-1]+x[i-2];
            }
        }
    return new int[0];
    }
    public boolean print2D(String[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                return i == j;
            }
        }
    return false;
    }
    public double  positiveMax(double[][] m){
        double max = 0;
        for (double[] row: m) {
            for(double d : row){
                if(d > max){
                    max = d;
                }
            }
        }
        return max;
    }
    public int sumOneD(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
    return sum;
    }
    public int[] rowSums(int[][] arr){
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sums[i] = sumOneD(arr[i]);
        }
        return sums;
    }
    public boolean isMedian(Double[] sample, double m){
        Arrays.sort(sample);
        double median;
        median = sample.length % 2 == 0 ? ((double) sample[sample.length / 2] + (double) sample[sample.length / 2 - 1]) / 2 : (double) sample[sample.length / 2];
        return m == median;
    }
    public char getRandomRPS(){
        char[] rps = {'r','r','r','p','p','p','p','p','s','s','s','s','s','s'};
        int max = 13;
        int min = 0;
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        return rps[random];
    }
}

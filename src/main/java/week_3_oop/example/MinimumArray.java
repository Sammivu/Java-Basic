package week_3_oop.class_activity_11a_arrays.example;

public class MinimumArray {

    //Java Program to return minimum array
    public static int min (int[] arr){
       //step 1: this line assumes that the array is not empty
        int min = arr[0];

     //Step 2: here we are looping over the groups
        for (int i =1; i<arr.length; i++){
     // step 3: this  line checks if the current element ar[i] being iterated
     //over in the array is less than the current minimum value
     // if the current element is smaller, it updates the value of mic to be value of the
     // current element
            if (min>arr[1]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {33,6,2,10};
        System.out.println(min(nums));
    }
}

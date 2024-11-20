

// leetcode ... (26) Duplicate from sorted array
// import java.util.Scanner;
// class Solution {
//     static int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0; // Edge case for empty array      
//         int j = 0;
//         for (int i = 1; i < nums.length; i++) {  // Start from 1 to compare with nums[0]
//             if (nums[j] != nums[i]) {
//                 nums[++j] = nums[i];  // Increment j and update its position with nums[i]
//             }
//         }
//         return j + 1;  // Return the count of unique elements
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // Call removeDuplicates and store the result
//         int newLength = removeDuplicates(arr);
//         // Output the new length
//         System.out.println("The number of unique elements is: " + newLength);
//         // Print the array up to the new length
//         System.out.println("The array after removing duplicates:");
//         for (int i = 0; i < newLength; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//leetcode .... (27) Remove element
// import java.util.Scanner;
// class Solution {
//     static int removeElement(int[] nums, int val) {
//         int j = 0;  // Pointer to track the valid elements     
//         // Loop through the array
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {  // If the current element is not equal to val
//                 nums[j] = nums[i];  // Assign it to the next position
//                 j++;  // Increment the count of valid elements
//             }
//         }
//         return j;  // j represents the new length of the array
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number you want to remove ");
//         int val = sc.nextInt();
//         System.out.println("enter the length of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter "+ n + " elemnets");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int rE = removeElement(arr, val);
//         for(int i = 0; i < rE; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//leetcode (3151) special array 
// class Solution {
//     static boolean isArraySpecial(int[] nums) {
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i] % 2 == nums[i + 1] % 2) return false;
//     }
//     return true;
// }
// public static void main(String[] args) {
//     int[] nums = {1,2,4,5};
//      System.out.println(isArraySpecial(nums));
// }
// }

//leetcode (136) Single Number
// class Solution {
//     public static int singleNumber(int[] nums) {
//         int r = 0; // Initialize result variable
//         for (int i = 0; i < nums.length; i++) {
//             r ^= nums[i]; // XOR each element with r
//         }
//         return r; // Return the unique element
//     }
//     public static void main(String[] args) {
//         int[] nums = {4, 1, 2, 1, 2}; // Example array
//         int uniqueNumber = singleNumber(nums); // Call the function
//         System.out.println("The single number is: " + uniqueNumber); // Print result
//     }
// }

//leetcode (1) two sum
// import java.util.Arrays;
// public class Solution {
//     public static int[] twoSum(int[] nums, int target) {
//         for(int i = 0 ; i < nums.length - 1; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
//     public static void main(String[] args) {
//         int[] nums = {2, 1, 3, 4, 5};
//         int target = 10;
//         int[] result = twoSum(nums, target);
//         System.out.println(Arrays.toString(result));
//     }
// }

//leetcode (35) Search Insert Postion
class Solution {
    static int searchInsert(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
}
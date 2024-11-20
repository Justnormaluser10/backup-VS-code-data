import java.util.Scanner;
class recursion{
    // RECURSION

    // (1
    // static void printIncreasing(int n){
    //   //base work
    //     if(n == 1){
    //         System.out.println(1);
    //         return;
    //     }
    //     // recursion work
    //     printIncreasing(n-1);
    //     //self work
    //     System.out.println(n);
    // }



    // (2)
    // static void printDecresing(int n){
    //     //base work 
    //     if(n == 1){ 
    //         System.out.println(1);
    //         return;
    //     }
    //     // self work
    //     System.out.println(n);
    //     // recurion work
    //     printDecresing(n-1);
    // }


    // (3)
    // static int factorial(int n){
        //base work
        // if(n == 0) return 1;
        //recursion work
        //self work
        // return n * factorial(n-1); 
    // }


    // (4)
    // static int fibbonacci(int n){
    //     //base work
    //     if(n == 0 || n == 1) return n;
    //     //recursion
    //     int prev = fibbonacci(n-1);
    //     int prevPrev = fibbonacci(n-2);
    //     //self work
    //     return prev + prevPrev;
    //                     // OR
    //     // return fibbonacci(n-1) + fibbonacci(n-2);
    // }

    // (5)
    // static int sumOfDigits(int n){
    //     //base work
    //     if(n >= 0 && n <= 9){
    //         return n;
    //     }
    //     //recursion work
    //     int ans = sumOfDigits(n/10);
    //     // self work
    //     return ans + n%10;
    //              //OR
    //     // return sumOfDigits(n/10) + n%10;
    // }

    //(6) //time complexcity is "O(q)"
    // static int power(int p,int q){ 
    //     if(q == 0) return 1;
    //     return power(p, q-1) * p;
    // }

    // (7) time complexcity is "O(log q)"
    //  better time and space complexcity than no (6)
    // static int power(int p, int q){
    //     if(q == 0) return 1;
    //     int smallPow = power(p, q/2);
    //     if(q % 2 == 0){
    //         return smallPow * smallPow;
    //     }
    //     return p * smallPow * smallPow;
    // }

    //(8)
    // static int countOfDigit(int n){
        //     if(n/10 == 0) return 1;
        //     return countOfDigit(n/10) + 1;
        // }
        
    // (9)
        // static void printMultiple(int n, int k){
        //     if(k == 1){
        //         System.out.println(n);
        //         return;  
        //     }
        //     printMultiple(n, k-1);
        //     System.out.println(n*k);
        // }
          
    // (10)
    // static int seriesSum(int n){
    //     if(n == 0) return 0;
    //     if(n % 2 == 0){
    //         return seriesSum(n-1) - n;
    //     }
    //     else{
    //         return seriesSum(n-1) + n;
    //     }
    // } 

    // (11)
    // static int gcd(int x,int y){//greatest common divisor
    //     if(y == 0) return x;
    //     return gcd(y, x%y); 
    // } 
    
    //(12)
    // static int findMax(int[] arr, int index){
    //     if(index == arr.length-1) return arr[index];
    //     int smallPrb = findMax(arr, index+1);
    //     return Math.max(arr[index], smallPrb);
    // }

    //(13)
    // static int sumOfArray(int[] arr, int index){
    //     if(index == arr.length-1) return arr[index];
    //     int smallPrb = sumOfArray(arr,index+1);
    //     return arr[index]+smallPrb;
    // }

    //(14)
    // static boolean targetFind(int[] arr,int n,int target,int index){
    //     if(target >= arr.length) return false;
    //     if(arr[index] == target) return true;
    //     return targetFind(arr,arr.length,target, index+1);
    // }

    // (15)
    // static void findIndex(int[] arr, int n, int target,int index){
    //     if(index >= arr.length) return;
    //     if(target == arr[index]){
    //         System.out.println(index);
    //     }
    //     findIndex(arr, arr.length, target, index+1);
    // }

    // (16)
    // static ArrayList<Integer> allIndices(int[] a, int n, int x, int idx){
    //     //base work
    //     if(idx >= a.length) return new ArrayList<>();
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     // self Work
    //     if(a[idx] == x){
    //         ans.add(idx);
    //     }
    //     //recursive work
    //     ArrayList<Integer> smallAns = allIndices(a, n, x, idx+1);
    //     ans.addAll(smallAns);
    //     return ans;

    // (17)
    // static String removeCharacter(String s, int idx){
    //     //base work 
    //     if(idx == s.length()) return "";
    //     //recursive work
    //     String smallAns = removeCharacter(s, idx+1);
    //     //self work
    //     char currChar = s.charAt(idx);
    //     if(currChar != 'a'){
    //         return currChar + smallAns;
    //     }
    //     else return smallAns;
    // }

    // (18)
    // static String reverseString(String s, int idx){
    //     if(idx == s.length()) return "";
    //     String smallAns = reverseString(s, idx+1);
    //     return smallAns + s.charAt(idx);
    // }

    // (19)
    // static boolean isPalindromeOrNot(String s,int l, int r){
    //     if(l >= r) return true;
    //     return (s.charAt(l) == s.charAt(r) && isPalindromeOrNot(s, l+1, r-1));
    // }

    // (20)
    // static void printSubSequences(String s, String currAns){
    //     if(s.length() == 0){
    //         System.out.println(currAns);
    //         return;
    //     }
    //     char currChar = s.charAt(0);
    //     String remainiString = s.substring(1);
    //     printSubSequences(remainiString, currAns + currChar);
    //     printSubSequences(remainiString, currAns);
    // }

    // (21)
    // static void arraySumOfSubset(int[] arr, int n, int idx, int sum){
    //     if(idx >= n){
    //         System.out.println(sum);
    //         return;
    //     }
    //     arraySumOfSubset(arr, n, idx+1, sum + arr[idx]);
    //     arraySumOfSubset(arr, n, idx+1, sum);
    // }


    // (22) Note :- 23 is better this 22 is not space optimize
    // static ArrayList<String> getSubSequence(String s){
    //     ArrayList<String> ans = new ArrayList<>();
    //     if(s.length() == 0){
    //         ans.add("");
    //         return ans;
    //     }
    //     char curr = s.charAt(0);
    //     ArrayList<String> smallAns = getSubSequence(s.substring(1));
    //     for(String ss : smallAns){
    //         ans.add(ss);
    //         ans.add(curr + ss);
    //     }
    //     return ans;
    // }

    // (23)
    // static void getSubSequenceBetter(String s, String currAns){
    //     if(s.length() == 0){
    //         System.out.println(currAns);
    //         return;
    //     }
    //     char curr = s.charAt(0);
    //     String remString = s.substring(1);
    //     getSubSequenceBetter(remString, currAns + curr);
    //     getSubSequenceBetter(remString, currAns);
    // }

    // (24)
    // static void sumOfSubSet(int[] a, int n, int idx, int sum){
    //     if(idx >= n){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sumOfSubSet(a, n, idx+1, sum + a[idx]);
    //     sumOfSubSet(a, n, idx+1, sum);
    // }

    // (25)
    // static int frog(int[] h , int n, int idx){
    //     if(idx == n-1) return 0;
    //     int op1 = frog(h, n, idx + 1) + Math.abs(h[idx + 1] -  h[idx]);
    //     if(idx == n-2) return op1;
    //     int op2 = frog(h, n, idx + 2) + Math.abs(h[idx + 2] -  h[idx]);
    //     return Math.min(op1, op2);
    // }

    // (26) Note -- any string number(example - '1') -(minus) by '0'(string  0) can be converted into integer of that string number (example :- if we ['2' - '0' = 2 then the answer of this will be 2 in integer])
    // static void combinationOldPhone(String dig,String[] kp, String res){
    //     if(dig.length() == 0){
    //         System.out.print(res + " ");
    //         return;
    //     }
    //     int currNum = dig.charAt(0) - '0';//2
    //     String currchoice = kp[currNum];//abc
    //     for(int i = 0; i < currchoice.length(); i++){
    //         combinationOldPhone(dig.substring(1), kp, res + currchoice.charAt(i));
    //     }
    // }
    // (27)
    // (28)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (1)
        // int n = sc.nextInt();
        // printIncreasing(n);

        // (2)
        // int n = sc.nextInt();
        // printDecresing(n);

        //(3)
        // int n = sc.nextInt();
        // System.out.println(factorial(n));

        //(4)
        // int n = sc.nextInt();
        // for(int i = 0; i <= n; i++){
        // System.out.println(fibbonacci(i));
        // }

        //(5)
        // int n = sc.nextInt();
        // System.out.println(sumOfDigits(n));

        // (6)
        // int p = sc.nextInt();
        // int q = sc.nextInt();
        // System.out.println(power(p, q));
               
        // (7)
        // int p = sc.nextInt();
        // int q = sc.nextInt();
        // System.out.println(power(p, q));
        
        // (8)
        // int n = sc.nextInt();
        // System.out.println(countOfDigit(n));
        
        //(9)
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // printMultiple(n, k);
        
        // (10)
        // int n = sc.nextInt();
        // System.out.println(seriesSum(n));

        // (11)
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(gcd(x, y));

        //(12)
        // int[] arr = {2,3,4,5,6};
        // System.out.println(findMax(arr,0));
        // sc.close();

        // (13)
        // int[] arr = {1,2,3,4,5};
        // System.out.println(sumOfArray(arr,0));

        // (14)
    //     int[] arr = {1,2,3,4,5};
    //     System.out.println("enter the number you want to find");
    //     int target = sc.nextInt();
    //     if(targetFind(arr,arr.length,target,0)){
    //         System.out.println("true");
    //     }
    //     else{
    //         System.out.println("false");
    //     }

    // (15)
    // int[] arr = {1,1,2,3,4,5};
    // int target = sc.nextInt();
    // findIndex(arr, arr.length, target, 0);

    // (16)
//     int[] a = {1,2,1,3,1,3,1};
//     System.out.println("enter the number you want to find");
//     int x = sc.nextInt();
//     System.out.println("array");
//     for(int i : a){
//         System.out.print(i + " ");
//     }
//     System.out.println(allIndices(a, a.length, x, 0)); 
//     }

    //(17)
    // System.out.println("enter your string");
    // String s = sc.nextLine();
    // System.out.println(removeCharacter(s,0));

    //(18) //Note "==" checks that if both thing are stored exact memory location if they are it return true 
    // ".equal()" operator check that if both content are same instead of "==" which check memory location not the content 
    // System.out.println("enter your string u want to reverse");
    // String s = sc.nextLine();
    // String reverse = reverseString(s, 0);
    // if(reverse.equals(s)){
    //     System.out.println("palindrome");
    // }
    // else{
    //     System.out.println("not palindrome");
    // }

    //(19)
    // System.out.println("enter your string to check is your string palindrom or not");
    // String s = sc.nextLine();
    // System.out.println(isPalindromeOrNot(s, 0, s.length()-1));

    //(20)
    // System.out.println("enter the strings subSequence you want");
    // String s = sc.nextLine();
    // printSubSequences(s, "");
    
    //(21)
    // int[] arr = {2,4,5};
    // arraySumOfSubset(arr, arr.length, 0, 0);

    //(22)
    // ArrayList<String> ans = getSubSequence("abc");
    // for(String ss : ans){
    //     System.out.println(ss);
    // }

    //(23) space complexity is O(n2)
    // getSubSequenceBetter("abc", "");

    //(24)
    // int[] a = {2,4,5};
    // sumOfSubSet(a, a.length, 0, 0);

    //(25)
    // int[] h = {10,30,40,20};
    // System.out.println(frog(h, h.length, 0));

    //(26)
    // String dig = "23";
    // String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    // combinationOldPhone(dig, kp, "");

    //(27)
    //(28)
    sc.close();
    }
}

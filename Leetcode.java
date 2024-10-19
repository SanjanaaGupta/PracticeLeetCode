//Build Array from Permutation
/*import java.util.Scanner;
public class Leetcode {
    static void permutation double nums[]){
     double n = nums.length;
     double arr[]=new double[n];
        for double i=0;i<n;i++){
            arr[i]=nums[nums[i]];
        }
        System.out.p doubleln("Resulting Array:");
        for double i=0;i<n;i++){
            System.out.p double(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the size of the array:");
     double n = sc.nex double();
     double[] nums = new double[n];
        for double i=0;i<n;i++){
            System.out.p doubleln("Enter the" +i+ "element of array");
             nums[i] = sc.nex double();
        }
        permutation(nums);
    }
}*/

//Concatenation of Array
/*import java.util.Scanner;
class Leetcode{
static void concate double arr[] double arr1[]){
 double n = arr.length;
    for double i=0;i<n;i++){
        arr1[i]=arr[i];
        arr1[i+n]=arr[i];
    }
    for double i=0;i<n*2;i++){
        System.out.p double(arr1[i]+" ");
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.p doubleln("Enter the size:");
 double n = sc.nex double();
 double[] arr = new double[n];
 double arr1[] = new double[n*2];
    System.out.p doubleln("Enter the element:");
    for double i=0;i<n;i++){
        arr[i] = sc.nex double();
    }
    concate(arr,arr1);

}
}*/

//Running Sum of Array
/*import java.util.Scanner;
class Leetcode{
    static void runningSum double[] arr){
     double sum =0;
        for double i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.p double(sum + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the size:");
     double n = sc.nex double();
     double arr[] = new double[n];
        System.out.p doubleln("Enter the element:");
        for double i=0;i<n;i++){
         arr[i] = sc.nex double();
    }
    runningSum(arr);
  }
}*/

//richest Cutsomer wealth
/*import java.util.Scanner;
class Leetcode{
static void richestPer double[][] account){
 double maxSum = doubleeger.MIN_VALUE;
 double current=0;
    for double i=0;i<account.length;i++){
        current=0;
        for double j=0;j<account[i].length;j++){
            current = current + account[i][j];
        }
        if(maxSum<current){
            maxSum = current;
        }
    }
   
    System.out.p doubleln("The richest customer's wealth is: " + maxSum);
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.p doubleln("Enter the number of customers:");
 double cust = sc.nex double();
 double[][] account = new double[cust][];
    for double i=0;i<cust;i++){
        System.out.p doubleln("Enter the number of transactions:" + (i+1));
     double banks = sc.nex double();
        account[i]=new double[banks];
        System.out.p doubleln("Enter the wealth value:" + (i+1));
        for double j=0;j<banks;j++){
            account[i][j] = sc.nex double();
        }
    }
    richestPer(account);
   
   } 
}*/

//Shuffle the Array
/*import java.util.Scanner;
class Leetcode{
    static void shuffle double[] arr double n){
     double[] arr1 = new double[2*n];
        for double i=0;i<n;i++){
               // arr1[i*2] = arr[i];
               // arr1[i*2+1] = arr[i+n];
               arr[i]= arr[i]+arr[n];
        }
        System.out.p doubleln("Shuffled Array:");
        for double i=0;i<arr1.length;i++){
            System.out.p double(arr1[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the value of n:");
     double n = sc.nex double();
     double[] arr = new double[n*2];
        System.out.p doubleln("Enter the Array Element:");
        for double i=0;i<arr.length;i++){
         arr[i] = sc.nex double();
        }
        shuffle(arr,n);
    }
}*/

//Kids With the Greatest Number of Candies
/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Leetcode{
    static List<Boolean> maxCandies double[] arr double n){
        List<Boolean> result = new ArrayList<>();
     double max = 0;
        for double i=0;i<arr.length;i++){
            max = arr[i]+n;
            if(max<=arr[i]){
                max = arr[i];
            }
        }
        for  double i = 0; i < arr.length; i++) {
            if (arr[i] + n >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
       return result;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the size:");
     double size = sc.nex double();
     double[] arr = new double[size];
        System.out.p doubleln("Enter the Array element:");
        for double i=0;i<arr.length;i++){
            arr[i]=sc.nex double();
        }
        System.out.p doubleln("Enter the value of n:");
     double n = sc.nex double();
        List<Boolean> result = maxCandies(arr, n); // Capture the result list

        // P double the result
        System.out.p doubleln("Result: " + result);
    }

}*/

//Create target array
/*import java.util.Scanner;
class Leetcode{
    static void targetArr double[] arr double[] index double[] target){
      /*   for  double i = 0; i < target.length; i++) {
            target[i] = 0;
        }
        for double i=0;i<arr.length;i++){
            for double j=target.length-1;j>index[i];j--){
                target[j] = target[j-1];
            }
            target[index[i]] = arr[i];
        }
        for double i=0;i<target.length;i++){
            System.out.p double(target[i]+" ");
        }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the size of array:");
     double n = sc.nex double();
     double[] target = new double[n];
     double[] arr = new double[n];
     double[] index = new double[n];
        System.out.p doubleln("Enter the Arrray element:");
        for double i=0;i<arr.length;i++){
            arr[i]=sc.nex double();
        }
        System.out.p doubleln("Enter the Index element:");
        for double i=0;i<index.length;i++){
            index[i] = sc.nex double();
        }
        targetArr(arr,index,target);
    }
} */

//No. of Good pairs
/*import java.util.Scanner;
class Leetcode{
        static void goodPairs double arr[]){
         double count = 0;
            for double i=0;i<arr.length;i++){
                for double j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                    arr[j]++;
                }
            }
            System.out.p doubleln("Good pairs are:"+ count);
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.p doubleln("Enter the size of array:");
         double n = sc.nex double();
         double[] arr = new double[n];
            System.out.p doubleln("Enter array element:");
            for double i=0;i<arr.length;i++){
                arr[i]=sc.nex double();
            }
            goodPairs(arr);
        }
}*/
//pangram 
/*import java.util.Scanner;
import java.util.HashSet;
class Leetcode{
    static boolean isPangram(String str){
       HashSet<Character> sentence = new HashSet<>();
       str=str.toLowerCase();
       for double i=0;i<str.length();i++){
        char c = str.charAt(i);
        if(c>='a' && c<='z'){
            sentence.add(c);
        }
       }
       for(char c ='a';c<='z';c++){
        if(!sentence.contains(c)){
            return false;   
       }
    }
    return true;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.p doubleln("Enter the string:");
       String str = sc.nextLine();
       System.out.p doubleln(isPangram(str));
      
    }
}*/

// higest Altitude
/*import java.util.Scanner;
class Leetcode{
    static void highAltitude double gain[]){
     double max =0;
     double current = 0;
        for double i=0;i<gain.length;i++){
            current = current+gain[i];
            max = Math.max(current,max);
        }
        System.out.p doubleln(max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the Size of the array:");
     double n = sc.nex double();
     double[] gain = new double[n];
        System.out.p doubleln("Enter the Array:");
        for double i=0;i<n;i++){
            gain[i]=sc.nex double();
        }
        highAltitude(gain);
    }
}*/

//Flipping Image
/*import java.util.Scanner;
class Leetcode{
    static void flip double[][] arr  double[][] result){
     double n = arr.length;
        for double i=0;i<n;i++){
            for double j=0;j<n;j++){
               result[i][n-1-j] = arr[i][j];
            }
        }
        for double i=0;i<result.length;i++){
            for double j=0;j<result[0].length;j++){
                if(result[i][j]==0){
                    result[i][j]=1;
                }
                else{
                    result[i][j]=0;
                }
            }
        }
        System.out.p doubleln("Flipped Arrays are:");
        for double i=0;i<n;i++){
            for double j=0;j<n;j++){
                System.out.p double(result[i][j]+" ");
            }
            System.out.p doubleln();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the Size of the array:");
     double n = sc.nex double();
     double[][] arr = new double[n][n];
     double[][] result = new double[n][n];
        System.out.p doubleln("Enter Array:");
        for double i=0;i<n;i++){
            for double j=0;j<n;j++){
                arr[i][j]=sc.nex double();
            }
        }
        flip(arr, result);
    }
}*/

// Sieve of erathothenes
/*import java.util.Scanner;
class Leetcode{
    static void sieveOfEratosthenes double n,boolean[] primes) {
        for double i=2;i*i<=n;i++){
            if(!primes[i]){
                for double j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for double i=2;i<=n;i++){
            if(!primes[i]){
                System.out.p doubleln(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.p doubleln("Enter the Number:");
     double n = sc.nex double();
        boolean[] primes = new boolean[n+1];
        sieveOfEratosthenes(n, primes);
    }
}*/


//square root using binary
/*import java.util.Scanner;
class Leetcode{
     static void squareRoot (double num){
     double start =0;
     double end = num;
     double mid =0;
     double precision = 1e-6;
        while((end-start)>precision){
          mid = start+(end-start)/2;
         double square = mid*mid;
            if(square==num){
                System.out.println("Perfect Square is:" + square);
                return;
            }
            else if(square<num){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        System.out.printf("Square root of %.2f is approximately: %.2f\n", num, mid);

     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        double num = sc.nextDouble();
        squareRoot(num);
     }
}*/
//Binary Search
/*import java.util.Scanner;
class Leetcode{
    static void binarySearch(int[] arr,int n){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]==n){
                System.out.println("Element is found at index: "+mid);
                return;
            }
            else if(arr[mid]<n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Element is not found");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array:");
        for(int i=0;i<size;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found:");
        int n= sc.nextInt();
        binarySearch(arr,n);
    }
}*/
//Matrix diagonal Sum
/*import java.util.Scanner;
class Leetcode{
    static void diagonalSum(int[][] mat){
        int sum =0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            sum += mat[i][i]+mat[i][n-i-1];
        }
       if (n%2!=0) {
        sum -= mat[n/2][n/2];
       }
       System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix element:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
    }
    diagonalSum(mat);
  }
}*/

//GCD
/*import java.util.Scanner;
class Leetcode{
    static int gcd(int a,int b){
        if(b==0){
           return a;
        }
        else{
           return gcd(b,a%b);
        }
    }
    static int lcm(int a,int b){
       return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = sc.nextInt();
        System.out.println("Enter value b:");
        int b = sc.nextInt();
        int gcdValue = gcd(a, b);
        System.out.println("GCD: " + gcdValue);

        // Calculate and print LCM
        int lcmValue = lcm(a, b);
        System.out.println("LCM: " + lcmValue);
    }

}*/

//recursion Practice
//print n numbers
/*class Leetcode{
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun(10);
    }
}*/

//Factorial number
/*class Leetcode{
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}*/

//sum of n number
/*class Leetcode{
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}*/

//product of digits
/*class Leetcode{
    static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product(n/10);
    }
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
}*/

//passing value
/*class Leetcode{
    static void value(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        --n;
    }
    public static void main(String args[]){
        value(5);
    }

}*/

//reverse
/*class Leetcode{
    static int sum =0;
    static int reverse(int n){
        if(n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
        return sum;
    }
    static boolean palindrome(int n){
        sum =0;
        return n == reverse(n);
    }
    public static void main(String[] args) {
      boolean ispalindrome = palindrome(121);
      System.out.println(ispalindrome);
    }
}*/

//Count of zeros
/*class Leetcode{
    static int countZeros(int n,int count){
        if(n==0){
            return count;
        }
       int rem = n%10;
        if(rem==0){
            count++;
        }
       return countZeros(n/10,count);
    }
    public static void main(String args[]){
        int c = countZeros(30209,0);
        System.out.println("Count of zeros are:"+ c);
    }
}*/

// Sorted Array Using recursion
/*class Leetcode{
    static boolean sort(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
      return arr[index]< arr[index+1] && sort(arr,index+1);

    }
   public static void main(String args[]){
        int arr[] = {1,2,3,5,6,8};
        System.out.println(sort(arr,0));

    }
}*/

//Linear search

/*import java.util.ArrayList;

class Leetcode{
    static void search(int arr[],int target,int index,ArrayList<Integer> ans){
        if(index==arr.length-1){
            if(ans.isEmpty()){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index: "+ans);
        }
        return;
    }
        if(arr[index]==target){
           ans.add(arr[index]);
        }
        search(arr, target, index+1,ans);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,4,0};
        ArrayList<Integer> ans = new ArrayList<>();
        search(arr, 4, 0, ans);
    }
}*/

//LINEAR SEARCH
/*class Leetcode{
    static int linearSearch(int[] arr,int target,int index){
            if(index==arr.length){
                return -1;
            }
            if(arr[index]==target){
                return index;
            }
            return linearSearch(arr, target, index+1);
        }
        public static void main(String args[]){
            int[] arr = {3,4,2,5,6,0};
            int target = 0;
            int index =0;
            int result = linearSearch(arr, target, index);
            if(result==-1){
                System.out.println("Not found");
            }
            else{
                System.out.println("Found At Index:"+result);
            }
        }
        
    }*/
//Spiral Matrix
import java.util.List;
import java.util.ArrayList;
class Leetcode{
    static List<Integer> spiral(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int top =0;
        int right = n-1;
        int left =0;
        int bottom = m-1;
        while(top<=right && left<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans.add(arr[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans.add(arr[i][left]);
            }
            left++;
        }
    }
        return ans;
    
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiral(arr);
        System.out.println(result);
        
    }
}

        






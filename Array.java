 import java.sql.SQLOutput;
 import java.util.*;
public class Array {
      void multiArray() {
        int[][] arr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 12}};

          System.out.println(arr1[0][1]);
          System.out.println(arr1[1][2]);
          System.out.println(arr1[1][4]);
    }
    void indexOfArray(){
          int arr[] ={10,20,40,50};
          Scanner sc = new Scanner(System.in);
        System.out.println("element which is to be find:");
          int x = sc.nextInt();
          int ans = -1;
          for(int i=0;i<arr.length;i++){
              if(arr[i]==x) {
                   ans = i;
                  break;
              }
          }
        System.out.println("index found at" + ans);
    }
     void sumOfArray(){
          int arr[] ={1,4,5,6};
          int sum =0;
          for (int i=0;i<arr.length;i++){
              sum = sum +arr[i];

          }
        System.out.println (sum);
    }
    static void calMax(){
          int[] arr = {5,8,6,2,9};
          int ans = 0;
          for (int i=0;i<arr.length;i++){
              if (arr[i]>ans){
                  ans = arr[i];
              }
          }
        System.out.println(ans);
    }
    static void userInput(){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
        int[] arr = new int[n];
         for (int i = 0;i<arr.length;i++){
             System.out.println("Enter the elemnts of array: "+ i);
             arr[i] = sc.nextInt();
         }

         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
    }

//    static void printArray(int[] arr){
//          for (int i=0;i<arr.length;i++){
//              System.out.print(arr[i]+" ");
//          }
//        System.out.println("");
//
//    }

    static int countX(int x,int[] arr){
         int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static void lastOcurrence(int []arr,int x){
          int count =-1;
          for (int i=0;i<arr.length;i++){
              if(arr[i] == x){
                  count = i;
              }
          }
        System.out.println(count);
    }
    static void greaterValue(int[] arr ,int x){
          int count = 0;
          for (int i=0;i<arr.length;i++){
              if (arr[i] > x){
                  count++;
              }
          }
        System.out.println(count);
    }
    static boolean sortedArray(int [] arr){
          boolean check =true;
          for (int i=1;i<arr.length;i++){
              if(arr[i]<arr[i-1]){
                  check = false;
              }
          }
          return check;
    }

    static int[] smalllestAndLargest(int[] arr){
               Arrays.sort(arr);
               int [] ans= {arr[0],arr[arr.length-1]};

               return ans;
    }

    static int pairSum(int []arr,int target){
          int ans = 0;
          for (int i=0;i<arr.length;i++){
              for (int j=i+1;j<arr.length;j++){
                  if (arr[i]+arr[j] == target){
                      ans++;
                  }
              }
          }
        return ans;
    }

    static int tripletsSum(int[] arr,int target){
          int count =0 ;

          for (int i =0;i<arr.length;i++){
              for (int  j=i+1;j<arr.length;j++){
                  for(int k =j+1;k<arr.length;k++){
                      if (arr[i] + arr[j] + arr[k] == target) {
                          count++;
                      }
                  }
              }
          }
          return count;
    }

    static int uniqueNu(int[] arr){
          for (int i=0;i<arr.length;i++){
              for (int j=i+1;j<arr.length;j++){
                  if (arr[i] == arr[j]){
                      arr[i] =-1;
                      arr[j] =-1;
                  }
              }
          }
          int ans=-1;
          for (int i=0;i<arr.length;i++){
              if (arr[i]>0){
                  ans = arr[i];
              }
          }
          return ans;
    }
    static int findMax(int[] arr){
          int mx =Integer.MIN_VALUE;
          for (int i =0;i<arr.length;i++){
              if (arr[i]>mx){
                  mx = arr[i];
              }
          }
          return mx;
    }
    static int findSecondMax(int [] arr){
          int mx = findMax(arr);

          for (int i =0;i<arr.length;i++){
              if (arr[i] == mx){
                  arr[i] = Integer.MIN_VALUE;
              }
          }
          int secondMax = findMax(arr);
          return secondMax;
    }
    static int findThirdMax(int[] arr){
          int mx = findSecondMax(arr);

        for (int i =0;i<arr.length;i++){
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int thirdMax = findMax(arr);
        return thirdMax;
    }
    static int repeatedValue(int[] arr){
//          int val =0 ;
          for (int i=0;i<arr.length;i++){
              for (int j =i+1;j<arr.length;j++) {
                  if (arr[i] == arr[j]) {
                      return arr[i];
                  }
              }
          }
          return -1 ;
    }
    static void swapVal(int a,int b){
          int temp = a;
          a = b;
          b = temp;

        System.out.println(a);
        System.out.println(b);
    }
    static void swapBySum(int a,int b){
          a=a+b;
          b=a-b;
          a=a-b;
        System.out.println("swap value of a"+a);
        System.out.println("swap value of b"+b);
    }
    static void reverseArray(int [] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            //ans[j++] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        //int i=n-1,j=0
        //while(i>=0){
        // ans(j++) = arr(i--);
    //}
        //return ans;
    }
    static void swapInArray(int [] arr,int i,int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
    }
    static  void reverseArrayBySwap(int[] arr){
          int i=0,j =arr.length-1;
          while(i<j){
              swapInArray(arr,i,j);
              i++;
              j--;
          }
    }
    static void printArray(int[] arr){
          for (int i=0;i<arr.length;i++){
              System.out.print(arr[i]+ " ");
          }
    }
    static void swapArray(int[] arr,int i,int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
    }
    static int[] rotateByArray(int[] arr,int k ){
            int n = arr.length;
            int j = 0;
            k=k % n;
            int[] ans = new int[n];

            for (int i=n-k;i<n;i++){
                ans[j++] = arr[i];
            }

            for (int i=0;i<n-k;i++){
                ans[j++]=arr[i];
            }
            return ans;
    }
    static int[] rotateArrayK(int[] arr,int k){
          int j=0;
          int n = arr.length;
          k = k % n;
//        System.out.println(k);
          int[] ans = new int[arr.length];

          for (int i=arr.length - k; i < n; i++){
              ans[j++] = arr[i];
          }
          for (int i=0;i<arr.length-k;i++){
              ans[j++] = arr[i];
          }
          return ans;
    }

    static void reverseArray1(int[] arr , int i , int j ){
        while (i < j) {
            swapArray(arr , i , j);
            i++;
            j--;
        }
    }
    static void rotateArrayBySwap(int[] arr , int k){
          int n = arr.length;
          k = k % n ;
           reverseArray1(arr , 0 , n-k-1);
           reverseArray1(arr , n-k , n-1);
           reverseArray1(arr, 0 , n-1);
    }
    static int[] freqArray(int[] arr ){
          int[] freq = new int[100000];
          for (int i = 0 ; i < arr.length ; i++){
              freq[arr[i]] ++;
          }
          return freq;
    }
    //Two Pointer Approach
    static int[] sort_0_1(int[] arr){
          int n = arr.length;
          int count_0 = 0;
          int count_1 = 0;
          for(int i = 0 ; i < n ; i++){
              if (arr[i] == 0){
                  count_0 ++ ;
              }
              if (arr[i] == 1){
                  count_1 ++ ;
              }
          }
          for (int i = 0 ; i < count_0 ; i++){
              arr[i] = 0 ;
          }
          for (int i = count_0 ; i < n ; i++ ){
              arr[i] = 1;
          }
          return arr ;
    }
    static void swaplr(int[] arr ,int i, int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
    }
    static int[] pointersApproach(int[] arr){
          int n = arr.length;
           int i = 0;
           int j = n-1;
           while(i<j) {
               if (arr[i] == 1 && arr[j] == 0) {
                   swaplr(arr, i, j);
                   i++;
                   j--;
               }
               if (arr[i] == 0) {
                   i++;
               }
               if (arr[j] == 1) {
                   j--;
               }
           }

           return arr;
    }

    static int[] evenIntegers(int[] arr){
          int n = arr.length;
          int i = 0;
          int j = n-1;
          while(i<j){

              if (arr[i]%2 == 1 && arr[j]%2 == 0){
                  swaplr(arr,i,j);
                  i++;
                  j--;
              }
              if (arr[i]%2 == 0){
                  i++;
              }
              if (arr[j]%2 == 1){
                  j--;
              }
          }
          return arr;
    }
    static void swaping(int[] arr){
          int n = arr.length;
          int i = 0;
          int j = n-1;
           while (i<j){
               swaplr(arr,i,j);
               i++;
               j--;
           }

    }


    static int[] squareArray(int[] arr){
           int n = arr.length;
           int k = 0;
           int[] ans = new int[n];
           int left = 0, right = n-1;

           while (left<=right){
               if (Math.abs(arr[left])>Math.abs(arr[right])){
                   ans[k++] = arr[left] * arr[left];
                   left++;
               }
               else {
                   ans[k++] = arr[right] * arr[right];
                   right--;
               }
           }

             return ans;
    }
    static int[] prefArray(int[] arr){
          int n = arr.length;
          int sum = 0;
          for(int i = 0 ; i<n ; i++){
              sum += arr[i];
              arr[i] = sum;
          }
          return arr;
    }
    static int[] makePrefixSumArray(int[] arr){
          for (int i = 1 ; i<arr.length ; i++){
              arr[i] += arr[i-1];
          }
          return arr;
    }
    static int[] makeSufffixArray(int[] arr){
          int n = arr.length;
          for (int i = n-2; i>=0; i--){
              arr[i] += arr[i+1];
          }
          return arr;
    }
    static int findArraySum(int[] arr) {
          int totalSum = 0;
          for (int i = 0; i<arr.length; i++){
              totalSum += arr[i];
          }
          return totalSum;
    }
    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i<arr.length; i++){
            prefSum += arr[i];

            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
//    static int findDuplicateNo(int[] arr){
//          int n = arr.length;
//          int mid = arr.length/2;
//          Arrays.binarySearch(arr,)
//                  Integer.MIN_VALUE
//    }
    static int thirdLargestNo(int[] arr) {
        int mx = Integer.MIN_VALUE;
        int j = 2;
        while (j-- > 0){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
    }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;

    }

    public static void fibonacciSeries(int n){
          int firstNo = 0;
          int secondNo = 1;
          for (int i = 1; i < n; i++){
              System.out.println(firstNo);
              int nextterm = firstNo + secondNo;
              firstNo = secondNo;
              secondNo = nextterm;

          }
    }

    public static void main(String[] args) {
//       int[] ages=new int[size];
//      int[] ages={--------};
        int n = 10;
        fibonacciSeries(n);

        //2-D Array
//        int[][] Ages = {{10,20,30},{20,30,40}};
//
//        System.out.println(Ages[0][0]);
//        demoArrays();
//        Pw p1 = new Pw();
//        p1.multiArray();
//        p1.sumofArray();
//        p1.calMax();
//        p1.indexOfArray();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//         for (int i = 0;i<arr.length;i++){
//             System.out.println("Enter the elemnts of array: "+ i);
//             arr[i] = sc.nextInt();
//         }
//
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//
//         }
//        userInput();
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//
////        System.out.println("array");
//        System.out.println("Original array");
//        printArray(arr);
//
////        int[] arr_2 = arr.clone();
////        int[] arr_2 = Arrays.copyOf(arr,arr.length);
//        int [] arr_2 = Arrays.copyOfRange(arr,2,3);
//        System.out.println("Copied Array");
//        printArray(arr_2);

        // changing some values of new arr_2
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//
//        System.out.println("original array after changing arr_2");
//        printArray(arr);
//
//        System.out.println("copied array after changing arr_2");
//        printArray(arr_2);
//        int arr[] = {5,6,5,1,5};
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of Array: ");
//        int n = sc.nextInt();
//        int[] arr =new int[n];
//
//        System.out.println("Enter values of Array:");
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the value which is to be count:");
//        int x = sc.nextInt();
//        System.out.println("the value of x is present "+ countX(x,arr) +" times.");
//        System.out.println("enter the size of array:");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("enter elemnts of array:");
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value which last occureence to be find:");
//        int x =sc.nextInt();
//
//        System.out.println();
//
//        lastOcurrence(arr,x);

//        System.out.println("Enter the size of array:");
//        int n = sc.nextInt();   //taking user input for size of array
//
//        int[] arr = new int[n]; //creating new array
//
//        System.out.println("Enter the elements of array:");
//        //now  we are taking user input for array
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }

//        System.out.println("enter the value of x:");
//        int x = sc.nextInt();
//
//        System.out.println("the number of value which is greater than x are ");

//        greaterValue(arr,x);
//        System.out.println("to check the array is sorted or not:"+sortedArray(arr));
//        int[] ans =smalllestAndLargest(arr);
//        System.out.println("smallest"+ans[0]);
//        System.out.println("smallest"+ans[1]);

        //Target sum problems


//        System.out.println("enter the target value :");
//        int target = sc.nextInt();

//        System.out.println(pairSum(arr,target));

//        System.out.println(tripletsSum(arr,target));

        //Array Manipulation
//        System.out.println("unique element");
//        System.out.println(uniqueNu(arr));

//        System.out.println("Second max element "+findSecondMax(arr));

//        System.out.println(repeatedValue(arr));
//        System.out.println("value of a:");
//        int a = sc.nextInt();
//
//        System.out.println("value of b:");
//        int b = sc.nextInt();

//        swapVal(a,b);
//        swapBySum(a,b);
//        reverseArray(arr);
//        reverseArrayBySwap(arr);
//        printArray(arr);
//        System.out.println("Enter the value of k:");
//        int k= sc.nextInt();
//        System.out.println(" ");
//        printArray(arr);
//
//        int[] ans = rotateByArray(arr,k);
//        System.out.println();
//        System.out.println("Array after resolution");
//        printArray(ans);

//        rotateByArray(arr,k);
//        System.out.println("enter value of k");
//        int k  = sc.nextInt();
//
//        int[] ans = rotateArrayK(arr,k);
//        printArray(ans);
//        System.out.println("Enter the value of k :") ;
//        int k = sc.nextInt() ;
//
//        rotateArrayBySwap(arr , k) ;
//        printArray(arr);
//        int[] freq = freqArray(arr);
//
//        System.out.println("Enter the value of q");
//        int q = sc.nextInt();
//        while(q>0){
//            System.out.println("Enter the value t be searched");
//            int x = sc.nextInt();
//
//            if (freq[x]>0){
//                System.out.println("yes");
//            }
//            else {
//                System.out.println("NO");
//            }
//            q--;
//        }

        // Two oointer
//        sort_0_1(arr);
//        printArray(arr);
//        pointersApproach(arr);
//        System.out.println("Sorted Array:");
//        printArray(arr);
//        System.out.println("Enter the size of array ");
//        int n = sc.nextInt();
//
//        int[] arr =new int[n+1];
//
//        System.out.println("Enter the elements of array");
//        for (int i =1;i<=n;i++){
//            arr[i] = sc.nextInt();
//        }
//        pointersApproach(arr);
//        evenIntegers(arr);
//        squareArray(arr);
//         int[] ans =  squareArray(arr);
//        swaping(ans);
//
//        printArray(ans);
//        prefArray(arr);
//        makePrefixSumArray(arr);
//        printArray(arr);

//        int[] prefSum = makePrefixSumArray(arr);
//        printArray(prefSum);
//        System.out.println("");
//
//        System.out.println("Enter number of queries ");
//        int q = sc.nextInt();
//
//        while(q-- > 0){
//            System.out.println("Enter range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = prefSum[r]-prefSum[l-1];
//
//             System.out.println("Sum" + ans);
//        }
//        printArray(arr);
//        System.out.println("Enter the value of size of an array ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the value of elements ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

//        makePrefixSumArray(arr);
//        printArray(arr);
//        makeSufffixArray(arr);
//        printArray(arr);

//        System.out.println("equal partition "+equalSumPartition(arr));
//        int k = Integer.MIN_VALUE;
//        System.out.println(k);

//        System.out.println( findThirdMax(arr));
//        int[] arr = {1,2,3,4,5};
//        System.out.println("Elements of array");
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        int mx = Integer.MIN_VALUE;
//        int q = 2;
//        for(int j=1;j<=2;j++)
//
//        while (q-->0) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > mx) {
//                    mx = arr[i];
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == mx) {
//                    arr[i] = Integer.MIN_VALUE;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > mx) {
//                mx = arr[i];
//            }
//        }
//        System.out.println(mx

//        int[] arr = {1,2,3,4,5,6,7};
//        int k = 3;
//        int[] arr_1 = rotateArrayK(arr,k);
//        printArray(arr_1);


        }

}

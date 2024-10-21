 import java.util.Scanner;

public class MultiDimensionalArray {
    // printing an array
    static void printMatrix(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < arr.length; i++){ //row
            for (int j = 0; j < arr.length; j++){ //column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // taking user input of an array
    static void userInput(int[][] arr,int r,int c){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    // Adding two matrix
    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }
    // Multiplication of two matrix
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (c1 != r2){
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1 ; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++){
                    mul[i][j] = (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printMatrix(mul);
    }
    // Transpose of a matrix
    static int[][] findTranspose(int[][] arr, int r, int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void transposeInPlace(int[][] arr, int r, int c){ //Only for Square matrix
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] arr,int n){
        transposeInPlace(arr,n,n);

        for (int i = 0; i < n; i++){
            reverseArray(arr[i]);
        }
    }
    // Pascal's Triangle
    static int[][] pascalOnly(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++){
            // ith row has i+1 columns
            ans[i] = new int[i+1];
            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    //Transpose of a matrix
    static int[][] transposeOfAMatrix(int[][] arr, int r, int c){
        int[][] arr_1 = new int[c][r];

        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
               arr_1[i][j] =  arr[j][i];
            }
        }
        return arr_1;
    }
    static void inPlace(int[][] matrix, int r, int c){
        for (int i = 0; i < r; i++){
            for (int j = i; j < c; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    //reverse ans array
    static void reverseArray1(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    //Rotate matrix
    static void rotateMatrix(int[][] matrix, int n){
        //transpose matrix
        inPlace(matrix,n,n);

        //reverse array
        for (int i = 0; i < n; i++){
            reverseArray1(matrix[i]);
        }
    }
    //Pascal triangle
    static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++){
            ans[i] = new int[i+1];

            ans[i][0] = ans[i][i] = 1;
            for (int j = 0; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    //spiral MAtrix
    static void spiralMatrix(int[][] matrix, int r, int c){
         int topRow = 0, bottomRow = r-1,leftCol = 0, rightCol = c-1;
         int totalElements = 0;


         while(totalElements < r * c){
             //topRow -> leftCol to rightCol
             for (int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                 System.out.print(matrix[topRow][j]+" ");
                 totalElements++;
             }
             topRow++;

             //rightCol -> topRow to bottomRow
             for (int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                 System.out.print(matrix[i][rightCol]+" ");
                 totalElements++;
             }
             rightCol--;

             //bottomRow -> rightCol to leftCol
             for (int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                 System.out.print(matrix[bottomRow][j]+" ");
                 totalElements++;
             }
             bottomRow--;

             //leftCol -> bottomRow to topRow
             for (int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                 System.out.print(matrix[i][leftCol]+" ");
                 totalElements++;
             }
             leftCol++;
         }
    }
    //Spiral matrix
    static void spiralMatrix_1(int[][] matrix, int r, int c){
        int tr = 0, br = r-1, lc = 0, rc = c-1;
        int totalElements = 0;

        while (totalElements < r * c){
            for (int j = lc; j <= rc && totalElements < r * c; j++){
                System.out.print(matrix[tr][j]+ " ");
                totalElements++;
            }
            tr++;
            for (int i = tr; i <= br && totalElements < r * c; i++){
                System.out.print(matrix[i][rc]+ " ");
                totalElements++;
            }
            rc--;
            for (int j = rc; j >= lc && totalElements < r * c; j--){
                System.out.print(matrix[br][j]+" ");
                totalElements++;
            }
            br--;
            for (int i = br; i >= tr && totalElements < r * c; i--){
                System.out.print(matrix[i][lc]+" ");
                totalElements++;
            }
            lc++;
        }
    }
    //generate a matrix of n*n matrix  spiral order
    static int[][] spiralMatrixGenerated(int n){
        int[][] ans = new int[n][n];
        int tr = 0, br = n-1, lc = 0, rc = n-1;

        int count = 1;
        while(count <= n * n ){
            //top row
            for (int j = lc; j <= rc ; j++){
                ans[tr][j] = count;
                count++;
            }
            tr++;
            //right column
            for (int i = tr; i <= br ; i++){
                ans[i][rc] = count;
                count++;
            }
            rc--;
            //bottom row
            for (int j = rc; j >= lc ; j--){
                ans[br][j] = count;
                count++;
            }
            br--;
            //left column
            for (int i = br; i >= tr; i--){
                ans[i][lc] = count;
                count++;
            }
            lc++;

        }
        return ans;
    }
    //PREFIX SUM PROBLEM

    //Burte force approach

    static int findSum(int[][] matrix,int l1, int r1, int l2, int r2){
        int sum = 0;

        for (int i = l1; i <= l2; i++){
            for (int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    //Pre-calculating the horizontal sum for each row in matrix


    




    public static void main(String[] args) {
        //How to initialize 2D Array
//        int[][] array_name = new int[rows][columns];
//        int[][] arr = {{1,5,6},{7,8,9},{8,1,1}};
//        printArray(arr);

        Scanner sc = new Scanner(System.in);  // making object
//
//        System.out.println("Enter number of rows : ");
//        int r = sc.nextInt();  // Taking user input
//
//        System.out.println("Enter number of columns : ");
//        int c = sc.nextInt();  // Taking user input
//
//        int[][] arr = new int[r][c];
//        userInput(arr,r,c);
//        printMatrix(arr);

        // Question addition of 2 matrices

//        System.out.println("Enter rows of a:");
//        int r1 = sc.nextInt();
//        System.out.println("Enter columns of a");
//        int c1 = sc.nextInt();
//        int[][] a = new int[r1][c1];
//        userInput(a,r1,c1);
//        System.out.println("Matrix a:");
//        printMatrix(a);
//
//        System.out.println("Enter rows of b:");
//        int r2 = sc.nextInt();
//        System.out.println("Enter columns of b:");
//        int c2 = sc.nextInt();
//        int[][] b = new int[r2][c2];
//        userInput(b,r2,c2);
//        System.out.println("Matrix b :");
//        printMatrix(b);
//
//        System.out.println("Added matrix:");
//        add(a,r1,c1,b,r2,c2);

        // Question of multiplying two matrix

//        System.out.println("Enter the rows :");
//        int r1 = sc.nextInt();
//        System.out.println("Enter the columns :");
//        int c1 = sc.nextInt();
//        int[][] a = new int[r1][c1];
//        System.out.println("Enter the elemnts of matrix:");
//        userInput(a,r1,c1);
//        System.out.println("matrix a:");
//        printMatrix(a);
//
//        System.out.println("Enter the rows od b matix:");
//        int r2 = sc.nextInt();
//        System.out.println("Enter the columns of matrix b:");
//        int c2 = sc.nextInt();
//        int[][] b = new int[r2][c2];
//        userInput(b,r2,c2);
//        System.out.println("matrix b:");
//        printMatrix(b);
//        multiply(a,r1,c1,b,r2,c2);

        // Transpose of a matrix

        // WAP to display transpose of matrix eneterd by the user

//        System.out.println("Enter rows of matrix");
//        int r = sc.nextInt();
//        System.out.println("Enter columns of matrix");
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int totalElements = r * c;
//        System.out.println("Enter " + totalElements + " values");
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input Matrix");
//        printMatrix(matrix);
//
////        System.out.println("Transpose of matrix");
////        int[][] ans = findTranspose(matrix,r,c);
////        printMatrix(ans);
//
////        System.out.println("transpose of matrix");
////        transposeInPlace(matrix,r,c);
////        printMatrix(matrix);
//        System.out.println("reversed matrix");
//        rotate(matrix,r);
//        printMatrix(matrix);

        // Pascal's Triangle

//        System.out.println("Enter n ");
//        int n = sc.nextInt();
//        int[][] ans = pascalOnly(n);
//         printMatrix(ans);

        //Transpose of a matrix
//        System.out.println("Enter number of rows and columns :  ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int total = r * c;
//        System.out.println("Enter " + total + "values");
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input matrix");
//        printMatrix(matrix);
//        System.out.println("transpose of matrix");
////        int[][] ans = transposeOfAMatrix(matrix,r,c);
////        printMatrix(ans);
//        inPlace(matrix, r, c);
//        printMatrix(matrix);

        //Rotate matrix
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int totalElements = r * c;
//        System.out.println("Enter "+totalElements+" value");
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input matrix");
//        printMatrix(matrix);
//
//        rotate(matrix,r);
//
//        System.out.println("rotated matrix:");
//        printMatrix(matrix);

        //Pascal triangle
//        int n = sc.nextInt();
//        int[][] ans = pascal(n);
//
//        printMatrix(ans);

        //Spiral matrix
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int totalElements = r * c;
//        int[][] matrix = new int[r][c];
//        System.out.println("Enter "+totalElements+" value");
//        for (int i = 0; i < r; i++){
//            for (int j = 0 ; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        printMatrix(matrix);
//
//        System.out.println("Spiral matrix : ");
//        spiralMatrix(matrix, r, c);
//        System.out.println("s1: ");
//        spiralMatrix_1(matrix,r,c);
//
//        int n = sc.nextInt();
//
//        System.out.println("Generated matrix: ");
//        int[][] matrix = spiralMatrixGenerated(n);
//        printMatrix(matrix);

        // prefix sum problem

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter "+totalElements+" values");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum "+ findSum(matrix,l1,r1,l2,r2));


    }
}

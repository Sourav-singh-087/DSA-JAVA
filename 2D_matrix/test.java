import java.util.*;

public class test{
    public static boolean search(int key ,int matrix[][]){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("key found "+ i + j);
                    return true;
                }
            }
            
        }
        System.out.println("not found");
        return false;

    }
    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>= largest){
                    largest = matrix[i][j];

                }

            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int matrix [][] = new int[3][3] ;
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //search(5, matrix);
        System.out.println(largest(matrix));
        sc.close();


    }

}
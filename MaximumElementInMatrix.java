import java.util.Scanner;
class Main {
    private static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr[0].length ; j++ ){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the row size : ");
        int m = sc.nextInt();
        System.out.println("Enter the column size : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the element in  the matrix : ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < m ; i++ ){
            for(int j = 0 ; j < n ; j++ ){
                max = Math.max(arr[i][j],max);
            }
        }
        System.out.println("MAximum element is : "+max);
    }
}

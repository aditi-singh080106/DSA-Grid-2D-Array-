import java.util.Scanner;
import java.util.HashMap;
class Practice{
    private static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr[0].length ; j++ ){
                System.out.print(arr[i][j]+" ");
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
        int minr = 0 , minc = 0 ;
        int maxr = m-1 , maxc = n-1 ;
        while(minr <= maxr && minc <= maxc ){
            for(int i = minc ; i <= maxc ; i++ ){
                System.out.print(arr[minr][i]+" ");
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i = minr ; i <= maxr ; i++ ){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int i = maxc ; i >= minc ; i-- ){
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i = maxr ; i >= minr ; i-- ){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
        


    }    
}

import java.util.Scanner;
import java.util.HashMap;
import java.util.List ;
import java.util.ArrayList ;
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
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < m ; i++ ){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++ ){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}

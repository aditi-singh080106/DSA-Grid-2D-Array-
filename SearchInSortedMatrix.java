class Solution {
  public boolean SearchInSortedMatrix(int[][] arr , int target){
    int m = arr.length , n = arr[0].length  i = 0 , j = n-1 ;
    while(i < m && j >= 0){
      if(arr[i][j] < target){
        // go down
        i++ ;
      }
      else if(arr[i][j] > target){
        // go left
        j-- ;
      }
      else if(arr[i][j] == target){
        return true ;
      }
    }
    return false ;
  } 
}

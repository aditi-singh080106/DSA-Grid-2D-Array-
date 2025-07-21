class Solution{
  public static int ScoreAfterFlipingMatrix(int[][] arr){
    int m = arr.length , n = arr[0].length ;
    // filipping rows of msb = 0 
    for(int i  = 0 ; i < m ; i++){
      if(arr[i][0] == 0 ){// flipp
        for(int j = 0  ; j < n ; j++ ){
          if(arr[i][j] == 0 ) arr[i][j] = 1 ;
          else arr[i][j] = 0 ;
        }
      }
    }
    // calculating columns with most 0s
    for(int j = 1 ; j < n ; j++){
      int noOfZeros = 0 ,  noOfOnes = 0 ;
      for(int i = 0 ; i < m ; i++ ){
        if(arr[i][j] == 0) noOfZeros ++ ;
        else noOfOnes++ ;
      }
      if(noOfZeros > noOfOnes){//flipp column
        for(int i = 0 ; i < m ; i++){
          if(arr[i][j] == 0 ) arr[i][j] = 1 ;
          else arr[i][j] = 0 ;
        }
      }
    }
    // calculateing the binary sum 
    int sccore = 0 ;
    int factor = 1 ;
    for(int j = n-1 ; j >= 0 ; j-- ){
      for(int i = 0 ; i < m ; i++ ){
        score += (arr[i][j]*factor) ;
      }
      factor *= 2 ;
    }
    return score ;
  } 
}

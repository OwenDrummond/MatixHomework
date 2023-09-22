import java.util.Arrays;

public class Matrix
{
   public static void main(String [] args)
   {
       Matrix newArray = new Matrix();
      // Creation of 2D array
       int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
      // Calling Matrix Search with a number we are seraching for
       int[] answer = MatrixSearch(arr, 10); 
   }
   static int[] MatrixSearch(int[][] arr, int key)
   {
      // Using row and column counts to create the max size of array and declaring a 0 for minimum size of array.
       int rowCount = arr.length;
       int colCount = arr[0].length;
       int lowBound = 0;
       int highBound = rowCount * colCount -1;
       
       while(lowBound <= highBound)
       {
          // We start search from middle of array.
           int middle = (highBound - 1) + lowBound / 2;
           int currRow = middle % colCount;
           int currCol = middle / colCount;
           int currSearch = arr[currRow][currCol];
           
           if(currSearch == key)
           {
              // If the middle "coordinates" line up to the key value, it returns that spot in the 2D array. 
               return new int[] { currRow, currCol };
           }
           if(currSearch < key)
           {
              // We then search the right side from midddle if the key is more than our intial search.
               lowBound = middle + 1;
           }
           else
           {
              // If the key is lower than our initial search we search the left side of the array. 
               highBound = middle -1;
           }
       }
      // If we do not find the value in the array, we return a negative array value to indicate it is not there. 
       return new int[] {-1, -1}; 
   }
}

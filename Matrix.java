import java.util.Arrays;

public class Matrix
{
   public static void main(String [] args)
   {
       Matrix newArray = new Matrix();
       int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
       int[] answer = MatrixSearch(arr, 10); 
   }
   static int[] MatrixSearch(int[][] arr, int key)
   {
       int rowCount = arr.length;
       int colCount = arr[0].length;
       int lowBound = 0;
       int highBound = rowCount * colCount -1;
       
       while(lowBound <= highBound)
       {
           int middle = (highBound - 1) + lowBound / 2;
           int currRow = middle % colCount;
           int currCol = middle / colCount;
           int currSearch = arr[currRow][currCol];
           
           if(currSearch == key)
           {
               return new int[] { currRow, currCol };
           }
           if(currSearch < key)
           {
               lowBound = middle + 1;
           }
           else
           {
               highBound = middle -1;
           }
       }
       return new int[] {-1, -1}; 
   }
}

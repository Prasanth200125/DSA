import java.util.*;
import java.lang.Math;


public class Java_Lec 
{
   public static void main(String[] args) 
   {
      int n=3;
      char board[][] = new char[n][n];
      for(int i =0;i<n;i++)
      {
         for(int j=0;j<n;j++)
         {
            board[i][j]='x';
         }
      }
      nqueens(board,0);

   }
   public static void nqueens(char board[][],int row)
   {
      if(row==board.length)
      {
         System.out.println("--------------");
         printarr(board);
      return;}
      
      for(int i=0;i<board.length;i++)
      {
         if(issafe(board,row,i))
         {board[row][i]='Q';
         nqueens(board, row+1);
         board[row][i]='x';}
      }
      

   }
   public static boolean issafe(char board[][],int row,int col)
   {
      // //vertical
      // for(int i = row-1;i>=0;i--)
      // {
      //    if(board[i][col]=='Q')
      //    return false;
      // }

      //right dia
      for (int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
      {
         if(board[i][j]=='Q')
         return false;
      }

      //left dia
      for (int i =row-1, j=col-1;i>=0 && j>=0;i--,j--)
      {
         if(board[i][j]=='Q')
         return false;
      }
      return true;
   }

   public static void printarr(char board[][])
   {
      for (int i =0;i<board.length;i++)
      {
         for(int j=0;j<board.length;j++)
         {
            System.out.print(board[i][j]+" ");

         }
         System.out.println();
      }
      return;
   }

    
}
 



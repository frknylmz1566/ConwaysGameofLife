import java.util.ArrayList;

public class Main {

    public static int[][] board;
    public static int[][] next;
    public static void main(String[] args) {
        gameBoard(15,15);
        System.out.println();
        liveOrDead(15,15);




    }

    static void liveOrDead(int row,int cell){

        next= new int[row][cell];
        for (int l = 0; l < row; l++){
            for (int m = 0; m < cell; m++){

                int alive=0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++){

                        if ((l + i >= 0 && l + i < row) && (m + j >= 0 && m + j < cell))
                            alive += board[l + i][m + j];
                    }
                }



                alive -= board[l][m];

                if ((board[l][m] == 1) && (alive < 2))
                    next[l][m] = 0;

                else if ((board[l][m] == 1) && (alive > 3))
                    next[l][m] = 0;


                else if ((board[l][m] == 0) && (alive == 3))
                    next[l][m] = 1;

                else
                    next[l][m] = board[l][m];
            }
        }

        System.out.println("Next Generation");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cell; j++)
            {
                if (next[i][j] == 0)
                    System.out.print("."+"\t");
                else
                    System.out.print("1"+"\t");
            }
            System.out.println();
        }





    }
     static void gameBoard(int row,int cell){

        board= new int[row][cell];
        board[5][4]=1;
        board[5][5]=1;
        board[5][6]=1;
        board[5][7]=1;

        for(int i=0;i< board.length ;i++) {
            System.out.println();
            for (int j = 0; j < board.length; j++) {
                //System.out.print("."+"\t");
                if (board[i][j] == 0)
                    System.out.print("." + "\t");
                else
                    System.out.print("1" + "\t");
                 }
        }

    }



}
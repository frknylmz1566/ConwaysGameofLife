public class Main {
    public static void main(String[] args) {

        int[][] gameBoard= new int[10][10];
        for(int i=0;i< gameBoard.length ;i++){
            System.out.println();
            for (int j=0;j< gameBoard.length;j++){
                System.out.print(gameBoard[i][j]+"\t");
            }
        }


    }
}
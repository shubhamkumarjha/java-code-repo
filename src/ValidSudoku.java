import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        int[][] board = {
                {9, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 5, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        boolean result = isValidSudoku(board);
        System.out.println("Sudoku valid :: "+result);
    }

    public static boolean isValidSudoku(int[][] board) {
        boolean result = true;
        for(int i=0; i<9; i++){
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            HashSet<Integer> sq = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]!=0){
                    if(!row.add(board[i][j])){
                        return false;
                    }
                }
                if(board[j][i]!=0){
                    if(!col.add(board[j][i])){
                        return false;
                    }
                }

            }
            for(int m=0; m<3; m++){
                for(int n=0; n<3; n++){
                    int r = (i/3)*3+m;
                    int c = (i%3)*3+n;
                    if(board[r][c]!=0){
                        if(!sq.add(board[r][c])){
                            return false;
                        }
                    }
                }
            }

        }
        return result;
    }
}

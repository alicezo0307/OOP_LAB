public class Board {

    public int width = 10; //have 10 column
    public String board[] = new String[width + 1];
    public String figures[] = new String[2];
    public int mv1 = 0;
    public int mv2 = 0;
    public String area = "[ ]";

    public void Board() {
        figures[0] = "Rora";
        figures[1] = "Mik";

    }

    void setUpBoard() {
    }

    void moveFigrue(String figureName, int move) {
        Board();
        if (figureName == figures[0]) {
            mv1 = move;
            board[mv1] = figures[0];
        }
        if (figureName == figures[1]) {
            mv2 = move;
            board[mv2] = figures[1];
        }
        
        if (move > 0 && move <= width) {
            for (int i = 1; i < width + 1; i++) {
                board[i] = area;
            }
            board[mv1] = figures[0];
            board[mv2] = figures[1];
            
            for (int i = 1; i < width + 1; i++) {
                    board[move] = figures[1];
                    

                System.out.print(board[i] + "\t");
            }
        } else {
            System.out.println("\n\nThere is no such position on this board.");
        }
        //}
    }

}

public class GameBoard {

    public static void main(String[] args) {
        Board b = new Board();
        b.setBoard();
        b.showBoard(); 
        b.movefigure("Mik", 3);    
        b.showBoard();
        b.movefigure("Rora", 5); 
        b.showBoard();
        b.movefigure("Rora", 8); 
        b.showBoard();
        b.movefigure("Mik", 8); 
        b.showBoard();
        
    }

   
}

public class Figure {

    String nameFigure;
    int positionFigure;
    
    void moveDestination() {
        System.out.print("["+getName() +"] Position : "+ getPosition()+"\n");
        
    }
    /*
    void moveDestination(Board board){
        for (int i = 0; i < 10; i++) {
            System.out.print(board.grid[i]);
        }
    }*/

    public Figure(String name, int position) {
        this.nameFigure = name;
        this.positionFigure = position;

    }

    String getName() {
        return this.nameFigure;
    }

    int getPosition() {
        return this.positionFigure + 1;
    }

}

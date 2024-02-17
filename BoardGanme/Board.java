public class Board {

    public String grid[] = new String[10];
    Figure f[] = new Figure[2];

    void setBoard() {
        for (int i = 0; i < grid.length; i++) {
            grid[i] = "[ ]";
        }
        f[0] = new Figure("Mik", 0);
        f[1] = new Figure("Rora", 1);
        grid[0] = f[0].nameFigure;
        grid[1] = f[1].nameFigure;
    }

    void movefigure(String name, int move) {
        if (grid[move - 1] != "[ ]") { //check position is dupicate
            return;
        }
        if (move > 0 && move <= grid.length) { //default grid is not more than
            for (int i = 0; i < f.length; i++) {

                if (name == f[i].nameFigure) { //check  figure in setBoard  
                    grid[f[i].positionFigure] = "[ ]";
                    f[i].positionFigure = move - 1;
                    grid[move - 1] = name;
                }
            }
        } else {
            System.out.println("\n" + "-".repeat(75));
            System.out.println("\t\tThere is no such position on this board.\n");
        }

    }

    void showBoard() {

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[i] + "\t" + ""); 
            
        }
        System.out.println("\n");
        for (int i = 0; i < f.length; i++) {
            System.out.print("\t\t\t");
            f[i].moveDestination();
        //    f[i].moveDestination(this);
        }
        
        System.out.println();
        System.out.println("-".repeat(75));
    }


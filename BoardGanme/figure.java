public class Figure{
    String nameFigure;
    int positionFigure;
    
    public Figure(String name,int position) {
        this.nameFigure = name;
        this.positionFigure=position;
    }
    
    String getName(){
        return this.nameFigure;
    }
    
    int getPosition(){
        return this.positionFigure;
    }
    
    
}

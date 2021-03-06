package visitor.figure;

public abstract class Figure {

    public Figure(String description) {
    }
    
    public abstract double area();
    public abstract double numberOfSides();
    public abstract void accept(Visitor visitor);

}

package visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double numberOfSides() {
        return 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSquare(this);
	}

}

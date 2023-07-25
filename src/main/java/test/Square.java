package test;


public class Square extends Form {
    private final String figure;
    private final String color;
    private double side;


    private double sideParameters() {
        System.out.println("your side length is " + this.side);
        return this.side;
    }


    @Override
    public double area() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getParameters() {
        System.out.println("Figure : " + this.figure + " , area : " + this.area() + ", lenght side : " + this.side + ", color : " + this.color);
        return this.area();
    }

    public Square() {
        Random random = new Random();
        this.figure = "Square";
        this.color = random.getRandomColor();
        this.side = random.getRandomValue(10,1);
    }


    public double getSide() {
        System.out.println("Your side is : " + this.side);
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
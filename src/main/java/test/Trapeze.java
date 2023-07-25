package test;


public class Trapeze extends Form {
    private final String figure;
    private final String color;
    private double sideA;
    private double sideB;
    private double height;

    @Override
    public double area() {
        return ((this.sideA + this.sideB) / 2) * this.height;
    }

    @Override
    public double getParameters() {
        System.out.println("Figure : " + this.figure + " , area : " + this.area() +", side A : " + this.sideA + ", side B : " + this.sideB + ", color : " + this.color);
        return this.area();
    }

    public Trapeze() {
        Random random = new Random();
        this.figure = "Trapeze";
        this.color = random.getRandomColor();
        this.sideA = random.getRandomValue(5, 1);
        this.sideB = random.getRandomValue(5, 1);
        this.height = random.getRandomValue(10, 1);
    }


    public String getFigure() {
        return figure;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        System.out.println("Your height is : " + this.height);
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "figure='" + figure + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", height=" + height +
                '}';
    }
}
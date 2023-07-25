package test;


public class Circle extends Form {
    private final String figure;
    private final String color;
    private int radius;
    private double Pi;

    public Circle() {
        Random random = new Random();
        this.figure = "Circle";
        this.color = random.getRandomColor();
        this.radius = random.getRandomValue(7, 1);
        this.Pi = 3.14;

    }
    @Override
    public double getParameters() {
        System.out.println("Figure : " + this.figure + ", area : " + this.area() +", radius : " + this.radius + ", color : " + this.color);
        return this.area();
    }


    @Override
    public double area() {
        return this.Pi * Math.pow(this.radius, 2);
    }


    public int getRadius() {
        System.out.println("Your radius is : " + this.radius);
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double pi) {
        Pi = pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pi=" + Pi +
                '}';
    }
}
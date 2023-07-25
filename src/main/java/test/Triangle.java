package test;


public class Triangle extends Form {
    private final String figure;
    private final String color;
    private double kathetos;



    @Override
    public double area() {
        return 0;
    }

    public double hypotenuse() {
        return (Math.pow(this.kathetos, 2) + Math.pow(this.kathetos, 2));
    }

    @Override
    public double getParameters() {
        System.out.println("Figure : " + this.figure + ", hypotenuse : " + this.hypotenuse() + ", color : " + this.color);
        return this.area();
    }

    public Triangle() {
        Random random = new Random();
        this.figure = "Triangle";
        this.color = random.getRandomColor();
        this.kathetos = random.getRandomValue(5,1);

    }

    public double getKathetos() {
        return kathetos;
    }

    public void setKathetos(int kathetos) {
        this.kathetos = kathetos;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "kathetos=" + kathetos +
                '}';
    }
}
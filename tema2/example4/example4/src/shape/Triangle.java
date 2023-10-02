package shape;

public class Triangle extends Shape {
    private Double width;
    private Double height;
    public Triangle(String color, Double height, Double width) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void println() {
        System.out.println("Hi i am a circle");
    }

    @Override
    public Double area() {
        System.out.println("Area Triangle: " + this.height * this.width / 2); 
        return this.height * this.width / 2;
    }
    
}

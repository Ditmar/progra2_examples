package shape;

public class Circle extends Shape {
    private Double radio;
    public Circle(String color, Double radio) {
        super(color);
        //TODO Auto-generated constructor stub
        this.radio = radio;
    }

    @Override
    public Double area() {
        System.out.println("Area Circle: " + Math.PI * this.radio * this.radio);
        return Math.PI * this.radio * this.radio;
    }
    
}

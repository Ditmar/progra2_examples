package shapes;

import interfaces.Process;

public class Square implements Process {
    private Integer width;
    private Integer height;
    public Square(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void print() {
        System.out.println("The value of the attribute width is " + this.width);
        System.out.println("The value of the attribute height is " + this.height);

    }
    @Override
    public void increment(Integer increment) {
        this.height += increment;
        this.width += width;
    }
}

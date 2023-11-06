package shapes;

import interfaces.Process;

public class Circle implements Process {
    private Integer radio;
    public Circle (Integer radio) {
        this.radio = radio;
    }
    @Override
    public void print() {
        System.out.println("The attribute radio is " + this.radio);
    }

    @Override
    public void increment(Integer increment) {
        this.radio += increment;
    }
    
}

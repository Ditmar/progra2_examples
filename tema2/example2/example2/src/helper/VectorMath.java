package helper;

public class VectorMath extends BaseMath{
    public VectorMath() {

    }   
    //overload
    public Vector add(Vector a, Vector b) {
        Vector result = new Vector(
            a.getX() + b.getX(), 
            a.getY() + b.getY());
        return result;
    }
    public void println(Vector result) {
        System.out.println(" Vector x = " + result.getX() + " y = " + result.getY());
    }
    public void println() {
        System.out.println("Result = " + this.getResult());
    }
    public Vector subtract(Vector a, Vector b) {
        Vector result = new Vector(
            a.getX() - b.getX(), 
            a.getY() - b.getY());
        return result;
    }
    public Vector multiply (Integer constant, Vector a ) {
        Vector result = new Vector(a.getX() * constant, a.getY() * constant);
        return result;
    }
}

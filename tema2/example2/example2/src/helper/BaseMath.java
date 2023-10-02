package helper;

public class BaseMath {
    private Integer result;

    public BaseMath() {

    }
    public Integer add(Integer a, Integer b) {
        this.result = (a + b);
        return a + b;
    }
    public Integer subtract(Integer a , Integer b) {
        this.result = (a - b);
        return a - b;
    }
    public Integer multiply (Integer a , Integer b) {
        this.result = (a * b);
        return a * b;
    }
    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
    }
    
}

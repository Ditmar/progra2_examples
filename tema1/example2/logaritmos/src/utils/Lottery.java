package utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lottery {
    private Integer numberSize;
    private Integer[] listResult;
    private Integer max;
    private Integer min;
    public Lottery(Integer numberSize, Integer min, Integer max) {
        this.numberSize = numberSize;
        this.min = min;
        this.max = max;
        this.listResult = new Integer[this.numberSize];
        this.generate();
        this.sort();
    }
    private void sort() {
        Arrays.sort(this.listResult);
    }
    private void generate() {
        Integer count = 0;
        while(count < this.numberSize) {
            Integer candidate = this.generateNumber();
            if (this.isRepeat(candidate)) {
                this.listResult[count] = candidate;
                count++;
            }
        }
    }
    private Integer generateNumber() {
        Double seed = Math.random() * (this.max - this.min);
        Integer result =  seed.intValue() + this.min;
        return result;
    }
    private Boolean isRepeat(Integer candidate) {
        for (Integer i  = 0; i < this.listResult.length; i++) {
            if (this.listResult[i] == candidate) {
                return false;
            }
        }
        return true;
    }
    public Integer getNumberSize() {
        return this.numberSize;
    }
    public Integer[] getListResults() {
        return this.listResult;
    }
}

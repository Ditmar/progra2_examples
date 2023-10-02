package bank;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double initBalance) {
        super(initBalance);
    }
    public void updateLimit() {
        this.limit = this.getBalance() / 2;
    }
    public Double getLimit() {
        return limit;
    }
    public void setLimit(Double limit) {
        this.limit = limit;
    }
    
}

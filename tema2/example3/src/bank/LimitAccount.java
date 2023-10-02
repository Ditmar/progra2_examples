package bank;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double initBalance) {
        super(initBalance);
        this.updateLimit();
    }
    private void updateLimit() {
        this.limit = this.getBalance() / 2;
    }
    public Double getLimit() {
        return limit;
    }
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    @Override
    public void balanceOut(Double cashOut) {
        if (cashOut < this.limit) {
            super.balanceOut(cashOut);
            this.updateLimit();
            System.out.println("cash out was made");
        } else {
            System.out.println("Error, the cash out must be minor than the limit, your limit currently is " + this.limit);
        }
    } 
    @Override
    public void balanceIn(Double cashIn) {
        super.balanceIn(cashIn);
        this.updateLimit();
        System.out.println("cash in  was made");
    }
}

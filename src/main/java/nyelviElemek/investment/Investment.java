package nyelviElemek.investment;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;

    public void setFund(int fund) {
        this.fund = fund;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    private boolean active;

    public void setActive(boolean active) {
        this.active = active;
    }

    public Investment(int fund, int interestRate){
        this.active=true;
        this.fund=fund;
        this.interestRate=interestRate;
    }

    public int getFund(){
        return fund;
    }

    public int getInterestRate(){
        return interestRate;
    }

    public double getYield(int days){
        return (fund*((double)interestRate/100))*((double)days/365);
    }

    public double close(int days){
        return active ? (fund+getYield(days))-((fund+getYield(days))*0.003) : 0;
    }
}

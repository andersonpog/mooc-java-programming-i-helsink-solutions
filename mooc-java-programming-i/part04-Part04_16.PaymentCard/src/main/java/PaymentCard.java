public class PaymentCard {

    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if(this.balance >= 2.60)
            this.balance = this.balance - 2.60;
    }

    public void eatHeartily() {
        // write code here
        if(this.balance >= 4.60)
            this.balance = this.balance - 4.60;
    }

    public void addMoney(double amount) {
        // write code here
        if(amount>=0.0)
            this.balance = this.balance + amount;
        if(this.balance > 150.0)
            this.balance = 150.0;
    }
}

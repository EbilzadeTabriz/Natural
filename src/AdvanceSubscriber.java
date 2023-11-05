public class AdvanceSubscriber {

    private String name;
    private int balance = 120;
    private String city;


    public AdvanceSubscriber(String name, int balance, String city) {
        this.name = name;

        if (balance>=0&&balance<=120){
            this.balance =balance;

        }
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;


    }
    public void useNaturalGas(int amount){
        if (this.balance-amount<0){
            System.out.println("not enough balance");
        }
        else {
            this.balance-=amount;
            if (this.balance<=0){
                System.out.println("Balance is over ,Please go nearest palace to add balance"
                        +"credit limit = 120 AZN");

            }
            else {
                System.out.println("New balance "+balance);
            }
        }

    }
    public void learnBalance(){
        System.out.println("Balance: "+balance);
    }

}

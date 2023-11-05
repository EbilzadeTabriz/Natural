public class Subscriber {
  public String name;
  public int balance;
  public String city;

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

package shopApp;
/**
 * User
 */
public class User {

    private String name;
    private int id;
    private int accountNum;
    User (String name,int id,int accountNum){
        this.id = id;
        this.name = name;
        this.accountNum = accountNum;
    }

    public int getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }


    public boolean pay(int amount){
        Account acc = new Account(this.name, this.accountNum, 232344444);
        if  (acc.pay(amount)) {
            System.out.println("You successfully bought the Bike.");
            return true;
        }else{
            System.out.println("dear i think you dont have enough cash to buy this bike.");
            return false;
        }

    }

}
package shopApp;

class Account {

    private final String name;
    private final int acc_number;
    private float balance;

    Account(String name, int acc_number,float balance){
        this.acc_number = acc_number;
        this.name = name;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
    public int getAcc_number() {
        return acc_number;
    }
    public String getName() {
        return name;
    }


    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public boolean pay(float amount){
        if (amount > this.balance){
            System.out.println("Transation Failed! Not Enough Money.");
            return false;
        }else{
            System.out.println("Transation Successful!  Rs." + amount);
            return true;
        }
    }

    public boolean withdraw(float amount){
        return pay(amount);
    }

    public void add(float amount){
        this.balance += amount;
        System.out.println("Rs. " + amount + " Added Successuly");
        System.out.println("Current Balance Rs. " + this.balance);
        
    }


}
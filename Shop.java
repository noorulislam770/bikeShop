package shopApp;
import java.util.Scanner;

public class Shop {
    Scanner in = new Scanner(System.in);
    User user;
    Views v = new Views();
    Bicycle [] cycles = {
        new Bicycle("Suhbar", "tata", "H8TER", 6000),
        new Bicycle("rockBuster", "redBull", "2K00L", 2342),
        new Bicycle("speed Buster", "Ferrari", "LI8", 9820),
        new Bicycle("shooter", "Toyota", "234AT", 8999),
        new Bicycle("atitude", "panama", "ISL001", 9999),
        new Bicycle("electron", "Tesla", "00001", 1010999),

    };
     
    

    public Shop(){
        user = new User("noor", 12, 1231233);
        
    }

    public void start(){

        System.out.println("\n===== Super online Bike Retailer ====");
        System.out.println("==== lets See Some Bikes =====\n");
        showBikes();
        takeInput();

        
    }

    private void takeInput(){
        boolean using = true;
        while (using){
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Please enter a bike that you want to buy. Enter (0) to Exit.");
            int userSelection = in.nextInt();
    
            if (userSelection ==0 ){
                using = false;
            }else if (userSelection>cycles.length || userSelection<0){
                System.out.println("Please select a valid bike number");
                userSelection = in.nextInt();
            }else{
                String model = cycles[userSelection-1].getModel();
                buy(model);
                
            }
        }
    }

    public void showBikes(){



        System.out.println("       ==== Cycles  ====");
        System.out.println("Sr.no Name            Manufacturer   model           Price");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < cycles.length;i ++){
            System.out.println( v.f((i + 1), 6) + v.f(cycles[i].getName(),16)  + v.f(cycles[i].getMaunfacturer(),16)  + v.f(cycles[i].getModel(),16) + v.f(cycles[i].getPrice(),9) );

        }
    
    
    }

    public void buy(String model){
        int price = 0 ;
        System.out.println("Please Confirm First : ");
        System.out.println("Name              Manufacturer     model             Price");
        System.out.println("-----------------------------------------------------------");
        for (Bicycle cycle: cycles){
            if (cycle.getModel() == model){
                System.out.println(v.f(cycle.getName(), 16)+v.f(cycle.getMaunfacturer(), 16)+v.f(cycle.getModel(), 16)+v.f(cycle.getPrice(), 10));
                price = cycle.getPrice();
            }
        }
        System.out.println("Please Confirm your Purchase...( AnyKey For (yes), 0 =>  for (No)) ");
        int confirm  = in.nextInt();
        if (confirm != 0){
            System.out.println("inside the confirm condition");
            if (user.pay(price)){
                System.out.println("transation successfull!");
                System.out.println("thanks for using our service.");
            }else {
                System.out.println("Transation Failed!");
                System.out.println("Try Again Later.");
            }
        }
        else{
            System.out.println("Please Select Another You Like");
            showBikes();
        }

        // in.close();
    }



}


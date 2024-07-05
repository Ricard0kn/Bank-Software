import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice; 
        int input = 0;
        Pin newPin;

        System.out.print("Bank Of The World");
        
        System.out.println("Create new pin"); 

        choice = scnr.next();

         if(choice.equals("b")) {
            System.out.println("Enter New Pin Number");
            input = scnr.nextInt(); 
            Pin newpin = new Pin(input);
            System.out.println("New Pin Has Been Created!");
        } 

        System.out.println("Enter Pin:"); 

        //if (input != newpin.getPin()) {
        //    System.out.println("Wrong Pin");    Fix this later
       // }


        
    }


 class Pin{

        private int pin;
    
    public Pin(int pin) {
        this.pin = pin; 
    }

    public void setPin(int pin) {
        if (pin >= 1)
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }


}

class Bank {

}
}
   





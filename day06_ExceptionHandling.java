import java.util.*;

public class day06_ExceptionHandling {
    public static void main(String[] args) {
        InvaliduserException iue=new InvaliduserException();

        // ATM atm = new ATM();
        bank b =new bank();
        b.permit();
    }
}


class ATM{
    int accno = 1234;
    int p =1234;
    int acc;
    int pin;
    
    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the acc num");
        acc = sc.nextInt();
        System.out.println("enter the PIN num");
        pin = sc.nextInt();
    }
    void validate() throws InvaliduserException{
        
        if(accno == acc && p== pin){
            System.out.println("collect money");
        }else{
            InvaliduserException iue = new InvaliduserException();
            throw iue;
        }
    }
}


class InvaliduserException extends Exception{
    @Override
    public String getMessage() {  // method which return the string
        return "Invalis Input... Try again..!";
    }

}


class bank{
    void permit(){
        ATM atm = new ATM();  // accesing the atm  
        try{
            atm.acceptInput();  // method for exception 
            atm.validate();
        }catch(InvaliduserException iue1){
            System.out.println(iue1.getMessage());
            try{
                atm.acceptInput();
                atm.validate();
            }catch(InvaliduserException iue2){
                System.out.println(iue2.getMessage());
                try{
                    atm.acceptInput();
                    atm.validate();
                }catch(InvaliduserException iue3){
                    System.err.println("Card blocked byee");
                }
            }
        }

    }
}

public class Lab8_Qn2_CheckingAccount { 
    private double balance; 
    private double number; 
 
    public Lab8_Qn2_CheckingAccount(double balance , double number) { 
        this.balance = balance; 
        this.number = number; 
    } 
 
    public double deposit(double amt) throws Exception{ 
        if (amt <= 0){ 
            throw new Exception("Sorry, please deposit a positive value\n"); 
        } 
        else{ 
            balance += amt; 
            return balance; 
        } 
         
    } 
 
    public double withdraw(double amt) throws Lab8_Qn2_InsufficientFundsException, Exception{ 
        if (balance < amt){ 
            throw new Lab8_Qn2_InsufficientFundsException(amt); 
        } 
        else if (amt <= 0){
            throw new Exception("Please enter a positive value");
        }
        else {  
            balance -= amt; 
            return balance; 
        } 
         
    } 
 
    public double getBalance() { 
        return balance; 
    } 
 
    public double getNumber() { 
        return number; 
    } 
 
     
}
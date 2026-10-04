class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

class BankAccount
{
    private double balance;
    
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }
}

class Exception2
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(1000);
        
        try
        {
            account.withdraw(1500);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

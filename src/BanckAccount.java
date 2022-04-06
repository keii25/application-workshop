/**
 * This class represents a Bank Account
 */

public class BanckAccount {

    // class fields
    private int accountNumber;
    protected boolean activated;

    /**
     * empty builder
     */
    public BanckAccount(){
        accountNumber = 12101130;
    }

    /**
     * constructor of the class CuentaBancaria
     * @param accountNumber define the number of the account.
     * @param activated indicates the status of the bank account
     */

    public BanckAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    /**
     * method that returns a account number
     * @return account number
     */

    public int getAccountNumber() {
        return this.accountNumber;
    }  
    
    /**
     * method that indicates if the account is active
     * @return false o true
     */

    public boolean isActivated() {
        return this.activated;
    } 
    
    /**
     * Method that allows you to change the status of a bank account
     * @param activated The parameter  activated defines the new state of the bank account
     */

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    

    
}

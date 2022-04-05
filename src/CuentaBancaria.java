public class CuentaBancaria {

    private int accountNumber;
    protected boolean activated;

    public CuentaBancaria(){
        accountNumber = 12101130;
    }

    public CuentaBancaria(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    

    public int getAccountNumber() {
        return this.accountNumber;
    }  
    

    public boolean isActivated() {
        return this.activated;
    }   

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    

    
}

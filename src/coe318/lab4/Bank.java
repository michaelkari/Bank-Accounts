/**
 *
 * @author Michael
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts
    private int maxAccounts;

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        maxAccounts=maxNumberAccounts;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;  //Fix this
    }
    public void setName(String n){
        name=n;
    }
    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }
    public void setNumAccounts(int nA){
        numAccounts=nA;
    }

    public Account[] getAccounts() {
        return accounts; //Fix this
    }
    public void setAccounts(Account[] sa){
        accounts=sa;
    }
    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        boolean test=false;
        for(int i=0;i<numAccounts;i++){
            if(accounts[i].num==accountNumber){
                test=true;
                i=numAccounts;
            }
        }
        return test; //Fix this
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        boolean test=true;
        if (numAccounts>=1){
            for(int i=0;i<numAccounts;i++){
                if(numAccounts>=maxAccounts || account.num==accounts[i].num){
                    test=false;
                    break;
                }
            }
        
        }
        if(test==true){
            numAccounts++;
            accounts[(numAccounts-1)]=account;
        }
        return test; //Fix this
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}

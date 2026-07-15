package Oops.Encapsulation;

public class BankAccount {
    private String csName;
    private int accountNo;
    private int bankBalance;
    private int ifscCode;

    private final int BRANCHIFSC = 123456;

    public BankAccount(String csName, int accountNo, int bankBalance, int ifscCode) {
        this.bankBalance = bankBalance;
        this.csName = csName;
        this.accountNo = accountNo;
        this.ifscCode = ifscCode;
        System.out.println("Customer logged in: " + csName);
    }

    public int getBankBalance() {
        if (this.ifscCode == BRANCHIFSC) {
            return bankBalance;
        }
        return 0;
    }

    public int getAccountNo() {
        if (this.ifscCode == BRANCHIFSC) {
            return accountNo;
        }
        return 0;
    }

    public String getCsName() {
        if (this.ifscCode == BRANCHIFSC) {
            return csName;
        }
        return "Invalid details, please enter correct details.";
    }

    public int getIfscCode() {
        return ifscCode;
    }

    private void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    private void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void setCsName(String csName) {
        if (this.ifscCode == BRANCHIFSC) {
            this.csName = csName;
        }
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
    }
}

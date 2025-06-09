package bank;

public class CustomerBankAccount {
    public static void main(String[] args) {
        BankAccount bill = new BankAccount("s01","Sharique");
        bill.depositMoney(400);
        System.out.println(bill.withdrawMoney(500));
        bill.depositMoney(-50);
    }
}

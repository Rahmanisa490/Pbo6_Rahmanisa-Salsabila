package emoney;
public interface Digital Money {
    void topUp(int amount);
    void pay(int amount);
    void checkBalance();
    void Withdraw(int amount);
    void transfer(int amount,String accountNumber)
}

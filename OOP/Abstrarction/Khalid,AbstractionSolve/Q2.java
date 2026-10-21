abstract class Bank {
    abstract int getBalance();
}
class BankA extends Bank {
    int getBalance(){
        return 100;
    }
}
class BankB extends Bank {
    int getBalance(){
        return 150;
    }
}
class BankC extends Bank {
    int getBalance(){
        return 200;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println(c.getBalance());
    }
}
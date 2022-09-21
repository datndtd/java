public class Account {
    int id;
    String name;
    int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("STK:" + id + ", Ten:" + name + ", So du: " + balance);
    }

    void deposit(int amount) {
        this.balance += amount;
        System.out.println("So du: " + this.balance);
    }

    void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("So du: " + this.balance);
        } else {
            System.out.println("Khong du so du");

        }
    }

    public static void main(String[] args) {
        Account tk1 = new Account(1, "Dat",100);
        Account tk2 = new Account(2, "Dung", 200);
        tk1.deposit(50);
        tk2.withdraw(2000);
        tk1.display();
        tk2.display();
    }
}
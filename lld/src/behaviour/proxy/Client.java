package behaviour.proxy;

public class Client {
    public static void main(String[] args) {
        ExpensiveObject expensiveObject=new ExpensiveObjectImpl();
        expensiveObject.process();
        expensiveObject.process();
    }
}

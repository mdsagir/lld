package behaviour.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject{

    public ExpensiveObjectImpl() {
        initializing();
    }

    @Override
    public void process() {
        System.out.println("Processing");
    }

    private void initializing() {
        System.out.println("Initializing heavy object");
    }

}

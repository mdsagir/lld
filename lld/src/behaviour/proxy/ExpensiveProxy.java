package behaviour.proxy;

public class ExpensiveProxy implements ExpensiveObject{

    private ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject==null){
            expensiveObject=new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}

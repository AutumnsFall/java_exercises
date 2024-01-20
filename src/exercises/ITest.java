package exercises;

public interface ITest {

    public void saySomething();

    public default void say() {
        System.out.println("Function not implemented. Default function working.");
    }
}

// 1. usually, whenever you want to expose a functionality of something, use interface
// 2. when your child class needs to implements multiple parents
// 3. Personal advice, if you don't need to share any class variables, always go with interface.

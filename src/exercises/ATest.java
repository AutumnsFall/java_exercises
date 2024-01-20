package exercises;

public abstract class ATest{

    public abstract void functionName();

}
// 1. the class should not be able to be created as instances
// 2. there are some functions that can be implemented in the parent class and child classes must share a particular
// function in general even though the implementation maybe different for each child
// 3. to expose to the user
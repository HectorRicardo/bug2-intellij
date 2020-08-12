package own.main;

public class ChildA extends MyAbstractClass implements MyInterface {
    public void buggyMethod() {
        System.out.println("ChildA");
    }

    public void caller() {
        buggyMethod();
    }
}

package own.main;

public class ChildB implements MyInterface {
    @Override
    public void buggyMethod() {
        System.out.println("buggyMethod from ChildB");
    }

    public void callerMethod() {
        buggyMethod();
    }
}

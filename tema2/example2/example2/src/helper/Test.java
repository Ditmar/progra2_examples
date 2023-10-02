package helper;

public class Test {
    public void test(String path, Integer k) {
        System.out.println("Test con Integer k");
    }
    public void test(String path, Integer ...numbers) {
        System.out.println("test con operador spread");
    }

    public void test(String path) {
        System.out.println("TEST sin operador spread");
    }
}

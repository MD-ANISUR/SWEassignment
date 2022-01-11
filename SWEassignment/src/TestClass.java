public class TestClass {
    int id;
    String name;

    TestClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass(11, "Anisur");

        System.out.println("Student ID: "+ tc.id+" Name: "+tc.name);
        TestClass2  X= TestClass2.getInstance();
        System.out.println(X.s);

    }

}
class TestClass2 {
    private static TestClass2 ins = null;

    public String s;
    private TestClass2()
    {
        s = "This a singleton Test Class";
    }

    public static TestClass2 getInstance()
    {
        if (ins == null)
            ins = new TestClass2();

        return ins;
    }
}


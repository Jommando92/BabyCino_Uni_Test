// Bug G1. Allow zero-length lists, such as int
class TestBugG1 {
    public static void main(String[] args) {
        System.out.println(new Test().f());
    }
}
class Test {
    public int f() {
        // Incorrect initialization of the second variable
        int x;
        return 42;
    }
}
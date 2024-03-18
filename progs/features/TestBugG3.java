// This program tests the bug where the second variable in a multiple variable declaration is initialized incorrectly.

class TestBugG3 {
    public static void main(String[] args) {
        System.out.println(new Test().f());
    }
}

class Test {
    public int f() {
        boolean x, y;
        if (y) // y is uninitialized
            return 1;
        else
            return 0;
    }
}

//Bug G2. In int x,y; make y a boolean
class TestBugG2 {
    public static void main(String[] args) {
        System.out.println(new Test().f());
    }
}

class Test {
    public int f() {
        // Multiple variable declaration with incorrect type for the second variable
        int x,y;
          y = true; // Assigning a boolean value to y
        if (y)
            return 1;
        else
            return 0;
    }
}

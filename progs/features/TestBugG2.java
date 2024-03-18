//Bug G2. In int x,y; make y a boolean
class TestBugG2 {
    public static void main(String[] args) {
        System.out.println(new Test().f());
    }
}
class Test {
     public int f() {
          int x, y;
          y = true; // Assigning a boolean value to y
          if (y);
               return 1;
          else
               return 0;
     }
}
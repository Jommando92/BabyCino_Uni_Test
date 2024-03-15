//Bug G1. Allow zero-length lists, such as int ;.
class TestBugG1 {
    public static void main(String[] args) {
        int[] a = new int[0];
        int[] b = new int[] {};
        int[] c = {};
    }
}
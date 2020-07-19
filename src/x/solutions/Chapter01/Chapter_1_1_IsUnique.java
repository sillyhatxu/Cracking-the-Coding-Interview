package x.solutions.Chapter01;

public class Chapter_1_1_IsUnique {

    private static boolean IsUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (i << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsUnique("sbcdefg"));
        System.out.println(!IsUnique("sbcdefghiesgd"));
    }
}

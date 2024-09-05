public class ShiftToLeft {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println(shiftToLeft(x, y));
    }

    public static int shiftToLeft(int x, int y) {
        int z = (int) Math.pow(2, y);
        int w = x * z;
        return w;
    }
}


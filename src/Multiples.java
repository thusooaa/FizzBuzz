public class Multiples {

    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i < 1000; i++) {

            if (multOf3or5(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean multOf3or5(int i) {
        boolean multipleOf3 = i % 3 == 0;
        boolean multipleOf5 = i % 5 == 0;

        return multipleOf3 || multipleOf5;
    }
}

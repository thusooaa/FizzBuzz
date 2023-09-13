public class Reduce {

    public static void main(String[] args) {

        int count = 0;
        int i = 100;

        while (i > 0) {

            i = evenOrNot(i);
            count++;
        }
        System.out.println(count);
    }

    private static int evenOrNot(int i) {
        boolean even = i % 2 == 0;

        if (even) {
            i = i / 2;
        }

        else {
            i--;
        }
        return i;
    }
}

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            
            int result = 10 / 0;

            int[] arr = new int[5];
            System.out.println(arr[10]);

            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

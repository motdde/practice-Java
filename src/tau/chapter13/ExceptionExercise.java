package tau.chapter13;

public class ExceptionExercise {
    public static void main(String[] args) {
        try {

            int c = 30 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Dividing by zero is not permitted");
        } finally {
            System.out.println("Division is fun");
        }
    }
}

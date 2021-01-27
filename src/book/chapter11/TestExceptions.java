package book.chapter11;

public class TestExceptions {
    public static void main(String[] args) {

        String test = "yes";
        try {
            System.out.println("Start try");
            doRisky(test);
            System.out.println("End try");
        } catch (ScaryException se) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End main");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("Начало опасного метода");
        if ("yes".equals(test)) {
            throw new ScaryException ();
        }
        System.out.println("Конец опасного метода");
        return;
    }

    private static class ScaryException extends Throwable {
    }
}

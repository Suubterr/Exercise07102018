package threads;

public class RunnableLambda {
    public static void main(String[] args) {
        System.out.println("What does Marcellus Wallace looks like?");

        Runnable thread = () -> {
            System.out.println("Does he looks like a bitch?");
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName());

        };

        Thread thread1 = new Thread(thread);
        thread1.start();
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.toString());
    }
}

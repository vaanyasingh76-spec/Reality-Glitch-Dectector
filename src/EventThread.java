public class EventThread extends Thread {

    private String message;

    // Constructor
    public EventThread(String message) {
        this.message = message;
    }

    // Code that the thread will run
    @Override
    public void run() {

        System.out.println(
            "Processing event: " + message
        );

        try {

            Thread.sleep(500);

        } catch (InterruptedException e) {

            System.out.println(
                "Event processing was interrupted."
            );
        }

        System.out.println(
            "Event processing completed: " + message
        );
    }
}

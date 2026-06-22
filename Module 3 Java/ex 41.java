// Executor Service and Callable
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000); // simulate work
        return "Task " + taskId + " executed by " + Thread.currentThread().getName();
    }
}

class Main {
    public static void main(String[] args) {

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // List to hold Future results
        List<Future<String>> futures = new ArrayList<>();

        // Submit multiple Callable tasks
        for (int i = 1; i <= 5; i++) {
            Task task = new Task(i);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        // Get results
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown executor
        executor.shutdown();
    }
}

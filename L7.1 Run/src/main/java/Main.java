import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int PORT = 5050;
    private static final int MAX_THREADS = 10;

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);

            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                System.out.println("Server started");

                while (true) {
                    Socket socket = serverSocket.accept();
                    executorService.submit(new ServerHandler(socket));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

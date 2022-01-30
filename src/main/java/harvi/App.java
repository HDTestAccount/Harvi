package harvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

@SpringBootApplication
public class App {
    //// TODO: вынести это в отдельный класс
    public static ConcurrentHashMap queueMap;

    static {
        queueMap = new ConcurrentHashMap<String, ConcurrentLinkedQueue<String>>();
    }

    public static void main(String[] args) {
        SpringApplication.run(harvi.App.class, args);
    }
}

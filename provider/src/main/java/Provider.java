import com.gxy.protocol.HttpServer;

public class Provider {


    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost", 8080);
    }
}

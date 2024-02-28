package ejercicio2;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);

        while (true){
            MyStreamSocket socket = new MyStreamSocket(server.accept());
            Thread thread = new Thread(new HiloAuxiliar(socket));
            thread.start();
        }
    }
}

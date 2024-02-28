package ejercicio2;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class ClienteTCP {
    public static void main(String[] args) throws IOException {
        // Solicitamos la conexión con el servidor
        InetAddress address = InetAddress.getByName("localhost");
        MyStreamSocket socket = new MyStreamSocket(address, 12345);

        Scanner sc = new Scanner(System.in);
        String palabra ;
        while (true){
            System.out.println("Introduce una palabra: ");
            palabra = sc.next();
            socket.sendMessage(palabra);

            if(palabra.equals("salir")){
                break;
            }
        }

        String masCorta = socket.receiveMessage();
        String masLarga = socket.receiveMessage();
        String suma = socket.receiveMessage();

        System.out.println("Palabra mas corta: "+masCorta);
        System.out.println("Palabra mas larga: "+masLarga);
        System.out.println("Suma: "+suma);

        sc.close();
        socket.close();
    }
}

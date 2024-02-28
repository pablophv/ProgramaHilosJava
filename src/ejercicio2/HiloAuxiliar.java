package ejercicio2;

import java.io.IOException;
import java.util.ArrayList;

public class HiloAuxiliar implements Runnable{

    MyStreamSocket socket;
    public HiloAuxiliar(MyStreamSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        String masCorta;
        String masLarga;
        int suma= 0;

        ArrayList<String> palabras= new ArrayList<>();

        String palabra;

        while (true){
            try {
                palabra = socket.receiveMessage();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            palabras.add(palabra);

            if(palabra.equals("salir")){
                break;
            }

            suma += palabra.length();
            System.out.println("La palabra recibida por el cliente es:" + palabra);
        }

        masCorta = palabras.get(0);
        masLarga = palabras.get(0);

        for (int i = 0; i < palabras.size(); i++) {
            if(palabras.get(i) != "Salir"){

                if(palabras.get(i).length() < masCorta.length()){
                    masCorta = palabras.get(i);
                }

                if(palabras.get(i).length() > masLarga.length()){
                    masLarga = palabras.get(i);
                }
            }

        }

        try {
            socket.sendMessage(String.valueOf(masCorta));
            socket.sendMessage(String.valueOf(masLarga));
            socket.sendMessage(String.valueOf(suma));
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

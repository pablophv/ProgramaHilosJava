package ejercicio1;

public class Diccionario {
    String masCorta;
    String masLarga;
    int suma;

    public Diccionario(String masCorta, String masLarga, int suma) {
        this.masCorta = masCorta;
        this.masLarga = masLarga;
        this.suma = suma;
    }
    public synchronized void actualizarMasCorta(String masCorta){

        if(this.masCorta.length() > masCorta.length()){
            this.masCorta = masCorta;
        }
    }
    public synchronized void actualizarMasLarga(String masLarga){

        if(this.masLarga.length() < masLarga.length()){
            this.masLarga = masLarga;
        }
    }
    public synchronized void acturalizarSuma(int suma){
        this.suma +=suma;
    }
    public String getMasCorta() {
        return masCorta;
    }

    public String getMasLarga() {
        return masLarga;
    }

    public int getSuma() {
        return suma;
    }
}


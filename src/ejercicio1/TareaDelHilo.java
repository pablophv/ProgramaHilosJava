package ejercicio1;

public class TareaDelHilo implements Runnable{
    Diccionario diccionario;
    int numHilos,id;
    String[]array;

    public TareaDelHilo(Diccionario diccionario, int numHilos, int id, String[] array) {
        this.diccionario = diccionario;
        this.numHilos = numHilos;
        this.id = id;
        this.array = array;
    }

    @Override
    public void run() {

        int tamBloque = array.length / numHilos;
        int inicio = id * tamBloque;

        int fin = (id == numHilos - 1) ? array.length : inicio + tamBloque;

        int suma = 0;
        String masCortaLocal = array[id];
        String masLargaLocal = array[id];

        for (int i = inicio; i < fin; i++) {

            suma += array[i].length();

            if(masCortaLocal.length() > array[i].length()){
                masCortaLocal = array[i];
            }

            if(masLargaLocal.length() < array[i].length()){
                masLargaLocal = array[i];
            }
        }

        diccionario.acturalizarSuma(suma);
        diccionario.actualizarMasCorta(masCortaLocal);
        diccionario.actualizarMasLarga(masLargaLocal);
    }
}

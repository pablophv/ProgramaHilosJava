package ejercicio1;

public class ProgramaConHilos {

    public static void main(String[] args) {

        final int NUM_HILOS = 6;

        String[] palabras = {
                "hola", "mundo", "java", "programacion", "array", "string",
                "existen", "palabras", "estatico", "elementos", "codigo",
                "lorem", "ipsum", "dolor", "sit", "amet", "consectetur",
                "adipiscing", "elit", "sed", "do", "eiusmod", "tempor",
                "incididunt", "ut", "labore", "et", "dolore", "magna",
                "aliqua", "ut", "enim", "ad", "minim", "veniam",
                "quis", "nostrud", "exercitation", "ullamco", "laboris",
                "nisi", "ut", "aliquip", "ex", "ea", "commodo",
                "consequat", "duis", "aute", "irure", "dolor", "in",
                "reprehenderit", "in", "voluptate", "velit", "esse", "cillum",
                "dolore", "eu", "fugiat", "nulla", "pariatur", "excepteur",
                "sint", "occaecat", "cupidatat", "non", "proident", "sunt",
                "in", "culpa", "qui", "officia", "deserunt", "mollit",
                "anim", "id", "est", "laborum", "et", "dolore",
                "magna", "aliqua", "ut", "enim", "ad", "minim", "a",
                "veniam", "quis", "nostrud", "exercitation", "ullamco",
                "laboris", "nisi", "ut", "aliquip", "ex", "ea",
                "commodo", "consequat", "duis", "aute", "irure", "dolor",
                "in", "reprehenderit", "in", "voluptate", "velit", "esse",
                "cillum", "dolore", "eu", "supercalifragilisticoespialidoso",
                "fugiat", "nulla", "pariatur", "excepteur", "sint", "occaecat",
                "cupidatat", "non", "proident", "sunt", "in", "culpa", "qui",
                "officia", "deserunt", "mollit", "anim", "id", "est", "laborum",
                "et", "dolore", "magna", "aliqua", "ut", "enim", "ad",
                "minim", "veniam", "quis", "nostrud", "exercitation", "ullamco",
                "laboris", "nisi", "ut", "aliquip", "ex", "ea",
                "commodo", "consequat", "duis", "aute", "irure", "dolor",
                "in", "reprehenderit", "in", "voluptate", "velit", "esse",
                "cillum", "dolore", "eu", "fugiat", "nulla", "pariatur",
                "excepteur", "sint", "occaecat", "cupidatat", "non", "proident",
                "sunt", "in", "culpa", "qui", "officia", "deserunt",
                "mollit", "anim", "id", "est", "laborum"
        };

        Diccionario diccionario = new Diccionario(palabras[0],palabras[0],0);

        Thread [] hilos = new Thread[NUM_HILOS];

        for (int i = 0; i < hilos.length; i++) {

            hilos[i] = new Thread(new TareaDelHilo(diccionario,NUM_HILOS,i,palabras));
            hilos[i].start();
        }

        System.out.println("La palabra más corta es: " + diccionario.getMasCorta());
        System.out.println("El palabra más larga es: " + diccionario.getMasLarga());
        System.out.println("La suma de todas las palabras es: " + diccionario.getSuma());



    }
}

package ejercicio1;

public class ProgramaSecuencial {
    public static void main(String[] args) {
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

        String masCorta = palabras[0];
        String masLarga = palabras[0];
        int suma = 0;

        for(String palabra: palabras){
            if(palabra.length() < masCorta.length()){
                masCorta = palabra;
            }
            if(palabra.length() > masLarga.length()){
                masLarga = palabra;
            }

            suma+= palabra.length();
        }

        System.out.println("La palabra más corta es: " + masCorta);
        System.out.println("El palabra más larga es: " + masLarga);
        System.out.println("La suma de todas las palabras es: " + suma);
    }
}

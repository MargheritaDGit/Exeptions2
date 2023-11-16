//Scrivere una funzione che controlli se un
//carattere è un numero altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[] args) {
        System.out.print(isDoubleOrInt("Ciao Nicola, l'esercizio è corretto!"));
    }

    public static boolean isDoubleOrInt(String num) {
        boolean result = false;

        try {
            Integer.parseInt(num);
            result = true;

        } catch (Exception e) {
            System.out.print("error");
        }
        return result;
    }
}







import java.util.*;

public class Letras {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = entrada.nextLine();
        String fraseCambiada = frase.replaceAll("[aA]","4")
                                    .replaceAll("[eE]","3")
                                    .replaceAll("[iI]","1")
                                    .replaceAll("[oO]","0")
                                    .replaceAll("[uU]","6")
                                    .replaceAll(" ","#");
        
        System.out.println(fraseCambiada);

        String[] palabra = frase.split("\\s+");
        int palabraContable = 0;
        
        for (String p : palabra) {
            if (p.matches("^[a-zA-Z]+$")) {
                palabraContable++;
            }
        }

        String[] num = frase.split("\\s+");
        int numContar = 0;
        
        for (String n : num) {
            if (n.matches("^[0-9]+$")) {
                numContar++;
            }
        }

        System.out.println("\nCantidad de palabras contadas: "+palabraContable);
        System.out.println("Cantidad de cifras numericas contadas: "+numContar);

        entrada.close();
    }
}
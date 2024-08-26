import java.util.*;

public class Vectores {

    private static Scanner entrada = new Scanner(System.in);
    ArrayList<Integer> vectorA = new ArrayList<Integer>();
    ArrayList<Integer> vectorB = new ArrayList<Integer>();

    public void agregarValoresA(int cantidad){
        try{
            for(int x=0;x<cantidad;x++){
                System.out.println("Que numero deseas agregar al vector A:");
                int numero = entrada.nextInt();
                vectorA.add((Integer)numero);
            }
        }catch(Exception e){
            System.out.println("No colocaste los numeros correctos");
        }

    }
    public void agregarValoresB(int cantidad){
        for(int x=0;x<cantidad;x++){
            System.out.println("Que numero deseas agregar al vector B:");
            int numero = entrada.nextInt();
            vectorB.add((Integer)numero);
        }
    }
    public void sumaParesA(){
        int res = 0;
        for(int i:vectorA){
            if(i % 2 == 0){
                res += i;
            }
        }
        System.out.println("El resultado de la suma de numeros pares del conjunto A es: "+res);
    }
    public void sumaPrimosB(){
        int res = 0;
        
        System.out.println("El resultado de la suma de numeros primos del conjunto B es: "+res);
    }
    public void unionAuB(){
        for(int i:vectorA){
            System.out.println("La union de los conjuntos:");
            if(vectorB.contains(i)){
                System.out.println(i);
            }
            
        }
    }
    public static void main(String[] args){
        Vectores vector = new Vectores();
        System.out.println("A que vector deseas agregar datos [A,B]:");
        String opcion = entrada.nextLine();
        char opc = opcion.charAt(0);
        System.out.println("Cuantos datos deseas registrar:");
        int cantidad = entrada.nextInt();

        if( opc == 'A' || opc == 'a'){
            vector.agregarValoresA(cantidad);
        }
        else if(opc == 'B' || opc == 'b'){
            vector.agregarValoresB(cantidad);
        }
        System.out.println("Que opcion deseas seleccionar.\n1.la suma de todos los números pares del conjunto A\n" + //
                "2.la suma de todos los números primos de B\n" + //
                "3.la unión de A y B\n" + //
                "4.la intersección de A y B\n" + //
                "5.la diferencia de A – B\n" + //
                "6.la diferencia de B – A");

        int p = entrada.nextInt();
        if(p==1){
            vector.sumaParesA();
        }
        
    }
}

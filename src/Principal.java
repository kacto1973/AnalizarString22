import java.io.InputStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Analizaremos el caracter en la posicion 7 del texto.");
        System.out.println("(de ser posible)");

        Scanner input = new Scanner(System.in);

        String string = input.nextLine();

        LectorCadena lector = new LectorCadena();


        try{
            lector.caracterEn(string, 7);
        }catch (Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }








    }
}

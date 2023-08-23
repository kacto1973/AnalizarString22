public class Principal {

    public static void main(String[] args) throws Exception {

        String string = "hola";
        int entero = 4;

        caracterEn(string,entero);

    }//fin main

    public static void caracterEn (String string, int entero) throws Exception {

        int longitud = string.length();

        if(entero <= longitud){

            System.out.println("Cadena analizada: "+string);
            System.out.println("caracter "+entero+" en la cadena: "+string.charAt(entero));;

        }//fin if
        else{
            throw new Exception();
        }//fin else



    }

}//fin clase

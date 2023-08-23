import javax.swing.*;

public class SolicitaNumero {
    public static void main(String[] args) throws NumeroNegativoExcepcion {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero positivo: "));

        if(num >= 0){
            System.out.println("Raiz cuadrada: "+ Math.sqrt(num));
        }
        else{
            throw new NumeroNegativoExcepcion();
        }


    }
}

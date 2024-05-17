import javax.swing.*;
public class AccesoAplicación {

    public static void main(String[] args) {
        
        String clave="Juan";

        String pass="";

        while (clave.equals(pass)==false){

            pass=JOptionPane.showInputDialog("Introduzca la clave");

            if (clave.equals(pass)==false){

                System.out.println("Clave incorrecta");

            }

        }
        
        System.out.println("Clave correcta");

    }
    
}

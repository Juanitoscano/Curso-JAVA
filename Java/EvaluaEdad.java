import java.util.*;
public class EvaluaEdad {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();

        if(edad<18){

            System.out.println("Eres un joven");

        }
        else if(edad<40){

            System.out.println("Eres un adulto");

        }
        else if(edad<65){

            System.out.println("Eres un adulto mayor");
    
        }
        else{

            System.out.println("Eres un anciano");

        }

        /*if(edad>=18){

            System.out.println("Eres mayor de edad");

        }
        else{

            System.out.println("Eres menor de edad");

        }*/

    }
    
}

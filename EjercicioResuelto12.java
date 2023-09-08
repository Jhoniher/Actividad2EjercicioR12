//Calculo de salario dependiendo horas trabajadas
import java.util.Scanner;
public class EjercicioResuelto12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre=entrada.nextLine(); //Ingreso de dato nombre
        System.out.println("Ingrese las horas trabajas: ");
        int h_trabajadas=entrada.nextInt(); //Ingreso de horas trabajadas
        System.out.println("Ingrese el valor de la hora de trabajo: ");
        double valor_hora=entrada.nextDouble(); //Ingreso de valor de hora
        double salario=0;
        if(h_trabajadas<=40){ //Condición de si es menos de 40 horas trabajadas
            salario=h_trabajadas*valor_hora;
        }
        else{ //Condición si son más de 40 horas trabajadas
            if(h_trabajadas<=48){ //Si son más de 40 y menos de 48 se paga el doble
                salario=((h_trabajadas-40)*2*valor_hora)+40*valor_hora;
            }
            else{ //Si son más de 48 se paga el triple la hora
                salario=(40*valor_hora)+(8*2*valor_hora)+((h_trabajadas-48)*valor_hora*3);
            }
        }
        System.out.println("El salario del trabajador es: "+salario);

    }
}

import java.util.Scanner;
public class EjercicioResuelto12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese las horas trabajas: ");
        int h_trabajadas=entrada.nextInt();
        System.out.println("Ingrese el valor de la hora de trabajo: ");
        double valor_hora=entrada.nextDouble();
        double salario=0;
        if(h_trabajadas<=40){
            salario=h_trabajadas*valor_hora;
        }
        else{
            if(h_trabajadas<=48){
                salario=((h_trabajadas-40)*2*valor_hora)+40*valor_hora;
            }
            else{
                salario=(40*valor_hora)+(8*2*valor_hora)+((h_trabajadas-48)*valor_hora*3);
            }
        }
        System.out.println("El salario del trabajador es: "+salario);

    }
}

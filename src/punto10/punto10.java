/*
10.Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
•Si trabaja 40 horas o menos se le paga $5000 por hora
•Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un aumento del 20% por cada hora extra.

 */
package punto10;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class punto10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int horas;
        double salario_total,horas_extra = 0;
        final double valor_hora=5000, aumento=0.2;
        System.out.println("digite el numero de horas trabajadas: ");
        horas=entrada.nextInt();
        if (horas<=40){
            salario_total=valor_hora*horas;
        }else{
            horas_extra=horas-40;//se restan las primeras 40 horas
            horas_extra=(horas_extra*valor_hora)*aumento;
            salario_total=horas_extra+2000;//las primeras 40 horas tiene un valor de 2000 
        }
        System.out.println("el salario es: "+salario_total);
        System.out.println("el salario de las horas extras es: "+horas_extra);
    }
}
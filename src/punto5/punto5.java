/*
 5.El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente año. 
La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para que su nuevo saldo sea de U$10.000.
Si su capital tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un nuevo saldo de U$20.000, 
pero si su capital tiene actualmente un saldo superior a los U$20.000 no pedirá ningún préstamo.

Posteriormente repartirá su presupuesto de la siguiente manera:
•	U$5.000 para equipo de computo
•	U$2.000 para mobiliario
•	El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y, en caso de que fuera necesario, 
a cuánto ascendería la cantidad que se pediría al banco.
 */
package punto5;
import java.util.Scanner;
/**
 * @author DUVER NAVEROS COD: 20201187763
 */
public class punto5 {
     public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double capital, prestamo = 0, computo, mobiliario, resto, incentivos, insumos;
         System.out.println("digite el valor de su capital actual: ");
         capital=entrada.nextDouble();
         if (capital<0){
             prestamo=10000-capital;
             capital=10000;
         }else if(capital<20000){
             prestamo=20000-capital;
             capital=20000;
         }else if(capital>20000){
             prestamo=0;
         }
         
        computo=capital-5000;
        mobiliario=capital-2000;
        resto=capital-7000;
        insumos=resto/2;
        incentivos=resto/2;
        
        System.out.println("la cantidad para los insumos es: "+insumos);
        System.out.println("la cantidad de incentivos es: "+incentivos);
        System.out.println("cantidad a pedir al banco: "+prestamo);
     }
}

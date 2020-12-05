/*
En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, dicha promoción consiste en lo siguiente:
•Si se compran menos de cinco llantas el precio es de U$100 cada una, 
de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.
•Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra 
y la que tiene que pagar por el total de la compra.
*/
package punto2;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS   COD: 20201187763
 */
public class punto2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int cant, valor, total_pagar;
        System.out.println("digite la cantidad de llantas a llevar: ");
        cant= entrada.nextInt();
        if(cant<5){
            valor=100;
        }else{
            if(cant<=5 || cant<=10){
                valor=75;
            }else{
                valor=50;
            }
        }
        total_pagar=cant*valor;
        System.out.println("el valor unitario de llantas es: "+valor);
        System.out.println("el total a pagar es: "+total_pagar);
    }
}


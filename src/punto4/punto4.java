/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
    NUM. DE KILOS COMPRADOS		% DESCUENTO
        0 -   2				     0%
	2.01 - 5 			     10%
	5.01 - 10			     15%
	10.01 en adelante		     20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería
 */
package punto4;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS  cod: 20201187763
 */
public class punto4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int cant;
        double valor_unitario, descuento = 0, valor_total = 0, valor;
        
        System.out.println("digite la cantidad de manzanas: ");
        cant=entrada.nextInt();
        System.out.println("digite el valor por kilo: ");
        valor_unitario=entrada.nextDouble();
        
        if(cant<=2){
            descuento = 0;
        }else{
            if(cant==2.01 || cant <=5){
                descuento=0.10;
            }else if(cant==5.01 || cant <=10){
                    descuento = 0.15;
                }else{
                    descuento=0.20;
                }
            }
       valor=(cant*valor_unitario);
       descuento=valor*descuento;
       valor_total=valor-descuento;
       System.out.println("el valor a pagar es: "+valor);
       System.out.println("el descuento por la compra es: "+descuento);
       System.out.println("el total a pagar es: "+valor_total);
    }
}

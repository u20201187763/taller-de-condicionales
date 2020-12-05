/*
3.Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA, 
de algún aparato, si este cuesta U$500 o más. Además, independientemente de esto, 
ofrece un 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, 
un cliente cualquiera por la compra de su aparato. El IVA es del 19%.
 */
package punto3;
import java.util.Scanner;
/**
 * @author DUVER NAVEROS COD: 20201187763
 */
public class punto3 {
     public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        final double iva=0.19;
        double valor, descuento = 0, total_pagar, iva_calculo;
        String marca;
         System.out.println("digite el valor del reproductor: ");
         valor=entrada.nextDouble();
         System.out.println("digite la marca del reproductor: ");
         marca=entrada.next();
         if(marca.equals("NOSY")){
             if (valor>=500){
                 descuento=0.15;
             }else{
                 descuento=0.05;
             }
         }else{
              if (valor>=500){
                 descuento=0.10;
              }
              else{
                  descuento=0;
              }
         }
         descuento=(valor*descuento);
         iva_calculo=(valor*iva);
         total_pagar=(valor-descuento)+iva_calculo;
         System.out.println("el total a pagar es: "+total_pagar);
         System.out.println("tiene un descuento del: "+descuento);
         System.out.println("tasa del iva: "+iva_calculo);
    }
}

/*
 13.Una empresa automotriz necesita un sistema para seleccionar el tipo de carro 
(auto, SUV o camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) 
en otro menú. Al final se necesita que despliegue la selección realizada. 
Nota. Debe de anidarse una estructura de selección múltiple dentro de otra
 */
package punto13;
import java.util.Scanner;
/**
 *
 * @author DUVERNEY NAVEROS COD: 20201187763
 */
public class punto13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int tipo;
        String color;
        System.out.println("seleciona el tipo de carro: ");
        System.out.println("1. auto");
        System.out.println("2. SUV");
        System.out.println("3. camioneta");
        tipo=entrada.nextInt();
        switch(tipo){
            case 1:
                System.out.println("seleciona el color del auto: ");
                System.out.println("negro");
                System.out.println("blanco");
                System.out.println("rojo");
                color=entrada.next();
                switch(color){
                    case "negro":
                        System.out.println("el carro es de colo negro");
                        break;
                    case "blanco":
                        System.out.println("el carro es de colo blaco");
                        break;
                    case "rojo":
                        System.out.println("el carro es de colo rojo");
                        break;
                    default:
                        System.out.println("el color no se encuentra");
                }
                break;
            case 2:
                System.out.println("seleciona el color del RUV: ");
                System.out.println("negro");
                System.out.println("blanco");
                System.out.println("rojo");
                color=entrada.next();
                switch(color){
                    case "negro":
                        System.out.println("el RUV es de colo negro");
                        break;
                    case "blanco":
                        System.out.println("el RUV es de colo blaco");
                        break;
                    case "rojo":
                        System.out.println("el RUV es de colo rojo");
                        break;
                    default:
                        System.out.println("el color no se encuentra");
                    }
                break;
            case 3:
                System.out.println("seleciona el color la camioneta: ");
                System.out.println("negro");
                System.out.println("blanco");
                System.out.println("rojo");
                color=entrada.next();
                switch(color){
                    case "negro":
                        System.out.println("la camioneta es de colo negro");
                        break;
                    case "blanco":
                        System.out.println("la camioneta es de colo blaco");
                        break;
                    case "rojo":
                        System.out.println("la camioneta es de colo rojo");
                        break;
                    default:
                        System.out.println("el color no se encuentra");
                    }
                break;
            default:
                System.out.println("el tipo de carro no se encuentra en el menu");
        }
    }
}

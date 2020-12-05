/*
 12.Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar de una canasta una bolita la 
cual tiene un número grabado y si son mujeres lo mismo pero de otra canasta, los premios se dan bajo la siguiente tabla:	

	HOMBRES				        MUJERES
	# Bolita	Premio		       # bolita		Premio
	1		Desodorante		1		Loción
	2		Six-Pack de cerveza	2		Bikini
	3		Camiseta		3		Crema para la cara
	4		Pantaloneta		4		Plancha para el cabello
	5		Sudadera		5		Esmalte de uñas
 */
package punto12;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS COD:20201187763
 */
public class punto12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int bola;
        String genero;
        System.out.println("selecione el genero: hombre/mujer");
        genero=entrada.next();
        switch (genero) {
            case "hombre":
                System.out.println("digite el numero de la bola: ");
                bola=entrada.nextInt();
                switch(bola){
                    case 1:
                        System.out.println("desodorante");
                        break;
                    case 2:
                        System.out.println("six-pack de cerveza");
                        break;
                    case 3:
                        System.out.println("camiseta");
                        break;
                    case 4:
                        System.out.println("pantaloneta");
                        break;
                    case 5:
                        System.out.println("sudadera");
                        break;
                    default:
                        System.out.println("numero de bola no existe");
                }   break;
            case "mujer":
                System.out.println("digite el numero de la bola: ");
                bola=entrada.nextInt();
                switch(bola){
                    case 1:
                        System.out.println("locion");
                        break;
                    case 2:
                        System.out.println("bikini");
                        break;
                    case 3:
                        System.out.println("crema para la cara");
                        break;
                    case 4:
                        System.out.println("plancha de cabello");
                        break;
                    case 5:
                        System.out.println("esmalte de uñas");
                        break;
                    default:
                        System.out.println("numero de bola no existe");
                }   break;
            default:
                System.out.println("opcion incorrecta......");
                break;
        }
    }
}

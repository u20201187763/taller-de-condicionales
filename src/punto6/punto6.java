/*
 6.Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que el rango que le corresponde, se determina su resultado como positivo y en caso contrario como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:
		EDAD					NIVEL HEMOGLOBINA
		0 - 1 mes					13    - 26 g%
		> 1 y < = 6 meses				10    - 18 g%
		> 6 y < = 12 meses				11    - 15 g%
		> 1 y < = 5 años				11.5 - 15 g%
		> 5 y < = 10 años				12.6 - 15.5 g%
		> 10 y < = 15 años				13    - 15.5 g%
		Mujeres > 15 años				12    - 16 g%
		Hombres > 15 años				14    - 18 g%
 */
package punto6;
import java.util.Scanner;
/**
 * @author DUVERNEY NAVEROS cod. 20201187763
 */
public class punto6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int edad;
        double hemoglobina;
        String genero;
        System.out.println("selecione el tipo de edad: ");
        System.out.println("1. meses");
        System.out.println("2. años");
        edad=entrada.nextInt();
        if(edad==1){
            System.out.println("digite la cantidad de meses: ");
            edad=entrada.nextInt();
            System.out.println("digite el nivel de hemoglobina: ");
            hemoglobina=entrada.nextDouble();
            if((edad<=1) &&(hemoglobina>=13 && hemoglobina<=26)){
                System.out.println("negativo para enemia");
            }else if((edad>1 && edad<=6)&&(hemoglobina>=10 && hemoglobina<=18)){
                System.out.println("negativo para enemia ");
            }else if((edad>6 && edad<=12)&&(hemoglobina>=11 && hemoglobina<=15)){
                System.out.println("negativo para enemia ");
            }else{
                System.out.println("positivo para anemia");
            }
            
        }else{
            System.out.println("digite la cantidad de años: ");
            edad=entrada.nextInt();
            System.out.println("digite el nivel de hemoglobina: ");
            hemoglobina=entrada.nextDouble();
            System.out.println("seleccione el genero: hombre/mujer");
            genero=entrada.next();
            if((edad<=1 && edad<=5) &&(hemoglobina>=11.5 && hemoglobina<=15)){
                System.out.println("negativo para enemia: ");
            }else if((edad>5 && edad<=10)&&(hemoglobina>=12.6 && hemoglobina<=15.5)){
                System.out.println("negativo para enemia: ");
            }else if((edad>10 && edad<=15)&&(hemoglobina>=13 && hemoglobina<=15.5)){
                System.out.println("negativo para enemia: ");
            }else if((edad>15)&&(genero.equals("hombre"))&&(hemoglobina>=14 && hemoglobina<=18)){
                System.out.println("negativo para enemia: ");
            }else if(genero.equals("mujer")&&(hemoglobina>=12 && hemoglobina<=16)){
                System.out.println("negativo para enemia: ");
            }else{
                System.out.println("positivo para anemia");
            }
        }
    }
}

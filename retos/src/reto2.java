import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {

        Scanner datos=new Scanner(System.in);

        String nombreB,nombreM,vacuna;
        float pesoB;
        int edadB;
    
        System.out.println("Digite el nombre del bebe: ");
       
        nombreB=datos.next();
        
        System.out.println("Digite el peso en kilos del bebe: ");
        pesoB=datos.nextFloat();
        
        System.out.println("digite la edad en meses del bebe: ");
        edadB=datos.nextInt();
        
        System.out.println("Digite el nombre de la madre: ");
        nombreM=datos.next();
        
        System.out.println("Digite la vacuna administrada: ");
        vacuna=datos.next();
        
        pesoB = pesoB + 10;
        edadB = edadB * 10;
        float total=pesoB/edadB;
        float total2=total*8;
        
        System.out.print("Nombre del bebe= "+nombreB);
        
        System.out.print("Nombre de la madre= "+nombreM);
        
        System.out.print("Vacuna administrada= "+vacuna);
        
        System.out.print("Dosis de vacuna ha aplicar= "+total2);

        datos.close();
    }
    
}

import java.util.*;

public class reto5 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        int n = 0, pago = 0, precio = 0, decision=1;
        String nombreE, nombreC;

        System.out.println("Por favor digite el nombre del empleado");
        nombreE = datos.next();

        System.out.println("Por favor digite el nombre del cliente");
        nombreC = datos.next();

        System.out.println("Digite la cantidad de productos a comprar");
        n = datos.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Por favor digite el precio del producto "+i);
            precio = datos.nextInt();
        }

        System.out.println("el cliente esta registrado 1-si 2-no");
        decision = datos.nextInt();
        int total3 = n * precio;
        if(decision == 1){
            System.out.println("Su total fue: "+total3);

            System.out.println("Ingrese su pago");
            pago = datos.nextInt();

        }else{
        System.out.println("Lo siento no puede hacer la compra");
        }
        int total = n * precio;
        if(pago == total){
            System.out.println("Gracias por su compra");
        }else if(pago > total){
            int total2 = pago - total;
            System.out.println("Sus vueltas fueron " +total2);
        }else if(pago < total){
            System.out.println("Pago insuficiente");
        }
        datos.close();
    }
}
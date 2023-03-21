import java.util.*;
    public class reto4 {
        public static void main(String arg[ ]) {

            Scanner datos = new Scanner(System.in);
            String nombre;
            int apuesta = 0;

            Random moneda = new Random();
            
            int eleccion = (int)(Math.random()*3+1);
            int resultado = 0;
            

            System.out.println("Digite el nombre");
            nombre = datos.nextLine();

            System.out.println("Digite su apuesta");
            apuesta = datos.nextInt();

            System.out.println("Elija piedra, papel o tijera \n1-Piedra \n2-Papel \n3-tijera");
            resultado = datos.nextInt();

            if(apuesta < 10000){
                System.out.println("Lo siento no puede jugar apuesta insuficiente");
            }else if(eleccion == 1 && resultado == 1){
                System.out.println("ha quedado empate " +nombre);
            }else if(eleccion == 2 && resultado == 2){
                System.out.println("ha quedado empate " +nombre);
            }else if(eleccion == 3 && resultado == 3){
                System.out.println("ha quedado empate " +nombre);
            }else if(eleccion == 1 && resultado == 3){
                System.out.print("Lo siento usted ha perdido " +nombre+ " usted ha perdido " +apuesta);
            }else if(eleccion == 2 && resultado == 1){
                System.out.print("Lo siento usted ha perdido " +nombre+ " usted ha perdido " +apuesta);
            }else if(eleccion == 3 && resultado == 2){
                System.out.print("Lo siento usted ha perdido " +nombre+ " usted ha perdido " +apuesta);
            }else if(eleccion == 3 && resultado == 1){
                System.out.print("felicidades usted ha ganado " +nombre+ " usted ha ganado " +apuesta);
            }else if(eleccion == 2 && resultado == 3){
                System.out.print("felicidades usted ha ganado " +nombre+ " usted ha ganado " +apuesta);
            }else if(eleccion == 1 && resultado == 2){
                System.out.print("felicidades usted ha ganado " +nombre+ " usted ha ganado " +apuesta);
            }

            datos.close();
           
         }
     }

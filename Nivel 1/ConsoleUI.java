
/**
 * Write a description of class ConsoleUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsoleUI
{
    private static void clearScreen() {  
    System.out.print ('\f'); 
    System.out.flush();  
   } 
    public static void main (String [ ] args) {
     //Aquí las instrucciones del método
            taller taller = new taller();
            int teclaPulsada=0;
            do
            {
                clearScreen();
                System.out.print("Taller de coches.\n");
                System.out.print("Pulse una opción:\n");
                System.out.print("1 - Entrar como recepcionista");
                System.out.print("2 - Entrar como mecánico.\n");
                System.out.print("3 - Entrar como comercial.\n");
                System.out.print("4 - Salir.\n");
                try
                {
                teclaPulsada = System.in.read();
                }
                catch(java.io.IOException e)
                {}
                switch(teclaPulsada)
                {
                    case '1':
                    break;
                    case '2':
                    break;
                    case '3':
                    break;
                }
                
                }
            while(teclaPulsada!='4');
            
        }
                        

 

}


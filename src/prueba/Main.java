
package prueba;

/**
 *
 * @author Lab14
 */
public class Main {
    
        // ATRIBUTO
        String c;
        int d;
        int e;
        
        //metodos sobrecarga
        public void metodo1(){
            System.out.println("Buenas tardes");
        }
        
        public void metodo1(String c){    
            System.out.println("¿Como esta el dia de hoy, señoir o señorita? " + c);
        }
        
        public void metodo1(int d){    
            System.out.println("Usted tiene: " + d + " años");
        }
        
        //metodo con valor de retorno
        public int metodoInt(){
        return 10;
        }
        
        public String metodoString(){
        return "Espero que tenga un buen dia";
        }
    }
    
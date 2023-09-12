
package prueba;

public class Persona2 {

    //Atributos
    String nombre;
    int edad;
    
    //Metodos
    public void comer(){
        System.out.println("comer");
    }
    
    public void dormir(){
        System.out.println("me dormi");
    }
    
    //Sobrecarga de metodos
    public void correr(){
    }
    
    public void correr(int a){
    }
    
    //Metodos con valores de retorno
    public int año(){
        return 1;
    }
    
    public String texto(){
        return "hola";
    }
    
    public double num(){
        return 12.2;
    }
    
    //Metodos con parametros y argumentos
    public void metodo1(int a){
    }
    
    public void meotdo2(String a){
        
    }
    
}

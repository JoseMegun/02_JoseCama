package s08;

public class Calculadora {
    
    //Atributos
    int a;
    int b;

    
    //Sobrecarga de constructores
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculadora(int a) {
        this.a = a;
    }
    
    //Sobrecarga de metodos
    public void sumar(int a, int b){
        System.out.println("la suma es " + (a + b));
    }
    
    public int sumar(int a){
        return a+b;
    }
    
}


package Paquete3_Nuevo;

public class Privada {
    private String nombre;
    
    
    // Constructor
    public void Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
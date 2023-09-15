package Paquete_Principal;

import Paquete3_Nuevo.Privada;

public class Master {
    public static void main(String[] args) {
        Privada persona = new Privada();
        Publica pub = new Publica();
        
        pub.numero = 45;
        persona.nombre = "Manuel";
        
    }
}

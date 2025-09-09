/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.Map;

/**
 *
 * @author Capotes
 */
public class TrabajoPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        DirectorioTelefonico directorio1=new DirectorioTelefonico();
        
        
       Contacto contacto1=new Contacto("225598", "Gabriela", "Diaz", "San Luis", "Los Membrillos 658");
        
       Contacto contacto2=new Contacto("236984", "Santi", "Duarte", "Juana Koslay", "Los Duraznos 369 ");
         
       Contacto contacto3=new Contacto("252562", "Lara", "Saavedra", "La Toma", "Los Jazmines 678 ");
          
       Contacto contacto4=new Contacto("269874", "Franco", "Martinez", "El Trapiche", "Los Peros 647 ");
                      
       Contacto contacto5=new Contacto("278964", "Victoria", "Ritys", "Merlo", "Los Guindos 617 ");
        
  
        directorio1.agregarContacto(158789664L, contacto1);
        directorio1.agregarContacto(15887766L, contacto2);
        directorio1.agregarContacto(15665544L, contacto3);
        directorio1.agregarContacto(15443322L, contacto4);
        directorio1.agregarContacto(15332211L, contacto5);
        //ESTE FOR AGREGA LAS CIUDADES CREADAS POR LA GABYY DE LOS CONTACTOS
        //for (Contacto aux :directorio1.mostrarDirectorioTelefonico().values() ) {
            
          //  directorio1.agregarCiudad(aux.getCiudad());
           
        //}
        System.out.println("Mostrando directorio");
        
        for (Map.Entry<Long, Contacto> entry : directorio1.mostrarDirectorioTelefonico().entrySet()) {
            Long key = entry.getKey();
            Contacto val = entry.getValue();
            System.out.println(val.getCiudad());
        }
        
        System.out.println("---------------------");
     
         System.out.println("Contacto");
         
         System.out.println(directorio1.buscarContacto(158789664L));
         
         System.out.println("Telefono");
         
         System.out.println(directorio1.buscarTelefono("Duarte"));
         
         System.out.println("Contacto");
         
         System.out.println(directorio1.buscarContactos("San Luis"));
         
     
         
         
        
        
        
        
    }
    
}

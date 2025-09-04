/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

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
        
        Contacto contacto2=new Contacto("236984", "Santi", "Duarte", "Mendoza", "Los Duraznos 369 ");
         
         Contacto contacto3=new Contacto("252562", "Lara", "Saavedra", "San Luis", "Los Jazmines 678 ");
          
          Contacto contacto4=new Contacto("269874", "Franco", "Martinez", "San Juan", "Los Peros 647 ");
                      
          Contacto contacto5=new Contacto("278964", "Victoria", "Ritys", "La Rioja", "Los Guindos 617 ");
        
  
        directorio1.agregarContacto(158789664L, contacto1);
         directorio1.agregarContacto(15887766L, contacto2);
         directorio1.agregarContacto(15665544L, contacto3);
         directorio1.agregarContacto(15443322L, contacto4);
         directorio1.agregarContacto(15332211L, contacto5);
        
        
         
         System.out.println(directorio1.buscarContacto(158789664L));
         
         System.out.println(directorio1.buscarTelefono("Duarte"));
         
         System.out.println(directorio1.buscarContactos("San Luis"));
        
        
        
        
    }
    
}

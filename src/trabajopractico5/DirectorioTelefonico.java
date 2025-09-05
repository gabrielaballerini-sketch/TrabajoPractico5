/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * Una clase Directorio telefónico posee una lista de Contactos de los que interesa conocer
su DNI, nombre, apellido, Ciudad y dirección. El Directorio, cuenta con un TreeMap de un teléfono
tipo Long(Key),se empareja con un Contacto(valor). 
* 
* Además, posee las siguientes funcionalidades:
A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de
teléfono. Siendo el nro. del teléfono la clave del mismo.
B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.
C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números
de teléfono asociados a dicho apellido.
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los
Contactos asociados a dicha ciudad.
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
❖ Importante: Armar el modelo de clases UML representado las clases necesarias.
❖ Implementar en java con TreeMap<Long, Cliente>, TreeSet, e Iterator. Recuerde el uso de:
keySet, entrySet, en los if se sugiere containsKey, containsValue.
❖ Probar en el main, agregar 4~5 Contactos, y probar todo métodos entre A y E.

 */
public class DirectorioTelefonico {
    
    
    
    
    
    TreeMap<Long,Contacto> directorio=new TreeMap<>();
    
    
    
    
    public void agregarContacto(Long tel, Contacto contacto){
        
       directorio.put(tel, contacto);
    
    
    }
    
   
    
    public Contacto buscarContacto(Long telef){
        
         Contacto contacto1 = null;
        
        boolean existe=directorio.containsKey(telef);
        
        if (existe){
        
        
        contacto1=directorio.get(telef);
        
        }else{
        
            System.out.println("No existe un contacto con ese numero");
        
        }
       
        return contacto1;
    
    
    }
    
    
      public Set<Long> buscarTelefono(String apellido){
          
          
          
         
          
          Set <Long> telefonos=new HashSet<>();
                  
                  
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            Long key = entry.getKey();
            Contacto value = entry.getValue();
            
            if (value.getApellido().equalsIgnoreCase(apellido)){
            
          telefonos.add(key);
            
            }
            
        }
          
            if(telefonos.isEmpty()){
            
                System.out.println("No existe en la base de datos el apellido");
            }
             
            
        
        return telefonos;
       
       
    
    
    }
         
      
      
      
      public ArrayList  buscarContactos(String ciudad){
      
          
          ArrayList<Contacto> array1=new ArrayList<>();
          
      
          for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
              Long key = entry.getKey();
              Contacto value = entry.getValue();
              
              
              
              if(value.getCiudad().equalsIgnoreCase(ciudad)){
              
              array1.add(value);
              
              
              }
              
              
          }
        return array1;
      
      }
      
      
      
      
      
      public void  borrarContacto(Long tel){
      
      
      if (directorio.containsKey(tel)){
      
      
      directorio.remove(tel);
      
      }else{
      
      
          System.out.println("No existe en la base de datos ese numero de telefono");
      }
      
      
      }
    
    
}

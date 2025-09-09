/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import trabajopractico5.Contacto;
import trabajopractico5.DirectorioTelefonico;
import trabajopractico5.TrabajoPractico5;

/**
 *
 * @author Capotes
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {
 
    public static DirectorioTelefonico directorio;
    public static TreeSet<String> ciudades =new TreeSet();
 
    
    public FrmMenuPrincipal() {
        initComponents();
        //NO TOQUEN ESTO POR QUE SINO NO SE VE LA VENTANA DE AGREGAR CIUDAD 
        agregarCiudad.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        agregarCiudadActionPerformed(evt);
    }
});
        
        directorio=new DirectorioTelefonico();
        
        
    }
    
   

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCliente = new javax.swing.JMenu();
        jMAgregar = new javax.swing.JMenuItem();
        jMBuscar = new javax.swing.JMenuItem();
        jMBorrar = new javax.swing.JMenuItem();
        jDirectorioBuscarCliente = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMBuscarTelefonoApellido = new javax.swing.JMenuItem();
        jCiudades = new javax.swing.JMenu();
        agregarCiudad = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        jCliente.setText("Clientes");

        jMAgregar.setText("Agregar Cliente");
        jMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAgregarActionPerformed(evt);
            }
        });
        jCliente.add(jMAgregar);

        jMBuscar.setText("Buscar Cliente");
        jMBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBuscarActionPerformed(evt);
            }
        });
        jCliente.add(jMBuscar);

        jMBorrar.setText("Borrar Cliente");
        jMBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBorrarActionPerformed(evt);
            }
        });
        jCliente.add(jMBorrar);

        jMenuBar1.add(jCliente);

        jDirectorioBuscarCliente.setText("Directorio ");

        jMenuItem2.setText("Buscar clientes por ciudad");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jDirectorioBuscarCliente.add(jMenuItem2);

        jMBuscarTelefonoApellido.setText("Buscar teléfono por apellido");
        jMBuscarTelefonoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBuscarTelefonoApellidoActionPerformed(evt);
            }
        });
        jDirectorioBuscarCliente.add(jMBuscarTelefonoApellido);

        jMenuBar1.add(jDirectorioBuscarCliente);

        jCiudades.setText("Ciudades");

        agregarCiudad.setText("Agregar Ciudad");
        jCiudades.add(agregarCiudad);

        jMenuBar1.add(jCiudades);

        jSalir.setText("Salir");
        jSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jSalirMenuSelected(evt);
            }
        });
        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void agregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jDesktop.removeAll();   // ahora sí lo reconoce
        jDesktop.repaint();
        AgregarCiudades agregarciudades = new AgregarCiudades();
        jDesktop.add(agregarciudades);
        agregarciudades.setVisible(true);
        jDesktop.moveToFront(agregarciudades);
    }
    private void jMBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBuscarActionPerformed
      jDesktop.removeAll();
      jDesktop.repaint();
      BuscarCliente buscarcliente=new BuscarCliente();
      buscarcliente.setVisible(true);
      jDesktop.add(buscarcliente);
      jDesktop.moveToFront(buscarcliente);
    }//GEN-LAST:event_jMBuscarActionPerformed

    private void jMBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBorrarActionPerformed
      jDesktop.removeAll();
      jDesktop.repaint();
      BorrarCliente borrarcliente=new BorrarCliente();
      borrarcliente.setVisible(true);
      jDesktop.add(borrarcliente);
      jDesktop.moveToFront(borrarcliente);
    }//GEN-LAST:event_jMBorrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      jDesktop.removeAll();
      jDesktop.repaint();
      BuscarClienteCiudad buscarclienteciudad=new BuscarClienteCiudad();
      buscarclienteciudad.setVisible(true);
      jDesktop.add(buscarclienteciudad);
      jDesktop.moveToFront(buscarclienteciudad);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMBuscarTelefonoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBuscarTelefonoApellidoActionPerformed
      jDesktop.removeAll();
      jDesktop.repaint();
      BuscarTelefonoApellido buscarclientetelefono=new BuscarTelefonoApellido();
      buscarclientetelefono.setVisible(true);
      jDesktop.add(buscarclientetelefono);
      jDesktop.moveToFront(buscarclientetelefono);
    }//GEN-LAST:event_jMBuscarTelefonoApellidoActionPerformed

    private void jMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAgregarActionPerformed
      jDesktop.removeAll();
      jDesktop.repaint();
      
      AgregarCliente agregarcliente=new AgregarCliente();
      
      agregarcliente.setVisible(true);
      jDesktop.add(agregarcliente);
      
      jDesktop.moveToFront(agregarcliente);
      
    }//GEN-LAST:event_jMAgregarActionPerformed

    private void jSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jSalirMenuSelected
        System.exit(0);
    }//GEN-LAST:event_jSalirMenuSelected

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        TrabajoPractico5.main(args);
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               
               
        
                        
                
                
                
                new FrmMenuPrincipal().setVisible(true);
            }
            
            
           
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarCiudad;
    private javax.swing.JMenu jCiudades;
    private javax.swing.JMenu jCliente;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jDirectorioBuscarCliente;
    private javax.swing.JMenuItem jMAgregar;
    private javax.swing.JMenuItem jMBorrar;
    private javax.swing.JMenuItem jMBuscar;
    private javax.swing.JMenuItem jMBuscarTelefonoApellido;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
/*
public static ArrayList<String> cidudades(String ciudadesadd){
    ArrayList<String> listaCidudades = new ArrayList();
    if(ciudadesadd.isEmpty()){
    JOptionPane.showMessageDialog(null, "Por favor, agrege una ciudad");
    }else{
    listaCidudades.add(ciudadesadd);
    }
        
    
return listaCidudades;
}
*/
   public void llenarCiudades(){
       for (Map.Entry<Long, Contacto> en : directorio.mostrarDirectorioTelefonico().entrySet()) {
           Long key = en.getKey();
           Contacto val = en.getValue();
           ciudades.add(val.getCiudad());
       }
   
   } 
    
    
}

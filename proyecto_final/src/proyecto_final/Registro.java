/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reych
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public boolean mostrar = true;
    Connection con = null;
    Statement stmt = null;
    
    public Registro() {
        initComponents();
        this.setTitle("Registro");
        this.setLocation(600, 200);
         txtPassOculto.setVisible(true);
        txtPassVisible.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txtPassOculto = new javax.swing.JPasswordField();
        txtPassVisible = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setText("puesto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setText("Correo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 196, -1, -1));

        jLabel6.setText("Registro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));

        txt_puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_puestoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, -1));

        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, -1));

        txtPassOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassOcultoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        txtPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassVisibleActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jButton3.setText("Login");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setText("ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 60, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

                   String c1,c2,c3,c4,c5;
        
        c1 = txt_name.getText();
        c2 = txt_puesto.getText();
        c3 = txt_correo.getText();
        c4 = txtPassOculto.getText().toString();
         c5 = txt_id.getText();
        
       if (txt_name.getText().equals("") || (txt_puesto.getText().equals("")) || (txt_correo.getText().equals(""))
           || (txtPassOculto.getText().equals("")) ) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_name.requestFocus();
        } 
 
        else {
        try {
           
            String url = "jdbc:mysql://localhost:3306/res";
          String usuario = "Corona";
            String contrasena = "1234";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contrasena); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate (" INSERT INTO registro VALUES ('" + 0 + "','"+c1+"','"+c2+"','"+c3+"','"+c4+",'"+c5+" )");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( SQLException e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txt_name.setText("");
        this.txt_id.setText("");
        this.txt_puesto.setText("");
        this.txt_correo.setText("");
        this.txtPassOculto.setText(""); 
        

        
        
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
 
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txtPassOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassOcultoActionPerformed

        
    }//GEN-LAST:event_txtPassOcultoActionPerformed

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
   char c = evt.getKeyChar();
    
    if((c<'a' || c>'z') && (c<'A' || c>'Z')
   && (c!=(char)KeyEvent.VK_SPACE))
{
   evt.consume();
}
        
   
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_puestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_puestoKeyTyped
    char c = evt.getKeyChar();
    
    if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'!' || c>'.')
   && (c!=(char)KeyEvent.VK_SPACE))
{
   evt.consume();
}
    }//GEN-LAST:event_txt_puestoKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
    char c = evt.getKeyChar();
    
    if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'!' || c>'.')
   && (c!=(char)KeyEvent.VK_SPACE))
{
   evt.consume();
}
    }//GEN-LAST:event_txt_correoKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        
     if (mostrar)
         {
            //Ocultamiento y muestreo de componentes
            txtPassVisible.setVisible(true);
            txtPassOculto.setVisible(false);
            
            //Consultamos el valor existente de Pass Oculto 
            //lo añadimos como nuevo valor para Pass Visible.
            txtPassVisible.setText(txtPassOculto.getText());
            
            //Le decimos al sistema que en el proximo click que de el 
            //usuario debe de mostrarse la contrseña en modo Oculto.
            mostrar = false;
         }else{
                //Ocultamiento y muestreo de componentes
                txtPassVisible.setVisible(false);
                txtPassOculto.setVisible(true);
                
                //Consultamos el valor existente de Pass Visible
                //lo añadimos como nuevo valor para Pass Oculto.
                txtPassOculto.setText(txtPassVisible.getText());
                
                //Le decimos al sistema que en el proximo click que de el 
                //usuario debe de mostrarse la contrseña en modo visible.
                mostrar = true;
              }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassVisibleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
      login Registro =new login();
     Registro.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassOculto;
    private javax.swing.JTextField txtPassVisible;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_puesto;
    // End of variables declaration//GEN-END:variables

    private void st(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stmt(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

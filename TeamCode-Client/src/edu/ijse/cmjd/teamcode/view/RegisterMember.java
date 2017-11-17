/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.view;

import edu.ijse.cmjd.teamcode.controller.UserController;
import edu.ijse.cmjd.teamcode.dto.LogInDTO;
import edu.ijse.cmjd.teamcode.dto.UserDTO;
import edu.ijse.cmjd.teamcode.serverconnector.ServerConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author janith
 */
public class RegisterMember extends javax.swing.JFrame {
    private boolean match=false;
    private boolean uAvail=false;
    private String imgPath="";
    /**
     * Creates new form RegisterMember
     */
    public RegisterMember() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnameTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        unameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwd2Txt = new javax.swing.JPasswordField();
        pwdTxt = new javax.swing.JPasswordField();
        matchLbl = new javax.swing.JLabel();
        availableLbl = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up to TeamCode");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(84, 84, 84));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Sign Up to TeamCode");

        profImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/cmjd/teamcode/img/User.png"))); // NOI18N
        profImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profImgMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Last Name");

        jPanel2.setBackground(new java.awt.Color(93, 93, 93));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Login Details");

        unameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameTxtKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Again");

        pwd2Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwd2TxtKeyReleased(evt);
            }
        });

        pwdTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdTxtKeyReleased(evt);
            }
        });

        matchLbl.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        matchLbl.setForeground(new java.awt.Color(93, 233, 71));
        matchLbl.setText("           ");

        availableLbl.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        availableLbl.setForeground(new java.awt.Color(93, 233, 71));
        availableLbl.setText("           ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(unameTxt)
                    .addComponent(pwd2Txt)
                    .addComponent(matchLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(availableLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(unameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwd2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cancelBtn.setText("Cancel");

        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Click to Change");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(lnameTxt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        if(match){
            if(!uAvail){
                try {
                    UserController userCntlr=ServerConnector.getServerConnector().getUserController();
                    if(fnameTxt.getText().length()>0 && lnameTxt.getText().length()>0 && unameTxt.getText().length()>0 && pwdTxt.getPassword().length>0 && pwd2Txt.getPassword().length>0 ){
                        LogInDTO loginData=new LogInDTO(unameTxt.getText(), fixPwd(pwdTxt.getPassword()));
                        
                        UserDTO userData=null;
                        
                        if(!imgPath.equals("")){
                            byte[] imgData=readImgToBytes();
                            File file=new File(imgPath);

                            userData=new UserDTO(unameTxt.getText(), fnameTxt.getText(), lnameTxt.getText(),file.getName(), 0,"user",imgData);
                        }else{
                            userData=new UserDTO(unameTxt.getText(), fnameTxt.getText(), lnameTxt.getText(),"user.png", 0,"user",null);
                        }
                        
                        if(userCntlr.registerUser(loginData, userData)){
                            JOptionPane.showMessageDialog(this, "You have successfully registered.\nPlease wait for the Admin to Confirm your Registration.","Success!", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(this, "Something went wrong.\nPlease Try Again after some time.","Failed!", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "There are empty Fields.\nPlease Fill All Fields.","Fill All Fields", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Something went wrong.\nPlease Try Again after some time.\nError:\n"+ex.getMessage(),"Failed!", JOptionPane.ERROR_MESSAGE);
                } 
            }else{
                JOptionPane.showMessageDialog(this, "Username is not available.\nPlease try another.","Username not Available", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(match==false && pwd2Txt.getPassword().length>0 && pwdTxt.getPassword().length>0){
            JOptionPane.showMessageDialog(this, "Both Passwords needs to be same.\nPlease check it.","Check Password", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "There are empty Fields.\nFill All Fields.","Fill All Fields", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void pwdTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdTxtKeyReleased
        if(Arrays.equals(pwdTxt.getPassword(), pwd2Txt.getPassword())){
            match=true;
            matchLbl.setText("Matched.");
        }else{
            match=false;
            matchLbl.setText("Not Matched.");
        }
    }//GEN-LAST:event_pwdTxtKeyReleased

    private void pwd2TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwd2TxtKeyReleased
        if(Arrays.equals(pwdTxt.getPassword(), pwd2Txt.getPassword())){
            match=true;
            matchLbl.setText("Matched.");
        }else{
            match=false;
            matchLbl.setText("Not Matched.");
        }
    }//GEN-LAST:event_pwd2TxtKeyReleased

    
    private void unameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameTxtKeyReleased
        try {
            UserController ucont=ServerConnector.getServerConnector().getUserController();
            uAvail=ucont.foundUname(unameTxt.getText());
            if(uAvail!=true){
                availableLbl.setText("Available");
            }else{
                availableLbl.setText("Not Available");
            }
            
        } catch (RemoteException ex) {
            System.out.println("1");
        } catch (ClassNotFoundException ex) {
            System.out.println("2");
        } catch(NullPointerException ek){
            System.out.println(ek.getMessage());
        } catch (NotBoundException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_unameTxtKeyReleased

    private void unameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameTxtKeyPressed

    }//GEN-LAST:event_unameTxtKeyPressed

    private void profImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profImgMouseClicked
        final JFileChooser fc = new JFileChooser();
        BufferedImage img = null;
        fc.showOpenDialog(this);

        // Open an input stream
        if(fc.getSelectedFile()!=null){
            imgPath=fc.getSelectedFile().getAbsolutePath();
            File file=new File(imgPath);

            if(!file.getName().toLowerCase().endsWith(".png") || file.isDirectory()){
                JOptionPane.showMessageDialog(this, "Please Select PNG file.","Not a valid file", JOptionPane.ERROR_MESSAGE);
                imgPath="";
            }else{
                try {
                    img = ImageIO.read(file);
                    Image dimg = img.getScaledInstance( profImg.getWidth(),profImg.getHeight(), Image.SCALE_SMOOTH) ;//.getSubimage(0, 0, profImg.getWidth(),profImg.getHeight());//.getScaledInstance(profImg.getWidth(),profImg.getHeight(),Image.SCALE_SMOOTH);
                    profImg.setIcon(new ImageIcon(dimg));
                } catch (IOException ex) {
                    Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_profImgMouseClicked

    private String fixPwd(char[] txt){
        String word="";
        for(int i=0;i<txt.length;i++){
            word=word+txt[i];
        }
        return word;
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterMember().setVisible(true);
//            }
//        });
//    }
    
    private byte[] readImgToBytes(){
        try {
            Path path = Paths.get(imgPath);
            byte[] imgData = Files.readAllBytes(path);
            
            return imgData;
        } catch (IOException ex) {
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JLabel matchLbl;
    private javax.swing.JLabel profImg;
    private javax.swing.JPasswordField pwd2Txt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField unameTxt;
    // End of variables declaration//GEN-END:variables
}
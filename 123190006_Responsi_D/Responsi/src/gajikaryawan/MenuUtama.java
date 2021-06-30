/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

/**
 *
 * @author User
 */
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MenuUtama {

Connector connector = new Connector();  

JFrame window = new JFrame("Main Menu");

JLabel lMenu = new JLabel("Main Menu");
JButton btnTambah = new JButton("Tambah Karyawan");
JButton btnLihat = new JButton("Lihat Karyawan");


   public MenuUtama(){
    window.setLayout(null);
    window.setSize(190,120);
    //  window.setDefaultCloseOperation(3);
    
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);

    
    window.add(lMenu);
    window.add(btnTambah);
    window.add(btnLihat);
    
    //LABEL
        lMenu.setBounds(55, 5, 120, 20);
    //BUTTON PANEL
        btnTambah.setBounds(10, 25, 150, 20);
        btnLihat.setBounds(10, 45, 150, 20);
        
        
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                InputData input = new InputData();
                    
                
        }
            
        });
        btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                LihatKaryawan lihat = new LihatKaryawan();                
        }
      });
   }
}

   

   


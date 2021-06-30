/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author mumta
 */
public class Gaji extends JFrame {
    
    JLabel lJudul = new JLabel("Update Data Karyawan");
    
    JLabel lNama = new JLabel("Nama");
    JLabel lUsia = new JLabel("Usia");
    JLabel lGaji = new JLabel("Gaji");
    
    
    public final JTextField tfNama = new JTextField(10);
    public final JTextField tfUsia= new JTextField(10);
    public final JTextField tfGaji = new JTextField(10);
    
    public JButton btnUpdate = new JButton("Ganti Data");
    public JButton btnDelete = new JButton("Hapus");
   
    public JButton btnKembalii = new JButton("Menu Awal");
    
     public Gaji(){
         
        setVisible(true);
        setTitle("Update Data Karyawan");
        setSize(300,250);
        setLayout(null);
        
        add(lJudul);
        add(lNama);
        add(lUsia);
        add(lGaji);
        add(tfNama);
        add(tfGaji);
        add(tfUsia);  
        add(btnUpdate);
        add(btnDelete); 
        add(btnKembalii);
        
        lJudul.setBounds(20,5,200,20);
        lNama.setBounds(20,30,120,20);
        tfNama.setBounds(130,30,150,20);
        
        lUsia.setBounds(20,60,120,20);
        tfUsia.setBounds(130,60,150,20);
        
        lGaji.setBounds(20,90,120,20);
        tfGaji.setBounds(130,90,150,20);
        
        btnUpdate.setBounds(60,130,90,20);
        btnDelete.setBounds(160,130,90,20);
        btnKembalii.setBounds(20,165,250,20);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
     
     
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getUsia(){
        return tfUsia.getText();
    }
    
    public String getGaji(){
        return tfGaji.getText();
    }
}

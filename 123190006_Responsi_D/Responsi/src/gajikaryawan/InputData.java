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
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class InputData {
  
            

    Connector connector = new Connector();    

    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("Input Karyawan");
    
    JLabel lJudul = new JLabel("Input Karyawan  ");
    JLabel lNama = new JLabel("Nama  ");
        JTextField tfNama = new JTextField();
    JLabel lUsia = new JLabel("Usia  ");
        JTextField tfUsia = new JTextField();
    JLabel lGaji= new JLabel("Gaji ");
        JTextField tfGaji = new JTextField();

    
    
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");

    
    
    public InputData(){
        window.setLayout(null);
        window.setSize(340,250);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);


       // setDefaultCloseOperation(EXIT_ON_CLOSE);

//ADD COMPONENT
        window.add(lUsia);
        window.add(tfNama);
        window.add(lJudul);
        window.add(tfUsia);
        window.add(tfGaji);
        window.add(lNama);
        window.add(lGaji);
        window.add(btnSubmit);
        window.add(btnReset);
        window.add(btnKembali);



//LABEL
        lJudul.setBounds(5, 5, 120, 20);
        lNama.setBounds(5, 35, 120, 20);
        lUsia.setBounds(5, 60, 120, 20);
        lGaji.setBounds(5,85,120,20);


//TEXTFIELD
        tfNama.setBounds(110, 35, 200, 20);
        tfUsia.setBounds(110, 60, 200, 20);
        tfGaji.setBounds(110, 85, 200, 20);



//BUTTON PANEL
        btnSubmit.setBounds(80, 130, 110, 20);
        btnReset.setBounds(200,130,110,20);
        btnKembali.setBounds(5,160,305,20);
        
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            try {                              
            String query = "INSERT INTO `karyawan`(`nama`, `usia`,`gaji`) VALUES ('"+getNama()+"','"+getUsia()+"','"+getGaji()+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            JOptionPane.showMessageDialog(null,"Insert Berhasil !!");
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Usia dan Gaji harus bilangan");
            }
            }
        });
        btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            tfNama.setText(null);
            tfUsia.setText(null);
            tfGaji.setText(null);

            }
        });
        btnKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            
                MenuUtama menu = new MenuUtama();
            }
        });
        
    }
   public String getNama() {
        return tfNama.getText();
      
    }

    public double getUsia() {
        
        return Double.parseDouble(tfUsia.getText());
    }

    public Double getGaji() {
        return Double.parseDouble(tfGaji.getText());
    }

    public void inputDB(){

    }
    
}

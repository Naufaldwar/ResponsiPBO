/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author User
 */
public class LihatKaryawan extends InputData {
    public String nama;
    public Double gaji,usia;
    String data[][] = new String[500][4];
    int jmlData = 0; 
    Connector connector = new Connector();    

    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("Data Karyawan");
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Nama","Usia","Gaji"}; //membuat kolom dgn array tipe object;

    public LihatKaryawan(){
        window.setLayout(null);
        window.setSize(550,280);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setResizable(false);
        
        JButton btnKembali = new JButton("Kembali");
        window.add(btnKembali);
        btnKembali.setBounds(0,200,535,20);
        
        try{
            //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `karyawan`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlData][0] = resultSet.getString("ID"); 
                data[jmlData][1] = resultSet.getString("nama"); 
                data[jmlData][2] = resultSet.getString("usia");
                data[jmlData][3] = resultSet.getString("gaji");
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }

        tabel = new JTable(data,namaKolom); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        window.add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 150);
       btnKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            
                MenuUtama menu = new MenuUtama();
               
            }
        });
       tabel.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
              
                    int row = tabel.getSelectedRow();
                    String row_id = (tabel.getModel().getValueAt(row, 3).toString());
                    tfNama.setText(nama);
                    tfUsia.setText(row_id);
                    tfGaji.setText(row_id);
                   Gaji gaji = new Gaji();
            }
               
            
        });
       
    }
}

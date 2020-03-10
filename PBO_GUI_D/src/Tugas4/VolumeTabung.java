package Tugas4;

import javax.swing.*;
import java.awt.event.*;
public class VolumeTabung {
    public static void main(String[] args){
        new VTabung();
    }
}
class VTabung extends JFrame implements ActionListener{
    JLabel r = new JLabel(" Jari-jari: ");
    JLabel t = new JLabel(" Tinggi:  ");
    JLabel hasil = new JLabel("Hasil = ");

    JTextField fjari = new JTextField(10);
    JTextField ftinggi = new JTextField(10);

    private JButton btnHasil = new JButton(" Hasil ");
    private JButton btnBack = new JButton(" Kembali ");

    public VTabung(){
        setTitle("Volume Tabung");
        setSize(350,300);

        btnHasil.addActionListener(this);
        btnBack.addActionListener(this);

        setLayout(null);
        add(r);
        add(fjari);
        add(t);
        add(ftinggi);
        add(btnHasil);
        add(hasil);
        add(btnBack);

        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen
        r.setBounds(10,10,120,20);
        fjari.setBounds(130,10,120,20);
        t.setBounds(10,30,120,20);
        ftinggi.setBounds(130,30,120,20);
        btnHasil.setBounds(10,80,100,20);
        hasil.setBounds(10,100,200,20);
        btnBack.setBounds(200,130,100,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnHasil){
            double r = Double.parseDouble(fjari.getText());
            double t = Double.parseDouble(ftinggi.getText());
            final double phi = 3.14;
            double output;
            output = phi*r*r*t;
            hasil.setText("Hasil = "+output);
        }
        else if(e.getSource()==btnBack){
            new GUI();
        }
    }

}

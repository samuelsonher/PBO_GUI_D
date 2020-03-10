package Tugas4;

import javax.swing.*;
import java.awt.event.*;
public class VolumeBalok {
    public static void main(String[] args){
        new VBalok();
    }
}
class VBalok extends JFrame implements ActionListener{
    JLabel p = new JLabel(" Panjang: ");
    JLabel l = new JLabel(" Lebar:   ");
    JLabel t = new JLabel(" Tinggi:  ");
    JLabel hasil = new JLabel("Hasil = ");

    JTextField fpanjang = new JTextField(10);
    JTextField flebar = new JTextField(10);
    JTextField ftinggi = new JTextField(10);

    private JButton btnHasil = new JButton(" Hasil ");
    private JButton btnBack = new JButton(" Kembali ");

    public VBalok(){
        setTitle("Volume Balok");
        setSize(350,300);

        btnHasil.addActionListener(this);
        btnBack.addActionListener(this);

        setLayout(null);
        add(p);
        add(fpanjang);
        add(l);
        add(flebar);
        add(t);
        add(ftinggi);
        add(btnHasil);
        add(hasil);
        add(btnBack);

        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen
        p.setBounds(10,10,120,20);
        fpanjang.setBounds(130,10,120,20);
        l.setBounds(10,30,120,20);
        flebar.setBounds(130,30,120,20);
        t.setBounds(10,50,120,20);
        ftinggi.setBounds(130,50,120,20);
        btnHasil.setBounds(10,80,100,20);
        hasil.setBounds(10,100,200,20);
        btnBack.setBounds(200,130,100,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnHasil){
            double p = Double.parseDouble(fpanjang.getText());
            double l = Double.parseDouble(flebar.getText());
            double t = Double.parseDouble(ftinggi.getText());
            double output;
            output = p*l*t;
            hasil.setText("Hasil = "+output);
        }
        else if(e.getSource()==btnBack){
            new GUI();
        }
    }

}

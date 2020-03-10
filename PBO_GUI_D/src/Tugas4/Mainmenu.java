package Tugas4;

import javax.swing.*;
import java.awt.event.*;
public class Mainmenu {
    public static void main(String[] args){
        new GUI();
    }
}
class GUI extends JFrame implements ActionListener{
    JLabel pilihan = new JLabel(" Pilihan");

    private JButton lpbalok = new JButton(" Luas Permukaan Balok ");
    private JButton vbalok = new JButton(" Volume Balok ");
    private JButton vtabung = new JButton(" Volume Tabung ");

    public GUI() {
        setTitle("Menu Tugas Tugas4.GUI");

        setSize(350,300);

        // Mendaftarkan listener
        lpbalok.addActionListener(this);
        vbalok.addActionListener(this);
        vtabung.addActionListener(this);

        setLayout(null);
        add(pilihan);
        add(lpbalok);
        add(vbalok);
        add(vtabung);

        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen
        pilihan.setBounds(10,10,120,20);
        lpbalok.setBounds(10,40,200,20);
        vbalok.setBounds(10,60,200,20);
        vtabung.setBounds(10,80,200,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // Mendeklarasikan ulang metoda actionPerformed (overriding)
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lpbalok) {
            new LpBalok();
        }
        else if (e.getSource() == vbalok) {
            new VBalok();
        }
        else if (e.getSource() == vtabung) {
            new VTabung();
        }
    }
}

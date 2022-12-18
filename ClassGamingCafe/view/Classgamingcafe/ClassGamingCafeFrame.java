package ClassGamingCafe.view.Classgamingcafe;

import javax.swing.*;
import javax.swing.table.*;

public class ClassGamingCafeFrame {
  public static void main(String[] args) {
    // Buat frame utama
    JFrame frame = new JFrame("Dropdown dan Tabel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Buat panel utama dan tambahkan ke frame
    JPanel panel = new JPanel();
    frame.add(panel);

    // Buat dropdown menu dan tambahkan ke panel
    JComboBox<String> dropdown1 = new JComboBox<>();
    dropdown1.addItem("Gaming");
    dropdown1.addItem("Editing");
    dropdown1.addItem("Coding");
    panel.add(dropdown1);
    JComboBox<String> dropdown2 = new JComboBox<>();
    dropdown2.addItem("Watch film");
    dropdown2.addItem("Writing");
    dropdown2.addItem("Mail");
    panel.add(dropdown2);
    // Tampilkan frame
    frame.pack();
    frame.setVisible(true);
  }
}

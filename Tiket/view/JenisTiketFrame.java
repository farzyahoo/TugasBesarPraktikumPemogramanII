package Tiket.view;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import Tiket.model.*;

//  ini masih Salah Jangan diikutin, Tampilannya masih Acak.
public class JenisTiketFrame extends JFrame {
    private List<JenisTiket> jenisTiketList;
    private JTextField textFieldTiketMember;
    private JTextField textFieldTiketNonMember;
    private JenisTiketTableModel tableModel;

    public JenisTiketFrame(List<JenisTiket> jenisTiketList) {
        this.jenisTiketList = jenisTiketList;

        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Masukan Jumlah Tiket Member:");
        labelInput.setBounds(15, 40, 350, 30);

        textFieldTiketMember = new JTextField();
        textFieldTiketMember.setBounds(15, 60, 350, 30);

        // JComboBox<String> comboBox = new JComboBox<>();
        // comboBox.addItem("Satu");
        // comboBox.addItem("Dua");
        // comboBox.addItem("Tiga");

        JLabel labelInput2 = new JLabel("Masukan Jumlah Tiket NonMember:");
        labelInput2.setBounds(15, 90, 350, 30);

        textFieldTiketNonMember = new JTextField();
        textFieldTiketNonMember.setBounds(15, 120, 350, 30);

        // JComboBox<String> comboBox2 = new JComboBox<>();
        // comboBox2.addItem("Satu");
        // comboBox2.addItem("Dua");
        // comboBox2.addItem("Tiga");

        JButton button = new JButton("Simpan");
        button.setBounds(15, 160, 100, 30);

        javax.swing.JTable table = new JTable();
        JScrollPane ScrollableTable = new JScrollPane(table);
        ScrollableTable.setBounds(15, 200, 350, 200);

        tableModel = new JenisTiketTableModel(jenisTiketList);
        table.setModel(tableModel);

        this.add(labelInput);
        this.add(textFieldTiketMember);
        this.add(labelInput2);
        this.add(textFieldTiketNonMember);
        this.add(button);
        this.add(ScrollableTable);

        this.setSize(400, 1000);
        this.setLayout(null);

    }

    public String getTiketMember() {
        return textFieldTiketMember.getText();
    }

    public String getTiketNonMember() {
        return textFieldTiketNonMember.getText();
    }

    public void addJenisTiket(JenisTiket jenisTiket) {
        tableModel.add(jenisTiket);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                List<JenisTiket> jenisTiketList = new ArrayList<>();
                JenisTiketFrame frame = new JenisTiketFrame(jenisTiketList);
                frame.setVisible(true);
            }
        });
    }
}
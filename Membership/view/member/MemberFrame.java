package view.member;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import model.*;

public class MemberFrame extends JFrame {
    private List<JenisPC> jenisPCList;
    private List<PC> pcList;
    private JTextField textFieldNama;
    private MemberTableModel tableModel;
    private JComboBox comboJenis;

    public MemberFrame(List<JenisPC> jenisPCList, List<PC> memberList) {
        this.jenisPCList = jenisPCList;
        this.pcList = pcList;

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel labelInput = new JLabel("Nama");
        labelInput.setBounds(15, 40, 350, 10);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30);

        JLabel labelJenis = new JLabel("Jenis PC");
        labelJenis.setBounds(15, 100, 350, 10);

        comboJenis = new JComboBox();
        comboJenis.setBounds(15, 120, 150, 30);

        JButton button = new JButton("simpan");
        button.setBounds(15, 160, 100, 40);

        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15, 220, 350, 200);

        tableModel = new MemberTableModel(memberList);
        table.setModel(tableModel);

        MemberButtonSimpanActionListener actionListener = new MemberButtonSimpanActionListener(this);

        button.addActionListener(actionListener);

        this.add(button);
        this.add(textFieldNama);
        this.add(labelInput);
        this.add(labelJenis);
        this.add(comboJenis);
        this.add(scrollableTable);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public void populatedComboJenis() {
        comboJenis.removeAllItems();
        for (JenisPC jenisMember : this.jenisPCList) {
            comboJenis.addItem(jenisMember.getNama());
        }
    }

    public String getNama() {
        return textFieldNama.getText();
    }

    public JenisPC getJenisMember() {
        return jenisPCList.get(comboJenis.getSelectedIndex());
    }

    public void addMember(PC member) {
        tableModel.add(member);
        textFieldNama.setText("");
    }

}

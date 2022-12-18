package Tiket.view;

import javax.swing.table.*;
import java.util.List;
import Tiket.model.JenisTiket;

class JenisTiketTableModel extends AbstractTableModel {
    private String[] columnNames = { "Tiket Member", "Tiket NonMember" };
    private List<JenisTiket> data;

    public JenisTiketTableModel(List<JenisTiket> data) {
        this.data = data;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        JenisTiket rowItem = data.get(row);
        String value = "";
        switch (col) {
            case 0:
                value = rowItem.getTiketMember();
                break;
            case 1:
                value = rowItem.getTiketNonMember();
                break;
        }
        return value;
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void add(JenisTiket value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}
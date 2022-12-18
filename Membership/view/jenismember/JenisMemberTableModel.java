package view.jenismember;

import javax.swing.table.*;
import java.util.List;
import model.JenisPC;

class JenisMemberTableModel extends AbstractTableModel {
  private String[] columnNames = { "Nama" };
  private List<JenisPC> data;

  public JenisMemberTableModel(List<JenisPC> data) {
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
    JenisPC rowItem = data.get(row);
    String value = "";
    switch (col) {
      case 0:
        value = rowItem.getNama();
        break;
    }
    return value;
  }

  public boolean isCellEditable(int row, int col) {
    return false;
  }

  public void add(JenisPC value) {
    data.add(value);
    fireTableRowsInserted(data.size() - 1, data.size() - 1);
  }
}
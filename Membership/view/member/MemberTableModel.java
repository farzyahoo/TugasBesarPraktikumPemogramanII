package view.member;

import javax.swing.table.*;
import java.util.List;
import model.PC;

class MemberTableModel extends AbstractTableModel {
  private String[] columnNames = { "Nama", "Jenis PC" };
  private List<PC> data;

  public MemberTableModel(List<PC> data) {
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
    PC rowItem = data.get(row);
    String value = "";
    switch (col) {
      case 0:
        value = rowItem.getNama();
        break;
      case 1:
        value = rowItem.getJenisPC().getNama();
        break;
    }
    return value;
  }

  public boolean isCellEditable(int row, int col) {
    return false;
  }

  public void add(PC value) {
    data.add(value);
    fireTableRowsInserted(data.size() - 1, data.size() - 1);
  }
}

package TujuanPC.View.Tujuanpc;

import TujuanPC.Model.Tujuanpc;
import java.util.List;

public class TujuanPCTableModel {
  private String[] columnNames = { "Nama" };
  private List<Tujuanpc> data;

  public void JenisMemberTableModel(List<Tujuanpc> data) {
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
    Tujuanpc rowItem = data.get(row);
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

  public void add(Tujuanpc value) {
    data.add(value);
    fireTableRowsInserted(data.size() - 1, data.size() - 1);
  }

  private void fireTableRowsInserted(int i, int j) {
  }
}

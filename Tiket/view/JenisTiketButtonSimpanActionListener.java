package Tiket.view;

//  ini masih PlaceHolder Jangan diikutin, masih belum bisa.

import java.awt.event.*;
import Tiket.model.*;

public class JenisTiketButtonSimpanActionListener implements ActionListener {
  private JenisTiketFrame jenisTiketFrame;

  public JenisTiketButtonSimpanActionListener(JenisTiketFrame jenisTiketFrame) {
    this.jenisTiketFrame = jenisTiketFrame;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String tiketMember = this.jenisTiketFrame.getTiketMember();
    String tiketNonMember = this.jenisTiketFrame.getTiketNonMember();

    JenisTiket jenisTiket = new JenisTiket();
    this.jenisTiketFrame.addJenisTiket(jenisTiket);
  }
}

// ini masih PlaceHolder Jangan diikutin, masih belum bisa

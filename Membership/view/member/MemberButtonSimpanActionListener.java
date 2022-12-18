package view.member;

import java.awt.event.*;
import model.*;

public class MemberButtonSimpanActionListener implements ActionListener {
    private MemberFrame memberFrame;

    public MemberButtonSimpanActionListener(MemberFrame memberFrame) {
        this.memberFrame = memberFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nama = this.memberFrame.getNama();
        JenisPC jenisMember = this.memberFrame.getJenisMember();
        PC member = new PC();
        member.setNama(nama);
        member.setJenisPesawat(jenisMember);

        this.memberFrame.addMember(member);
    }
}

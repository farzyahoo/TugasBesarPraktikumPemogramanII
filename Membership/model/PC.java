package model;

public class PC {
    private String nama;
    private JenisPC jenisPC;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisPesawat(JenisPC jenisPC) {
        this.jenisPC = jenisPC;
    }

    public JenisPC getJenisPC() {
        return jenisPC;
    }
}

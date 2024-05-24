package GraphicUserInterface;
import javax.swing.*;
import java.awt.*;

public class Daftar extends JFrame {
    private JTextField txtNama;
    private JTextField txtTanggalLahir;
    private JTextField txtNoPendaftaran;
    private JTextField txtNoTelp;
    private JTextField txtAlamat;
    private JTextField txtEmail;
    private JButton btnSubmit;

    public Daftar() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new GridLayout(8, 2));

        JLabel lblNama = new JLabel("Nama Lengkap:");
        txtNama = new JTextField();
        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir:");
        txtTanggalLahir = new JTextField();
        JLabel lblNoPendaftaran = new JLabel("Nomor Pendaftaran:");
        txtNoPendaftaran = new JTextField();
        JLabel lblNoTelp = new JLabel("No. Telp:");
        txtNoTelp = new JTextField();
        JLabel lblAlamat = new JLabel("Alamat:");
        txtAlamat = new JTextField();
        JLabel lblEmail = new JLabel("E-mail:");
        txtEmail = new JTextField();

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(e -> handleSubmit());

        panel.add(lblNama);
        panel.add(txtNama);
        panel.add(lblTanggalLahir);
        panel.add(txtTanggalLahir);
        panel.add(lblNoPendaftaran);
        panel.add(txtNoPendaftaran);
        panel.add(lblNoTelp);
        panel.add(txtNoTelp);
        panel.add(lblAlamat);
        panel.add(txtAlamat);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(new JLabel()); // Spacer
        panel.add(btnSubmit);

        add(panel);
    }

    private void handleSubmit() {
        String nama = txtNama.getText();
        String tanggalLahir = txtTanggalLahir.getText();
        String noPendaftaran = txtNoPendaftaran.getText();
        String noTelp = txtNoTelp.getText();
        String alamat = txtAlamat.getText();
        String email = txtEmail.getText();

        if (nama.isEmpty() || tanggalLahir.isEmpty() || noPendaftaran.isEmpty() || noTelp.isEmpty() || alamat.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                JFrame dataFrame = new JFrame("Data Mahasiswa");
                dataFrame.setSize(300, 200);
                dataFrame.setLayout(new GridLayout(6, 1));

                dataFrame.add(new JLabel("Nama: " + nama));
                dataFrame.add(new JLabel("Tanggal Lahir: " + tanggalLahir));
                dataFrame.add(new JLabel("No. Pendaftaran: " + noPendaftaran));
                dataFrame.add(new JLabel("No. Telp: " + noTelp));
                dataFrame.add(new JLabel("Alamat: " + alamat));
                dataFrame.add(new JLabel("E-mail: " + email));

                dataFrame.setVisible(true);
            }
        }
    }
}

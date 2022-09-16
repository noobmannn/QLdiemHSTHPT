/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.qldiemhsthpt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class NhapDiemChoHocSinhForm extends javax.swing.JFrame {

    static List<DiemCuaHS> data;
    static int stt;
    static DefaultTableModel model;
    int selectedRowIndex;

    private static final String CURRENT_DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String JSON_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DiemCuaHS.json";

    /**
     * Creates new form NhapDiemChoHocSinhForm
     */
    public NhapDiemChoHocSinhForm() {
        initComponents();
        stt = 1;
        data = readJSONFile();
        model = (DefaultTableModel) tblBangDiem.getModel();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMaHS = new javax.swing.JTextField();
        txtToan = new javax.swing.JTextField();
        txtLy = new javax.swing.JTextField();
        txtHoa = new javax.swing.JTextField();
        txtSinh = new javax.swing.JTextField();
        txtTin = new javax.swing.JTextField();
        txtCongNghe = new javax.swing.JTextField();
        txtNguVan = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtSu = new javax.swing.JTextField();
        txtGDCD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXuatFileJSON = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bảng Điểm Của Học Sinh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã Học Sinh:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 110, 30));

        jLabel3.setText("Nhập Điểm Các Môn:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 42, 169, 33));

        jLabel4.setText("Toán:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 81, 120, -1));

        jLabel5.setText("Vật Lý:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 106, 120, -1));

        jLabel6.setText("Hoá Học:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 134, 120, -1));

        jLabel7.setText("Sinh Học:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 162, 120, -1));

        jLabel8.setText("Tin Học:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 190, 120, -1));

        jLabel9.setText("Công Nghệ:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 218, 120, -1));

        jLabel10.setText("Ngữ Văn:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 246, 120, -1));

        jLabel11.setText("Địa Lý:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 274, 120, -1));

        jLabel12.setText("Lịch Sử:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 302, 120, -1));

        jLabel13.setText("Giáo Dục Công Dân:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 330, 120, -1));
        jPanel2.add(txtMaHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 10, 128, -1));
        jPanel2.add(txtToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 75, 77, -1));
        jPanel2.add(txtLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 103, 77, -1));
        jPanel2.add(txtHoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 131, 77, -1));
        jPanel2.add(txtSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 159, 77, -1));
        jPanel2.add(txtTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 187, 77, -1));
        jPanel2.add(txtCongNghe, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 215, 77, -1));
        jPanel2.add(txtNguVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 243, 77, -1));
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 271, 77, -1));
        jPanel2.add(txtSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 299, 77, -1));
        jPanel2.add(txtGDCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 327, 77, -1));

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HS", "Toán", "Vật Lý", "Hoá Học", "Sinh Học", "Tin Học", "Công Nghệ", "Ngữ Văn", "Địa Lý", "Lịch Sử", "Giáo Dục Công Dân", "Điểm Trung Bình", "Học Lực"
            }
        ));
        tblBangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangDiem);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, 1054, 350));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 368, -1, 40));

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 368, 90, 40));

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 368, 110, 40));

        btnXuatFileJSON.setText("Xuất ra File JSON");
        btnXuatFileJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileJSONActionPerformed(evt);
            }
        });
        jPanel2.add(btnXuatFileJSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 368, 140, 40));

        btnSapXep.setText("Sắp Xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });
        jPanel2.add(btnSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 368, 100, 40));

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 368, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static List<DiemCuaHS> readJSONFile() {
        FileReader fr = null;
        List<DiemCuaHS> data2 = new ArrayList<>();
        try {
            fr = new FileReader(JSON_PATH);
            Gson gson = new Gson();

            java.lang.reflect.Type type = new TypeToken<List<DiemCuaHS>>(){}.getType();
            data2 = gson.fromJson(fr, type);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return data2;
    }
    
    static void fillTable(){
        for (DiemCuaHS item : data) {
            DiemCuaHS hs = item;
            model.addRow(new Object[]{
                stt++,
                hs.getMaHS(),
                hs.getTatCaMon().get(0).getDiem_cac_mon(),
                hs.getTatCaMon().get(1).getDiem_cac_mon(),
                hs.getTatCaMon().get(2).getDiem_cac_mon(),
                hs.getTatCaMon().get(3).getDiem_cac_mon(),
                hs.getTatCaMon().get(4).getDiem_cac_mon(),
                hs.getTatCaMon().get(5).getDiem_cac_mon(),
                hs.getTatCaMon().get(6).getDiem_cac_mon(),
                hs.getTatCaMon().get(7).getDiem_cac_mon(),
                hs.getTatCaMon().get(8).getDiem_cac_mon(),
                hs.getTatCaMon().get(9).getDiem_cac_mon(),
                hs.getDiemTBmon(),
                hs.getHocLuc(),});
        }
    }
    
    private void fillToJTable() {
        if (data != null) {
            DiemCuaHS hs = data.get(data.size() - 1);
            model.addRow(new Object[]{
                stt++,
                hs.getMaHS(),
                hs.getTatCaMon().get(0).getDiem_cac_mon(),
                hs.getTatCaMon().get(1).getDiem_cac_mon(),
                hs.getTatCaMon().get(2).getDiem_cac_mon(),
                hs.getTatCaMon().get(3).getDiem_cac_mon(),
                hs.getTatCaMon().get(4).getDiem_cac_mon(),
                hs.getTatCaMon().get(5).getDiem_cac_mon(),
                hs.getTatCaMon().get(6).getDiem_cac_mon(),
                hs.getTatCaMon().get(7).getDiem_cac_mon(),
                hs.getTatCaMon().get(8).getDiem_cac_mon(),
                hs.getTatCaMon().get(9).getDiem_cac_mon(),
                hs.getDiemTBmon(),
                hs.getHocLuc(),});
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String mahs = txtMaHS.getText();
        List<DiemTungMon> TCM = new ArrayList<>();
        TCM.add(new DiemTungMon(Double.parseDouble(txtToan.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtLy.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtHoa.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtSinh.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtTin.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtCongNghe.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtNguVan.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtDia.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtSu.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtGDCD.getText())));

        DiemCuaHS dchs = new DiemCuaHS(mahs);
        dchs.setTatCaMon(TCM);

        data.add(dchs);
        fillToJTable();
        btnXoaActionPerformed(evt);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        txtMaHS.setText("");
        txtToan.setText("");
        txtLy.setText("");
        txtHoa.setText("");
        txtSinh.setText("");
        txtTin.setText("");
        txtCongNghe.setText("");
        txtNguVan.setText("");
        txtDia.setText("");
        txtSu.setText("");
        txtGDCD.setText("");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangDiemMouseClicked
        selectedRowIndex = tblBangDiem.getSelectedRow();
        DiemCuaHS hs = new DiemCuaHS();
        List<DiemTungMon> TCM = new ArrayList<>();
        hs.setMaHS(model.getValueAt(selectedRowIndex, 1).toString());
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 2).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 3).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 4).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 5).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 6).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 7).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 8).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 9).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 10).toString())));
        TCM.add(new DiemTungMon(Double.valueOf(model.getValueAt(selectedRowIndex, 11).toString())));
        hs.setTatCaMon(TCM);

        txtMaHS.setText(hs.getMaHS());
        txtToan.setText(String.valueOf(hs.getTatCaMon().get(0).getDiem_cac_mon()));
        txtLy.setText(String.valueOf(hs.getTatCaMon().get(1).getDiem_cac_mon()));
        txtHoa.setText(String.valueOf(hs.getTatCaMon().get(2).getDiem_cac_mon()));
        txtSinh.setText(String.valueOf(hs.getTatCaMon().get(3).getDiem_cac_mon()));
        txtTin.setText(String.valueOf(hs.getTatCaMon().get(4).getDiem_cac_mon()));
        txtCongNghe.setText(String.valueOf(hs.getTatCaMon().get(5).getDiem_cac_mon()));
        txtNguVan.setText(String.valueOf(hs.getTatCaMon().get(6).getDiem_cac_mon()));
        txtDia.setText(String.valueOf(hs.getTatCaMon().get(7).getDiem_cac_mon()));
        txtSu.setText(String.valueOf(hs.getTatCaMon().get(8).getDiem_cac_mon()));
        txtGDCD.setText(String.valueOf(hs.getTatCaMon().get(9).getDiem_cac_mon()));

    }//GEN-LAST:event_tblBangDiemMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String mahs = txtMaHS.getText();
        List<DiemTungMon> TCM = new ArrayList<>();
        TCM.add(new DiemTungMon(Double.parseDouble(txtToan.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtLy.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtHoa.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtSinh.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtTin.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtCongNghe.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtNguVan.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtDia.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtSu.getText())));
        TCM.add(new DiemTungMon(Double.parseDouble(txtGDCD.getText())));

        DiemCuaHS dchs = new DiemCuaHS(mahs);
        data.set(selectedRowIndex, dchs);
        dchs.setTatCaMon(TCM);

        model.setValueAt(dchs.getMaHS(), selectedRowIndex, 1);
        model.setValueAt(dchs.getTatCaMon().get(0).getDiem_cac_mon(), selectedRowIndex, 2);
        model.setValueAt(dchs.getTatCaMon().get(1).getDiem_cac_mon(), selectedRowIndex, 3);
        model.setValueAt(dchs.getTatCaMon().get(2).getDiem_cac_mon(), selectedRowIndex, 4);
        model.setValueAt(dchs.getTatCaMon().get(3).getDiem_cac_mon(), selectedRowIndex, 5);
        model.setValueAt(dchs.getTatCaMon().get(4).getDiem_cac_mon(), selectedRowIndex, 6);
        model.setValueAt(dchs.getTatCaMon().get(5).getDiem_cac_mon(), selectedRowIndex, 7);
        model.setValueAt(dchs.getTatCaMon().get(6).getDiem_cac_mon(), selectedRowIndex, 8);
        model.setValueAt(dchs.getTatCaMon().get(7).getDiem_cac_mon(), selectedRowIndex, 9);
        model.setValueAt(dchs.getTatCaMon().get(8).getDiem_cac_mon(), selectedRowIndex, 10);
        model.setValueAt(dchs.getTatCaMon().get(9).getDiem_cac_mon(), selectedRowIndex, 11);
        model.setValueAt(dchs.getDiemTBmon(), selectedRowIndex, 12);
        model.setValueAt(dchs.getHocLuc(), selectedRowIndex, 13);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXuatFileJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileJSONActionPerformed
        DiemCuaHSController.writeJSONFile(data);
    }//GEN-LAST:event_btnXuatFileJSONActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        DiemCuaHSController.compareSubject(data, 10);
        model.setRowCount(0);
        int stt2 = 1;
        for (DiemCuaHS item : data) {
            DiemCuaHS hs = item;
            model.addRow(new Object[]{
                stt2++,
                hs.getMaHS(),
                hs.getTatCaMon().get(0).getDiem_cac_mon(),
                hs.getTatCaMon().get(1).getDiem_cac_mon(),
                hs.getTatCaMon().get(2).getDiem_cac_mon(),
                hs.getTatCaMon().get(3).getDiem_cac_mon(),
                hs.getTatCaMon().get(4).getDiem_cac_mon(),
                hs.getTatCaMon().get(5).getDiem_cac_mon(),
                hs.getTatCaMon().get(6).getDiem_cac_mon(),
                hs.getTatCaMon().get(7).getDiem_cac_mon(),
                hs.getTatCaMon().get(8).getDiem_cac_mon(),
                hs.getTatCaMon().get(9).getDiem_cac_mon(),
                hs.getDiemTBmon(),
                hs.getHocLuc(),});
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

    public <E> void writeJSONFile(List<E> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(JSON_PATH);
            Gson gson = new Gson();

            gson.toJson(list, fw);
        } catch (IOException ex) {
            Logger.getLogger(DiemCuaHSController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(DiemCuaHSController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        LocDiemHocSinh loc = new LocDiemHocSinh();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
        writeJSONFile(data);
    }//GEN-LAST:event_btnLocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapDiemChoHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapDiemChoHocSinhForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFileJSON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTextField txtCongNghe;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtGDCD;
    private javax.swing.JTextField txtHoa;
    private javax.swing.JTextField txtLy;
    private javax.swing.JTextField txtMaHS;
    private javax.swing.JTextField txtNguVan;
    private javax.swing.JTextField txtSinh;
    private javax.swing.JTextField txtSu;
    private javax.swing.JTextField txtTin;
    private javax.swing.JTextField txtToan;
    // End of variables declaration//GEN-END:variables
}

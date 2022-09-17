package com.actvn.qldiemhsthpt.ui;

import com.actvn.qldiemhsthpt.util.FileControl;
import com.actvn.qldiemhsthpt.ui.LocThongTinHocSinhForm;
import com.actvn.qldiemhsthpt.model.HocSinhController;
import com.actvn.qldiemhsthpt.model.HocSinh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ThongTinHocSinhForm extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinHocSinh
     */
    List<HocSinh> data;
    static DefaultTableModel model;
    int selectedRowIndex;
    SimpleDateFormat df = com.actvn.qldiemhsthpt.util.DateFormat.DF;

    public ThongTinHocSinhForm() {
        initComponents();
        data = FileControl.readJSONFileTT(com.actvn.qldiemhsthpt.util.FileControl.JSON_THONGTIN_PATH);
        model = (DefaultTableModel) tblBangThongTin.getModel();
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

        rbtgGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHS = new javax.swing.JTextField();
        txtTenDem = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        rbtNam = new javax.swing.JRadioButton();
        rbtNu = new javax.swing.JRadioButton();
        txtSinhNhat = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangThongTin = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnLamTrong = new javax.swing.JButton();
        btnSuaThongTin = new javax.swing.JButton();
        btnXuatRaFileJSON = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("THÔNG TIN CỦA HỌC SINH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Mã Học Sinh: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Họ và Tên Đệm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Tên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Lớp:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Giới Tính:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Ngày Sinh:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Quê Quán:");

        txtMaHS.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        txtTenDem.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        txtTen.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        txtLop.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        rbtgGioiTinh.add(rbtNam);
        rbtNam.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        rbtNam.setText("Nam");

        rbtgGioiTinh.add(rbtNu);
        rbtNu.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        rbtNu.setText("Nữ");

        txtSinhNhat.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        txtQueQuan.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        tblBangThongTin.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tblBangThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Học Sinh", "Họ Và Tên Đệm", "Tên", "Lớp", "Giới Tính", "Ngày Sinh", "Quê Quán"
            }
        ));
        tblBangThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangThongTin);

        btnThem.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamTrong.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnLamTrong.setText("Làm Trống");
        btnLamTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamTrongActionPerformed(evt);
            }
        });

        btnSuaThongTin.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnSuaThongTin.setText("Sửa Thông Tin");
        btnSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinActionPerformed(evt);
            }
        });

        btnXuatRaFileJSON.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnXuatRaFileJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/actvn/quanlysv/images/Save.png"))); // NOI18N
        btnXuatRaFileJSON.setText("Xuất Ra File JSON");
        btnXuatRaFileJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatRaFileJSONActionPerformed(evt);
            }
        });

        btnSapXep.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/actvn/quanlysv/images/Statistics.png"))); // NOI18N
        btnSapXep.setText("Sắp Xếp Theo ABC");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnLoc.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/actvn/quanlysv/images/Notes.png"))); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Nhập mã sinh viên cần tìm kiếm:");

        txtTimKiem.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/actvn/quanlysv/images/Search.png"))); // NOI18N
        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/actvn/quanlysv/images/Refresh.png"))); // NOI18N
        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("Tìm Kiếm Thông Tin Sinh Viên: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnSapXep)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatRaFileJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnTimKiem)
                        .addGap(37, 37, 37)
                        .addComponent(btnQuayLai)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtTenDem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSinhNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtNu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamTrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSinhNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamTrong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtNam)
                    .addComponent(rbtNu)
                    .addComponent(btnSuaThongTin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatRaFileJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillTable() {
        for (HocSinh item : data) {
            HocSinh hs = item;
            model.addRow(new Object[]{hs.getMaHS(), hs.getHoVaTenDem(), hs.getTen(), hs.getLop(),
                ((hs.getGioiTinh() == 1) ? "Nam" : "Nữ"), hs.getSinhNhat(), hs.getQueQuan()});
        }
    }

    private void fillToJTable() {
        if (data != null) {
            HocSinh hs = data.get(data.size() - 1);
            model.addRow(new Object[]{hs.getMaHS(), hs.getHoVaTenDem(), hs.getTen(), hs.getLop(),
                ((hs.getGioiTinh() == 1) ? "Nam" : "Nữ"), hs.getSinhNhat(), hs.getQueQuan()});
        }
    }

    private boolean checkDate(String s) {
        try {
            Date d = df.parse(s);
        } catch (ParseException ex) {
            return false;
        }
        return true;
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            String MaHS = txtMaHS.getText();
            String TenDem = txtTenDem.getText();
            String ten = txtTen.getText();
            String lop = txtLop.getText();
            String ngaySinh = txtSinhNhat.getText();
            String queQuan = txtQueQuan.getText();

            rbtNam.setActionCommand(rbtNam.getText());
            rbtNu.setActionCommand(rbtNu.getText());

            String strGioiTinh = rbtgGioiTinh.getSelection().getActionCommand();
            int GioiTinh = 0;
            if (strGioiTinh.equals("Nam")) {
                GioiTinh = 1;
            } else if (strGioiTinh.equals("Nữ")) {
                GioiTinh = 2;
            }

            HocSinh hs = null;

            hs = new HocSinh(MaHS, TenDem, ten, lop, GioiTinh, ngaySinh, queQuan);
            if (!hs.getMaHS().equals("") || !hs.getHoVaTenDem().equals("") || !hs.getTen().equals("") || !hs.getLop().equals("") || !hs.getSinhNhat().equals("") || !hs.getQueQuan().equals("")) {
                if (checkDate(hs.getSinhNhat())) {
                    data.add(hs);
                    fillToJTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Định Dạng Ngày Không Hợp Lệ", "CẢNH BÁO!!!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không được để trống!!!", "CẢNH BÁO!!!", JOptionPane.ERROR_MESSAGE);
            }
            btnLamTrongActionPerformed(evt);
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Định dạng không hợp lệ", "CẢNH BÁO!!!", JOptionPane.ERROR_MESSAGE);
            btnLamTrongActionPerformed(evt);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamTrongActionPerformed
        txtMaHS.setText("");
        txtTenDem.setText("");
        txtTen.setText("");
        txtLop.setText("");
        txtSinhNhat.setText("");
        txtQueQuan.setText("");
        rbtgGioiTinh.setSelected(rbtNam.getModel(), true);
    }//GEN-LAST:event_btnLamTrongActionPerformed

    private void tblBangThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangThongTinMouseClicked
        selectedRowIndex = tblBangThongTin.getSelectedRow();

        HocSinh hs = new HocSinh();
        hs.setMaHS(model.getValueAt(selectedRowIndex, 0).toString());
        hs.setHoVaTenDem(model.getValueAt(selectedRowIndex, 1).toString());
        hs.setTen(model.getValueAt(selectedRowIndex, 2).toString());
        hs.setLop(model.getValueAt(selectedRowIndex, 3).toString());
        hs.setGioiTinh((model.getValueAt(selectedRowIndex, 4).toString().equals("Nam")) ? 1 : 2);
        hs.setSinhNhat(model.getValueAt(selectedRowIndex, 5).toString());
        hs.setQueQuan(model.getValueAt(selectedRowIndex, 6).toString());

        txtMaHS.setText(hs.getMaHS());
        txtTenDem.setText(hs.getHoVaTenDem());
        txtTen.setText(hs.getTen());
        txtLop.setText(hs.getLop());
        switch (hs.getGioiTinh()) {
            case 1 ->
                rbtgGioiTinh.setSelected(rbtNam.getModel(), true);
            case 2 ->
                rbtgGioiTinh.setSelected(rbtNu.getModel(), true);
        }
        txtSinhNhat.setText(hs.getSinhNhat());
        txtQueQuan.setText(hs.getQueQuan());
    }//GEN-LAST:event_tblBangThongTinMouseClicked

    private void btnSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinActionPerformed
        String MaHS = txtMaHS.getText();
        String TenDem = txtTenDem.getText();
        String ten = txtTen.getText();
        String lop = txtLop.getText();
        String ngaySinh = txtSinhNhat.getText();
        String queQuan = txtQueQuan.getText();

        rbtNam.setActionCommand(rbtNam.getText());
        rbtNu.setActionCommand(rbtNu.getText());

        String strGioiTinh = rbtgGioiTinh.getSelection().getActionCommand();
        int GioiTinh = 0;
        if (strGioiTinh.equals("Nam")) {
            GioiTinh = 1;
        } else if (strGioiTinh.equals("Nữ")) {
            GioiTinh = 2;
        }

        HocSinh hs;
        hs = new HocSinh(MaHS, TenDem, ten, lop, GioiTinh, ngaySinh, queQuan);
        if (model.getValueAt(selectedRowIndex, 0).equals(hs.getMaHS())) {
            if (checkDate(hs.getSinhNhat())) {
                data.set(selectedRowIndex, hs);
                model.setValueAt(hs.getMaHS(), selectedRowIndex, 0);
                model.setValueAt(hs.getHoVaTenDem(), selectedRowIndex, 1);
                model.setValueAt(hs.getTen(), selectedRowIndex, 2);
                model.setValueAt(hs.getLop(), selectedRowIndex, 3);
                model.setValueAt((hs.getGioiTinh() == 1) ? "Nam" : "Nữ", selectedRowIndex, 4);
                model.setValueAt(hs.getSinhNhat(), selectedRowIndex, 5);
                model.setValueAt(hs.getQueQuan(), selectedRowIndex, 6);
                btnLamTrongActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Định Dạng Ngày Không Hợp Lệ", "CẢNH BÁO!!!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không sửa mã sinh viên!!!", "CẢNH BÁO!!!", JOptionPane.ERROR_MESSAGE);
            txtMaHS.setText(model.getValueAt(selectedRowIndex, 0).toString());
        }
    }//GEN-LAST:event_btnSuaThongTinActionPerformed

    private void btnXuatRaFileJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatRaFileJSONActionPerformed
        FileControl.writeJSONFile(data, com.actvn.qldiemhsthpt.util.FileControl.JSON_THONGTIN_PATH);
    }//GEN-LAST:event_btnXuatRaFileJSONActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        model.setRowCount(0);
        HocSinhController.sapXepDanhSachTheoABC(data);
        fillTable();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        btnXuatRaFileJSONActionPerformed(evt);
        LocThongTinHocSinhForm loc = new LocThongTinHocSinhForm();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        data.remove(selectedRowIndex);
        model.setRowCount(0);
        fillTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TableRowSorter<DefaultTableModel> tk = new TableRowSorter<>(model);
        tblBangThongTin.setRowSorter(tk);
        tk.setRowFilter(RowFilter.regexFilter(txtTimKiem.getText()));
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainMenu loc = new MainMenu();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        txtTimKiem.setText("");
        TableRowSorter<DefaultTableModel> tk = new TableRowSorter<>(model);
        tblBangThongTin.setRowSorter(tk);
        tk.setRowFilter(RowFilter.regexFilter(txtTimKiem.getText()));
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinHocSinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinHocSinhForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamTrong;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSuaThongTin;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatRaFileJSON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbtNam;
    private javax.swing.JRadioButton rbtNu;
    private javax.swing.ButtonGroup rbtgGioiTinh;
    private javax.swing.JTable tblBangThongTin;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMaHS;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSinhNhat;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

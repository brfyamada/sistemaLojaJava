/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.CampoLimiter;
import dao.UsuarioDAO;
import dominio.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno
 */
public class TelaCadUsuario extends javax.swing.JPanel {

    /**
     * Creates new form Cada
     */
    public TelaCadUsuario() {
        initComponents();

        txtNome.setDocument(new CampoLimiter(45));
        txtRua.setDocument(new CampoLimiter((45)));
        txtNumero.setDocument(new CampoLimiter(11));
        txtBairro.setDocument(new CampoLimiter(45));
        txtCidade.setDocument(new CampoLimiter(45));
        txtLogin.setDocument(new CampoLimiter(16));
        pwd1.setDocument(new CampoLimiter(8));
        pwd2.setDocument(new CampoLimiter(8));

        lblCheck1.setVisible(false);
        lblCheck2.setVisible(false);
        lblWrong1.setVisible(false);
        lblWrong2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbProdutos = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        pwd2 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        lblCheck1 = new javax.swing.JLabel();
        lblWrong1 = new javax.swing.JLabel();
        lblCheck2 = new javax.swing.JLabel();
        lblWrong2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(true);

        lbProdutos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbProdutos.setText("Usuários");

        btnAlterar.setBackground(java.awt.Color.darkGray);
        btnAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tbUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Rua", "Bairro", "Cidade", "Número", "CEP", "Tel", "Login", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbUsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        btnRemover.setBackground(java.awt.Color.darkGray);
        btnRemover.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(java.awt.Color.darkGray);
        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtConsulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Bairro");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Rua");

        txtRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nº");

        txtNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("CEP");

        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRua))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnConsultar.setBackground(java.awt.Color.darkGray);
        btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setNextFocusableComponent(btnNovo);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(java.awt.Color.darkGray);
        btnNovo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Salvar");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusable(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome*");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CPF*");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Tel");

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de acesso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel4.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 33, 140, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Login*");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Senha*");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 36, -1, -1));

        pwd1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pwd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pwd1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pwd1MouseReleased(evt);
            }
        });
        pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd1ActionPerformed(evt);
            }
        });
        pwd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwd1KeyReleased(evt);
            }
        });
        jPanel4.add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 35, 140, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Confirmação de Senha*");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 36, -1, -1));

        pwd2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pwd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pwd2MouseReleased(evt);
            }
        });
        pwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd2ActionPerformed(evt);
            }
        });
        pwd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwd2KeyReleased(evt);
            }
        });
        jPanel4.add(pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 35, 140, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Tipo de Usuário");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        cbTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        cbTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(cbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 20));

        lblCheck1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oie_transparent (2).png"))); // NOI18N
        jPanel4.add(lblCheck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, 30));

        lblWrong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oie_transparent (1).png"))); // NOI18N
        jPanel4.add(lblWrong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        lblCheck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oie_transparent (2).png"))); // NOI18N
        jPanel4.add(lblCheck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, 30));

        lblWrong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oie_transparent (1).png"))); // NOI18N
        jPanel4.add(lblWrong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRemover)
                        .addGap(512, 512, 512)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar)))
                        .addGap(148, 148, 148))))
            .addGroup(layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(lbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProdutos)
                .addGap(233, 233, 233)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo)
                    .addComponent(btnLimpar))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        int linha = tbUsuario.getSelectedRow();
        if (linha == -1) {

            JOptionPane.showMessageDialog(null, "Selecione um usuário na tabela pra excluir");
        } else if (verificarCampos()) {

            String cpf = txtCpf.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");

            String cep = txtCep.getText();
            cep = cep.replace("-", "");

            String tel = txtTel.getText();
            tel = tel.replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");

            Integer cod = Integer.parseInt(tbUsuario.getModel().getValueAt(linha, 0).toString());

            Usuario usuario = new Usuario();
            usuario.setCodUsuario(cod);
            usuario.setNome(txtNome.getText());
            usuario.setCpf(cpf);
            usuario.setTelefone(tel);
            usuario.setRua(txtRua.getText());
            usuario.setNumero(txtNumero.getText());
            usuario.setBairro(txtBairro.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCep(cep);
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(pwd1.getText());
            usuario.setTipo(cbTipoUsuario.getSelectedItem().toString());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.editar(usuario);

            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");

        }
        this.atualizarTB();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        if (verificarCampos()) {

            String cpf = txtCpf.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");

            String cep = txtCep.getText();
            cep = cep.replace("-", "");

            String tel = txtTel.getText();
            tel = tel.replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");

            Usuario usuario = new Usuario();
            usuario.setNome(txtNome.getText());
            usuario.setCpf(cpf);
            usuario.setTelefone(tel);
            usuario.setRua(txtRua.getText());
            usuario.setNumero(txtNumero.getText());
            usuario.setBairro(txtBairro.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCep(cep);
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(pwd1.getText());
            usuario.setTipo(cbTipoUsuario.getSelectedItem().toString());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.inserir(usuario);

            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }
        this.atualizarTB();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoUsuarioActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void pwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd2ActionPerformed

    private void pwd2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwd2KeyReleased
        String pass1 = pwd1.getText();
        String pass2 = pwd2.getText();

        if (pass1.equals("") && pass2.equals("")) {
            lblCheck1.setVisible(false);
            lblCheck2.setVisible(false);
            lblWrong1.setVisible(true);
            lblWrong2.setVisible(true);
        } else if (pass2.equals(pass1)) {
            lblCheck1.setVisible(true);
            lblCheck2.setVisible(true);
            lblWrong1.setVisible(false);
            lblWrong2.setVisible(false);
        } else {
            lblCheck1.setVisible(false);
            lblCheck2.setVisible(false);
            lblWrong1.setVisible(true);
            lblWrong2.setVisible(true);
        }
    }//GEN-LAST:event_pwd2KeyReleased

    private void tbUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMousePressed

        int linha = tbUsuario.getSelectedRow();
        txtNome.setText(tbUsuario.getModel().getValueAt(linha, 1).toString());
        txtCpf.setText(tbUsuario.getModel().getValueAt(linha, 2).toString());
        txtRua.setText(tbUsuario.getModel().getValueAt(linha, 3).toString());
        txtBairro.setText(tbUsuario.getModel().getValueAt(linha, 4).toString());
        txtCidade.setText(tbUsuario.getModel().getValueAt(linha, 5).toString());
        txtNumero.setText(tbUsuario.getModel().getValueAt(linha, 6).toString());
        txtCep.setText(tbUsuario.getModel().getValueAt(linha, 7).toString());
        txtTel.setText(tbUsuario.getModel().getValueAt(linha, 8).toString());
        txtLogin.setText(tbUsuario.getModel().getValueAt(linha, 9).toString());
        if (tbUsuario.getModel().getValueAt(linha, 10).toString().equals("Admin")) {
            cbTipoUsuario.setSelectedIndex(0);
        } else {
            cbTipoUsuario.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tbUsuarioMousePressed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String palavra = txtConsulta.getText();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> listaUsuario = usuarioDAO.buscar(palavra);
        carregarTabela(listaUsuario);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        int linha = tbUsuario.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário na tabela pra excluir");
        } else {

            int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Cadastro?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            Integer cod = Integer.parseInt(tbUsuario.getModel().getValueAt(tbUsuario.getSelectedRow(), 0).toString());

            if (opc == JOptionPane.YES_OPTION) {
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                Usuario usuario = usuarioDAO.buscar(cod);
                usuarioDAO.excluir(usuario);
                JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");
            }
        }
        this.atualizarTB();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd1ActionPerformed

    private void pwd1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd1MousePressed

    private void pwd1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd1MouseReleased

    }//GEN-LAST:event_pwd1MouseReleased

    private void pwd2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd2MouseReleased

    private void pwd1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwd1KeyReleased
        String pass1 = pwd1.getText();
        String pass2 = pwd2.getText();

        if (pass1.equals("") && pass2.equals("")) {
            lblCheck1.setVisible(false);
            lblCheck2.setVisible(false);
            lblWrong1.setVisible(true);
            lblWrong2.setVisible(true);
        } else if (pass1.equals(pass2)) {
            lblCheck1.setVisible(true);
            lblCheck2.setVisible(true);
            lblWrong1.setVisible(false);
            lblWrong2.setVisible(false);
        } else {
            lblCheck1.setVisible(false);
            lblCheck2.setVisible(false);
            lblWrong1.setVisible(true);
            lblWrong2.setVisible(true);
        }
    }//GEN-LAST:event_pwd1KeyReleased

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void carregarTabela(List<Usuario> lista) {

        String[] colunasTabela = new String[]{"Código", "Nome", "CPF", "Rua", "Bairro", "Cidade", "Número",
            "CEP", "Telefone", "Login", "Tipo"};

        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela) {

            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        tbUsuario.setModel(modeloTabela);

        for (Usuario usuario : lista) {
            modeloTabela.addRow(new String[]{usuario.getCodUsuario().toString(), usuario.getNome(), usuario.getCpf(),
                usuario.getRua(), usuario.getBairro(), usuario.getCidade(), usuario.getNumero(), usuario.getCep(),
                usuario.getTelefone(), usuario.getLogin(), usuario.getTipo()});
        }
    }

    private void limparCampos() {
        txtBairro.setText(null);
        txtCep.setValue(null);
        txtCidade.setText(null);
        txtCpf.setValue(null);
        txtConsulta.setText(null);
        txtTel.setText(null);
        txtNumero.setText(null);
        txtNome.setText(null);
        txtRua.setText(null);
        txtLogin.setText(null);
        pwd1.setText(null);
        pwd2.setText(null);
        lblCheck1.setVisible(false);
        lblCheck2.setVisible(false);
        lblWrong1.setVisible(false);
        lblWrong2.setVisible(false);

    }

    public boolean verificarCampos() {

        if ((txtNome.getText().isEmpty()) || (txtCpf.getText().trim().length() != 14) || (txtRua.getText().isEmpty())
                || (txtNumero.getText().isEmpty()) || (txtCidade.getText().isEmpty())
                || (txtBairro.getText().isEmpty()) || (txtCep.getText().trim().length() != 9)
                || (txtLogin.getText().isEmpty()) || (txtTel.getText().trim().length() != 13)
                || (pwd1.getText().isEmpty()) || (pwd2.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios!");
            return false;
        } else {
            return true;
        }
    }

    public void atualizarTB() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> listaUsuario = usuarioDAO.listar();
        carregarTabela(listaUsuario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProdutos;
    private javax.swing.JLabel lblCheck1;
    private javax.swing.JLabel lblCheck2;
    private javax.swing.JLabel lblWrong1;
    private javax.swing.JLabel lblWrong2;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables

}

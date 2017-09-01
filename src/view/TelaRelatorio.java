/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.BaseReport;
import dao.EntradaDAO;
import dao.FornecedorDAO;
import dao.ItemEntradaDAO;
import dao.ItemProdutoDAO;
import dao.MovimentoDAO;
import dao.ProdutoDAO;
import dao.TipoMovimentoDAO;
import dao.VendaDAO;
import dominio.Entrada;
import dominio.Fornecedor;
import dominio.ItemEntrada;
import dominio.Movimento;
import dominio.Produto;
import dominio.TipoMovimento;
import dominio.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.TelaInicial.tipoUser;

/**
 *
 * @author Bruno
 */
public class TelaRelatorio extends javax.swing.JPanel {

    /**
     * Creates new form Relatorio
     */
    public TelaRelatorio() {
        initComponents();
        //txtDe.setEnabled(false);
       // txtAte.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTipoRelatorio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorios = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnvisualizar = new javax.swing.JButton();
        txDe = new com.toedter.calendar.JDateChooser();
        txAte = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbProdutos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbProdutos.setText("Relatórios");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("De");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Filtro");

        cbTipoRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Estoque", "Saídas", "Movimentos" }));
        cbTipoRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoRelatorio.setFocusable(false);
        cbTipoRelatorio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoRelatorioItemStateChanged(evt);
            }
        });
        cbTipoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoRelatorioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Até");

        tbRelatorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbRelatorios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRelatorios.setGridColor(new java.awt.Color(204, 204, 204));
        tbRelatorios.setRowHeight(30);
        jScrollPane1.setViewportView(tbRelatorios);

        btnImprimir.setBackground(java.awt.Color.darkGray);
        btnImprimir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Emitir Relatório");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setBackground(java.awt.Color.darkGray);
        btnGerarRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarRelatorio.setFocusable(false);
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        jLabel5.setText("**  Para relatório de estoque não é necessário inserir datas");

        btnvisualizar.setBackground(java.awt.Color.darkGray);
        btnvisualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnvisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnvisualizar.setText("Visualizar Itens");
        btnvisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvisualizar.setFocusable(false);
        btnvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisualizarActionPerformed(evt);
            }
        });

        txDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txDeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 255, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(810, 810, 810))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbProdutos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txDe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txAte, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGerarRelatorio)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnvisualizar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnvisualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerarRelatorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
    int opc = cbTipoRelatorio.getSelectedIndex();
    
    if(tbRelatorios.getRowCount() > 0){
    
    switch(opc){
        case 0:
                         
            BaseReport pdfEntradas = new BaseReport("Relatório de Entradas", new String[]{"Códgo da Entrada","Data da entrada", "Modelo do Produto", "Nome do Produto", "Qtd Entrada"});
        try {
            pdfEntradas.runReport(tbRelatorios,"C:\\Users\\Bruno\\Documents","EntradaSis");
            
           Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe C:/Users/Bruno/Documents/EntradaSis.pdf");
           
        } catch (Exception ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
            break;
            
        case 1:
            
            BaseReport pdfEstoque = new BaseReport("Relatório de Estoque", new String[]{"Código do Produto","Nome do produto - Modelo", "Qtd Estoque"});
        try {
            pdfEstoque.runReport(tbRelatorios,"C:\\Users\\Bruno\\Documents","estoqueSis");
            
           Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe C:/Users/Bruno/Documents/estoqueSis.pdf");
           
        } catch (Exception ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         break;
             
        case 2:
            
            BaseReport pdfVendas = new BaseReport("Relatório De Vendas", new String[]{"Códgo da Venda","Data da venda", "Valor total pago", "Cliente", "Funcionário"});
        try {
            pdfVendas.runReport(tbRelatorios,"C:\\Users\\Bruno\\Documents","vendasSis");
            
            Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe C:/Users/Bruno/Documents/vendasSis.pdf");
           
        } catch (Exception ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
            break;
            
        case 3:
            
            BaseReport pdfMovimentos = new BaseReport("Relatório De Movimentações do Sistema", new String[]{"Código do Movimento","Data da ação", "Tipo", "Funcionário"});
        try {
            pdfMovimentos.runReport(tbRelatorios,"C:\\Users\\Bruno\\Documents","movimentoSis");
            
            Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe C:/Users/Bruno/Documents/movimentoSis.pdf");
           
        } catch (Exception ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
            break;
    }    
        TipoMovimentoDAO tipoMovimentoDAO = new TipoMovimentoDAO();
        TipoMovimento tipoMov = tipoMovimentoDAO.buscar(2);
        
        Movimento movimento = new Movimento();
        movimento.setDataExecucao( new Date());
        movimento.setTipoMovimento(tipoMov);
        movimento.setUsuario(tipoUser);
        
        MovimentoDAO movimentoDAO = new MovimentoDAO();
        movimentoDAO.inserir(movimento);
        
        
    }else{
        JOptionPane.showMessageDialog(null, "Tabela vazia, não é possivel salvar pdf");
    }
        
    
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        
        //data inicial dos dados
        String dataInicio = null;
        //data final dos dados
        String dataFim = null;
        
        try {
            dataInicio = new SimpleDateFormat("dd/MM/yyyy").format(txDe.getDate());
            dataFim = new SimpleDateFormat("dd/MM/yyyy").format(txAte.getDate());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int tiporelatorio = cbTipoRelatorio.getSelectedIndex();
        
        switch(tiporelatorio){
            
            case 0:
                
               if(dataInicio == null || dataFim == null){
                   
                   JOptionPane.showMessageDialog(null, "Para consultar entradas digite as datas de intervalo!");
                   
               }else{
               EntradaDAO entradaDAO = new EntradaDAO();
                List<Entrada> entradas = entradaDAO.listarRelatorio(txDe.getDate(), txAte.getDate());
                
                this.carregarTabelaEntradas(entradas);
               }
                 
                
                break;
                
            case 1:
                ProdutoDAO produtoDAO = new ProdutoDAO();
                List<Produto> estoque = produtoDAO.listar();
                
                this.carregarTabelaEstoque(estoque);
                
                break;
                
            case 2: 
                
                 if(dataInicio == null || dataFim == null){
                   
                   JOptionPane.showMessageDialog(null, "Para consultar saídas digite as datas de intervalo!");
                   
               }else{
                     
                VendaDAO vendaDAO = new VendaDAO();
                List<Venda> vendas = vendaDAO.listarRelatorio(txDe.getDate(), txAte.getDate());
                
                this.carregarTabelaVenda(vendas);
               }
                break;
                
            case 3:
                 if(dataInicio == null || dataFim == null){
                   
                   JOptionPane.showMessageDialog(null, "Para consultar Movimentos digite as datas de intervalo!");
                   
               }else{
                     
                MovimentoDAO movimentoDAO = new MovimentoDAO();
                List<Movimento> movimentos = movimentoDAO.listarRelatorio(txDe.getDate(), txAte.getDate());
                
                this.carregarTabelaMovimento(movimentos);
               }
               break;
               
            default:
                   System.out.println("Não deu certo!!!");     
        }
        
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void cbTipoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoRelatorioActionPerformed
        //if(cbTipoRelatorio.getSelectedIndex() != 0){
            //txtDe.setEnabled(false);
            //txtAte.setEnabled(false);
        //}
    }//GEN-LAST:event_cbTipoRelatorioActionPerformed

    private void cbTipoRelatorioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoRelatorioItemStateChanged
           if(cbTipoRelatorio.getSelectedIndex() == 1){
                txDe.setEnabled(false);
                txAte.setEnabled(false);
                btnvisualizar.setVisible(false);
        }else{
               txDe.setEnabled(true);
               txAte.setEnabled(true);
               btnvisualizar.setVisible(true);
           }
    }//GEN-LAST:event_cbTipoRelatorioItemStateChanged

    private void btnvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisualizarActionPerformed
        
        if(tbRelatorios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro na tabela para visualizar os itens ");
        }else{
        int tipo = cbTipoRelatorio.getSelectedIndex();
        int linha = tbRelatorios.getSelectedRow();
        String data = tbRelatorios.getValueAt(linha, 1).toString();
        
        if(tipo == 0){
        
            Itens itens = null;
        int cod = Integer.parseInt(tbRelatorios.getValueAt(linha, 0).toString());
        String nome = tbRelatorios.getValueAt(linha, 3).toString();
            try {
                itens = new Itens(tipo , cod, nome, data);
            } catch (Exception e){ 
            }
        
        itens.setVisible(true);
         
        }else if(tipo == 2){
        
            Itens itens = null;
        int cod = Integer.parseInt(tbRelatorios.getValueAt(linha, 0).toString());
        String nome = tbRelatorios.getValueAt(linha, 3).toString();
            try {
                itens = new Itens(tipo , cod, nome, data);
            } catch (Exception e){ 
            }
        
        itens.setVisible(true);
         
        }
       }
       
    }//GEN-LAST:event_btnvisualizarActionPerformed

    private void txDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txDeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txDeMouseClicked

    private void carregarTabelaEntradas(List<Entrada> entradaLista){
    
    String[] colunaTabela = new String[]{"Código da Entrada","Data da entrada", "Fornecedor", "Nota Fiscal"};
    
    DefaultTableModel modeloTabela = new DefaultTableModel(null, colunaTabela){
      public boolean isCellSelected(int row, int col){
          return false;
      }  
    };
    
    tbRelatorios.setModel(modeloTabela);
   
    
     for(Entrada ent: entradaLista){         
                        
                      modeloTabela.addRow(new String[]{ ent.getCodEntrada().toString(), ent.getDataEntrada().toString(),
                          ent.getCodFornecedor().getRazaoSocial(), ent.getNotafiscal()});  
                     
                }
}
    
private void carregarTabelaEstoque(List<Produto> estoque){
    
    String[] colunaTabela = new String[]{"Código do Produto","Nome do produto - Modelo", "Qtd Estoque"};
    
    DefaultTableModel modeloTabela = new DefaultTableModel(null, colunaTabela){
        public boolean isCellSelected(int row, int col){
            return false;
        }
    };
    
        tbRelatorios.setModel(modeloTabela);

    for(Produto produto: estoque){
    modeloTabela.addRow( new String[]{produto.getCodBarras() ,produto.getNomeProduto() + " - " + produto.getModelo(), produto.getQtdEstoque().toString()});
    
    }
}

 private void carregarTabelaVenda(List<Venda> vendaLista){
    
    String[] colunaTabela = new String[]{"Código da Venda","Data da venda", "Valor total pago", "Cliente", "Funcionário"};
    
    DefaultTableModel modeloTabela = new DefaultTableModel(null, colunaTabela){
      public boolean isCellSelected(int row, int col){
          return false;
      }  
    };
    
    tbRelatorios.setModel(modeloTabela);
   
    
     for(Venda venda: vendaLista){
         
         Date data = null;
         String dt = null;
         
        try {
            data = new SimpleDateFormat("yyyy-MM-dd").parse(venda.getDataVenda().toString());
            dt = new SimpleDateFormat("dd/MM/yyyy").format(data);
        } catch (ParseException ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nomeCli;
        if(venda.getCodCliente() == null){
            nomeCli ="Venda sem CPF";
        }else{
            nomeCli = venda.getCodCliente().getNome();
        }
          
         modeloTabela.addRow(new String[]{venda.getCodVenda().toString(),
         dt,
         venda.getValorTotal().toString(),
         nomeCli,
         venda.getCodUsuario().getNome()
         });
         
         
                     
      }
}
 
 private void carregarTabelaMovimento(List<Movimento> movimentoLista){
    
    String[] colunaTabela = new String[]{"Código do Movimento","Data de ação", "Tipo Movimento", "Usuário"};
    
    DefaultTableModel modeloTabela = new DefaultTableModel(null, colunaTabela){
      public boolean isCellSelected(int row, int col){
          return false;
      }  
    };
    
    tbRelatorios.setModel(modeloTabela);
   
    
     for(Movimento movimento: movimentoLista){
         
         Date data = null;
         String dt = null;
         
        try {
            data = new SimpleDateFormat("yyyy-MM-dd").parse(movimento.getDataExecucao().toString());
            dt = new SimpleDateFormat("dd/MM/yyyy").format(data);
        } catch (ParseException ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         modeloTabela.addRow(new String[]{movimento.getCodMovimento().toString(),
         dt,
         movimento.getTipoMovimento().getTipoMov(),
         movimento.getUsuario().getNome()
         });
         
         
                     
      }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnvisualizar;
    private javax.swing.JComboBox<String> cbTipoRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProdutos;
    private javax.swing.JTable tbRelatorios;
    private com.toedter.calendar.JDateChooser txAte;
    private com.toedter.calendar.JDateChooser txDe;
    // End of variables declaration//GEN-END:variables
}

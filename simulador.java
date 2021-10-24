
package Simulador;


import javax.swing.table.DefaultTableModel;


public class simulador extends javax.swing.JFrame {
    private Memoria memoria;
    private Proceso procesos[];
    private int contadorProceso = 0;


    public simulador() {
        initComponents();
    }

    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalTrenzas3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fieldMemoriaPrincipal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldPagina = new javax.swing.JTextField();
        instalar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNombreProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldTamañoProceso = new javax.swing.JTextField();
        crearProceso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelTamañoMemoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelMemoriaDisponible = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelMemoriaUsada = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelCantidadProcesos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelMarcosPagina = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTamañoPagina = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMemoriaPrincipal = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        totalTrenzas3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalTrenzas3.setText("X");

        jLabel14.setText("Tamaño secundario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Instalación"));

        fieldMemoriaPrincipal.setText("2048");
        fieldMemoriaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMemoriaPrincipalActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño memoria principal MB");

        jLabel4.setText("Tamaño p");

        fieldPagina.setText("256");
        fieldPagina.setToolTipText("");
        fieldPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPaginaActionPerformed(evt);
            }
        });

        instalar.setText("Asignar Memoria");
        instalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldMemoriaPrincipal)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPagina)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(instalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldMemoriaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instalar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Proceso"));

        jLabel1.setText("Nombre del proceso");

        fieldNombreProceso.setText("notepad.exe 0");
        fieldNombreProceso.setToolTipText("");
        fieldNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreProcesoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño del proceso KB");

        fieldTamañoProceso.setText("200000");
        fieldTamañoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamañoProcesoActionPerformed(evt);
            }
        });

        crearProceso.setText("Crear proceso");
        crearProceso.setEnabled(false);
        crearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProcesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNombreProceso)
                    .addComponent(fieldTamañoProceso)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(crearProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTamañoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearProceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estatus Memoria"));

        jLabel6.setText("Cantidad de memoria");

        labelTamañoMemoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTamañoMemoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTamañoMemoria.setText("X");

        jLabel7.setText("Memoria disponible");

        labelMemoriaDisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMemoriaDisponible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMemoriaDisponible.setText("X");

        jLabel8.setText("Memoria usada:");

        labelMemoriaUsada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMemoriaUsada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMemoriaUsada.setText("X");

        jLabel9.setText("Cantidad de procesos");

        labelCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCantidadProcesos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCantidadProcesos.setText("X");

        jLabel10.setText("Marcos de página");

        labelMarcosPagina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMarcosPagina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMarcosPagina.setText("X");

        jLabel12.setText("Tamaño de pagina");

        labelTamañoPagina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTamañoPagina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTamañoPagina.setText("X");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTamañoMemoria))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMemoriaDisponible))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMemoriaUsada))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(labelCantidadProcesos))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMarcosPagina))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTamañoPagina)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelTamañoMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelMemoriaDisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelMemoriaUsada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelCantidadProcesos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelMarcosPagina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(labelTamañoPagina))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Memoria principal"));

        tablaMemoriaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dirección fisica", "ID Proceso", "Nombre de proceso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMemoriaPrincipal);
        if (tablaMemoriaPrincipal.getColumnModel().getColumnCount() > 0) {
            tablaMemoriaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de procesos"));

        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre", "Tamaño", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProcesos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablaProcesosFocusLost(evt);
            }
        });
        tablaProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProcesosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProcesos);
        if (tablaProcesos.getColumnModel().getColumnCount() > 0) {
            tablaProcesos.getColumnModel().getColumn(0).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(1).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(2).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane4.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProcesoActionPerformed
        String nombreProceso = fieldNombreProceso.getText();       
        int tamañoProceso = Integer.parseInt(fieldTamañoProceso.getText());
        if (tamañoProceso <= memoria.getMemoriaPrincipal()) {
            moverRamdomMemoriaToAlmacenamiento();
            this.procesos[contadorProceso] = new Proceso(contadorProceso, nombreProceso, tamañoProceso, memoria.getTamañoPagina());
            this.memoria.agregarProceso(this.procesos[contadorProceso]);
            textArea.append("- Proceso de tamaño "+tamañoProceso+", su id es '"+contadorProceso+"', paginas que posee son "+tamañoProceso/memoria.getTamañoPagina()+"\n");
            contadorProceso++;
            labelCantidadProcesos.setText(Integer.toString(contadorProceso));
            fieldNombreProceso.setText("notepad.exe "+contadorProceso);
            actualizar();
        } else {
            textArea.append("* ALERTA: SIN ESPACIO EN MEMORIA PRINCIPAL\n");
        }
    }//GEN-LAST:event_crearProcesoActionPerformed

    private void fieldTamañoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoActionPerformed
        // CONTINUACION PROYECTO
    }//GEN-LAST:event_fieldTamañoProcesoActionPerformed

    private void fieldNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreProcesoActionPerformed
        // CONTINUACION PROYECTO
    }//GEN-LAST:event_fieldNombreProcesoActionPerformed

    private void tablaProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProcesosMouseClicked
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        String estado = procesos[idProceso].getEstado();
        
    }//GEN-LAST:event_tablaProcesosMouseClicked

    private void tablaProcesosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaProcesosFocusLost
        // CONTINUACION PROYECTO
    }//GEN-LAST:event_tablaProcesosFocusLost

    private void instalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalarActionPerformed
        int tamañoMemoria1 = Integer.parseInt(fieldMemoriaPrincipal.getText());
        int tamañoMemoria = tamañoMemoria1*1024;
        
        
        int tamañoPagina = Integer.parseInt(fieldPagina.getText());
        if ((tamañoMemoria % 2) == 0 && (tamañoPagina % 2) == 0) {
            if (tamañoMemoria > tamañoPagina) {
                memoria = new Memoria(tamañoMemoria, 0, tamañoPagina, textArea);
                
            } else {
                // tamaño de pagina mayor que la memoria
            }
        } else {
            
        }
        this.procesos = new Proceso[memoria.getMaximasPaginas()];
        instalar.setEnabled(false);
        labelTamañoMemoria.setText(Integer.toString(tamañoMemoria));
        labelMemoriaDisponible.setText(Integer.toString(tamañoMemoria));
        labelMemoriaUsada.setText("0");
        labelCantidadProcesos.setText("0");
        labelMarcosPagina.setText(Integer.toString(memoria.getCantidadMarcos()));
        labelTamañoPagina.setText(Integer.toString(tamañoPagina));
        crearProceso.setEnabled(true);
        textArea.append("- Manejo de memoria\n");
        actualizarMemoriaPrincipal();
       
    }//GEN-LAST:event_instalarActionPerformed

    private void fieldPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPaginaActionPerformed
       
    }//GEN-LAST:event_fieldPaginaActionPerformed

    private void fieldMemoriaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMemoriaPrincipalActionPerformed
       
    }//GEN-LAST:event_fieldMemoriaPrincipalActionPerformed

    public static void main(String args[]) {
        try {
            
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulador().setVisible(true);
            }
        });
    }
    
    private void moverRamdomMemoriaToAlmacenamiento() {
        if(memoria.getMemoriaPrincipal() == 0) {
            try {
                for(int i = 0; i < procesos.length; i++) {
                    }
            } catch(NullPointerException e) {
                for(int i = 0; i < procesos.length; i++) {
                    if(procesos[i].getPaginasMemoriaPrincipal() == 1) {                        
                        textArea.append("> Proceso suspendido id "+procesos[i].getIdProceso()+" Memoria llena de procesos.\n");
                        procesos[i].setEstado("Suspendido");
                        break;
                    }
                }
            }
            }
    }
    
    private void actualizar() {
        labelMemoriaDisponible.setText(Integer.toString(memoria.getMemoriaPrincipal()));
        labelMemoriaUsada.setText(Integer.toString(memoria.getMemoriaPrincipalTotal() - memoria.getMemoriaPrincipal()));
        actualizarProcesos();
        actualizarMemoriaPrincipal();
        
    }
    
    private void actualizarProcesos() {
        DefaultTableModel model = (DefaultTableModel) tablaProcesos.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for (int i = 0; i < contadorProceso; i++) {
            Object[] row = {procesos[i].getIdProceso(), procesos[i].getNombre(), procesos[i].getTamaño(), procesos[i].getCantidadPaginas(), procesos[i].getEstado(), procesos[i].getPaginasMemoriaPrincipal()/*, procesos[i].getPaginasMemoriaSecundaria()*/};
            model.addRow(row); 
        }
    }
        
    private void actualizarMemoriaPrincipal() {
        DefaultTableModel model = (DefaultTableModel) tablaMemoriaPrincipal.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Pagmemoria paginasAux[] = memoria.getMemoria();
        
        int desplazar = 0;
        
        for (int i = 0; i < paginasAux.length; i++) {
            int direccion = (paginasAux[i].getIdMarco()*memoria.getTamañoPagina());
            Object[] row = {"0x"+Integer.toHexString(direccion), paginasAux[i].getIdMarco()+1, paginasAux[i].getIdProceso(), paginasAux[i].getNombreProceso(), paginasAux[i].getIdPagina()};
            model.addRow(row); 
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearProceso;
    private javax.swing.JTextField fieldMemoriaPrincipal;
    private javax.swing.JTextField fieldNombreProceso;
    private javax.swing.JTextField fieldPagina;
    private javax.swing.JTextField fieldTamañoProceso;
    private javax.swing.JButton instalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCantidadProcesos;
    private javax.swing.JLabel labelMarcosPagina;
    private javax.swing.JLabel labelMemoriaDisponible;
    private javax.swing.JLabel labelMemoriaUsada;
    private javax.swing.JLabel labelTamañoMemoria;
    private javax.swing.JLabel labelTamañoPagina;
    private javax.swing.JTable tablaMemoriaPrincipal;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel totalTrenzas3;
    // End of variables declaration//GEN-END:variables
}

package co.edu.Polinomios.Vista;

import co.edu.Polinomios.Controlador.Controlador;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    Controlador controlador;
    public Inicio() {
        initComponents();
        listaOperacionesEntrePolinomios.setEnabled(false);
        listaOperacionesPolinomio.setEnabled(false);
        campoVariable.setEnabled(false);
        botonAceptarOperacionEntrePolinomios.setEnabled(false);
        botonAceptarOperacionPolinomio.setEnabled(false);
        campoPolinomio2.setEnabled(false);
        botonIngreso2.setEnabled(false);
        listaPolinomio.setEnabled(false);
        controlador = new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresoPolinomio2 = new javax.swing.JPanel();
        labelPolinomioIngreso2 = new javax.swing.JLabel();
        campoPolinomio2 = new javax.swing.JTextField();
        botonIngreso2 = new javax.swing.JButton();
        panelIngresoPolinomio1 = new javax.swing.JPanel();
        labelPolinomioIngreso1 = new javax.swing.JLabel();
        botonPolinomio1 = new javax.swing.JButton();
        campoPolinomio1 = new javax.swing.JTextField();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelPolinomio1 = new javax.swing.JPanel();
        labelPolinomio1 = new javax.swing.JLabel();
        panelPolinomio2 = new javax.swing.JPanel();
        labelPolinomio2 = new javax.swing.JLabel();
        panelOperacionesPolinomio = new javax.swing.JPanel();
        listaOperacionesPolinomio = new javax.swing.JComboBox<>();
        listaPolinomio = new javax.swing.JComboBox<>();
        labelOperacionesPolinomio = new javax.swing.JLabel();
        labelPolinomioSeleccionado = new javax.swing.JLabel();
        botonAceptarOperacionPolinomio = new javax.swing.JButton();
        labelVariable = new javax.swing.JLabel();
        campoVariable = new javax.swing.JTextField();
        panelOperacionesEntrePolinomios = new javax.swing.JPanel();
        labelOperacionesEntrePolinomios = new javax.swing.JLabel();
        listaOperacionesEntrePolinomios = new javax.swing.JComboBox<>();
        botonAceptarOperacionEntrePolinomios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameInicio"); // NOI18N
        setResizable(false);

        panelIngresoPolinomio2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso segundo polinomio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelPolinomioIngreso2.setText("Polinomio 2:");

        botonIngreso2.setText("Ingresar");
        botonIngreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngreso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoPolinomio2Layout = new javax.swing.GroupLayout(panelIngresoPolinomio2);
        panelIngresoPolinomio2.setLayout(panelIngresoPolinomio2Layout);
        panelIngresoPolinomio2Layout.setHorizontalGroup(
            panelIngresoPolinomio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoPolinomio2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomioIngreso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPolinomio2)
                .addContainerGap())
            .addGroup(panelIngresoPolinomio2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(botonIngreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIngresoPolinomio2Layout.setVerticalGroup(
            panelIngresoPolinomio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoPolinomio2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelIngresoPolinomio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPolinomioIngreso2)
                    .addComponent(campoPolinomio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIngreso2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelIngresoPolinomio1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso primer polinomio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelPolinomioIngreso1.setText("Polinomio 1:");

        botonPolinomio1.setText("Ingresar");
        botonPolinomio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPolinomio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoPolinomio1Layout = new javax.swing.GroupLayout(panelIngresoPolinomio1);
        panelIngresoPolinomio1.setLayout(panelIngresoPolinomio1Layout);
        panelIngresoPolinomio1Layout.setHorizontalGroup(
            panelIngresoPolinomio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoPolinomio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomioIngreso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPolinomio1)
                .addContainerGap())
            .addGroup(panelIngresoPolinomio1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(botonPolinomio1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        panelIngresoPolinomio1Layout.setVerticalGroup(
            panelIngresoPolinomio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoPolinomio1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelIngresoPolinomio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPolinomioIngreso1)
                    .addComponent(campoPolinomio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPolinomio1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelTitulo.setFont(new java.awt.Font("Droid Serif", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(154, 27, 27));
        labelTitulo.setText("Operaciones con Polinomios");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo))
        );

        panelPolinomio1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Polinomio 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelPolinomio1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        labelPolinomio1.setForeground(new java.awt.Color(86, 191, 115));
        labelPolinomio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPolinomio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPolinomio1Layout = new javax.swing.GroupLayout(panelPolinomio1);
        panelPolinomio1.setLayout(panelPolinomio1Layout);
        panelPolinomio1Layout.setHorizontalGroup(
            panelPolinomio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomio1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPolinomio1Layout.setVerticalGroup(
            panelPolinomio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomio1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPolinomio2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Polinomio 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelPolinomio2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        labelPolinomio2.setForeground(new java.awt.Color(86, 191, 115));
        labelPolinomio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPolinomio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPolinomio2Layout = new javax.swing.GroupLayout(panelPolinomio2);
        panelPolinomio2.setLayout(panelPolinomio2Layout);
        panelPolinomio2Layout.setHorizontalGroup(
            panelPolinomio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomio2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomio2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPolinomio2Layout.setVerticalGroup(
            panelPolinomio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomio2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPolinomio2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOperacionesPolinomio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones con un solo polinomio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        listaOperacionesPolinomio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar Opción-", "1. Borrar polinomio", "2. Evaluar Polinomio", "3. Primera Derivada", "4. n-ésima Derivada", "5. Integral indefinida", "6. Integral definida" }));

        listaPolinomio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Polinomio 1", "Polinomio 2" }));

        labelOperacionesPolinomio.setText("Operaciones: ");

        labelPolinomioSeleccionado.setText("Polinomio: ");

        botonAceptarOperacionPolinomio.setText("Aceptar");
        botonAceptarOperacionPolinomio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarOperacionPolinomioActionPerformed(evt);
            }
        });

        labelVariable.setText("Variable:");

        javax.swing.GroupLayout panelOperacionesPolinomioLayout = new javax.swing.GroupLayout(panelOperacionesPolinomio);
        panelOperacionesPolinomio.setLayout(panelOperacionesPolinomioLayout);
        panelOperacionesPolinomioLayout.setHorizontalGroup(
            panelOperacionesPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesPolinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesPolinomioLayout.createSequentialGroup()
                        .addComponent(labelOperacionesPolinomio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaOperacionesPolinomio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelOperacionesPolinomioLayout.createSequentialGroup()
                        .addComponent(labelPolinomioSeleccionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listaPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelVariable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoVariable, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesPolinomioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptarOperacionPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        panelOperacionesPolinomioLayout.setVerticalGroup(
            panelOperacionesPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesPolinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOperacionesPolinomio)
                    .addComponent(listaOperacionesPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOperacionesPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPolinomioSeleccionado)
                    .addComponent(listaPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVariable)
                    .addComponent(campoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAceptarOperacionPolinomio, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        panelOperacionesEntrePolinomios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones entre polinomios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelOperacionesEntrePolinomios.setText("Operaciones:");

        listaOperacionesEntrePolinomios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar polinomios", "Multiplicar polinomios", "Determinar factor del polinomio" }));

        botonAceptarOperacionEntrePolinomios.setText("Aceptar");
        botonAceptarOperacionEntrePolinomios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarOperacionEntrePolinomiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesEntrePolinomiosLayout = new javax.swing.GroupLayout(panelOperacionesEntrePolinomios);
        panelOperacionesEntrePolinomios.setLayout(panelOperacionesEntrePolinomiosLayout);
        panelOperacionesEntrePolinomiosLayout.setHorizontalGroup(
            panelOperacionesEntrePolinomiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesEntrePolinomiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOperacionesEntrePolinomios)
                .addGap(18, 18, 18)
                .addComponent(listaOperacionesEntrePolinomios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelOperacionesEntrePolinomiosLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(botonAceptarOperacionEntrePolinomios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        panelOperacionesEntrePolinomiosLayout.setVerticalGroup(
            panelOperacionesEntrePolinomiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesEntrePolinomiosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelOperacionesEntrePolinomiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOperacionesEntrePolinomios)
                    .addComponent(listaOperacionesEntrePolinomios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAceptarOperacionEntrePolinomios, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resulltado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelResultado.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(86, 191, 115));
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPolinomio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelIngresoPolinomio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelIngresoPolinomio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelPolinomio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelOperacionesPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelOperacionesEntrePolinomios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIngresoPolinomio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIngresoPolinomio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPolinomio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPolinomio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOperacionesPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOperacionesEntrePolinomios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        panelPolinomio2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPolinomio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPolinomio1ActionPerformed
        // TODO add your handling code here:
//        labelPolinomio1.setText(campoPolinomio1.getText());
        controlador.crearPolinomio1(campoPolinomio1.getText());
        campoPolinomio1.setEnabled(false);
        botonPolinomio1.setEnabled(false);
        campoPolinomio2.setEnabled(true);
        botonIngreso2.setEnabled(true);
        labelPolinomio1.setText(controlador.imprimePolinomio(0));
        campoPolinomio1.setText("");        
    }//GEN-LAST:event_botonPolinomio1ActionPerformed

    private void botonIngreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngreso2ActionPerformed
        // TODO add your handling code here:
//        labelPolinomio2.setText(campoPolinomio2.getText());
        controlador.crearPolinomio2(campoPolinomio2.getText());
        campoPolinomio2.setEnabled(false);
        botonIngreso2.setEnabled(false);
        listaOperacionesEntrePolinomios.setEnabled(true);
        listaOperacionesPolinomio.setEnabled(true);
        campoVariable.setEnabled(true);
        botonAceptarOperacionEntrePolinomios.setEnabled(true);
        botonAceptarOperacionPolinomio.setEnabled(true);
        listaPolinomio.setEnabled(true);
        labelPolinomio2.setText(controlador.imprimePolinomio(1));
        campoPolinomio2.setText("");
    }//GEN-LAST:event_botonIngreso2ActionPerformed

    private void botonAceptarOperacionPolinomioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarOperacionPolinomioActionPerformed
        int opcion = listaOperacionesPolinomio.getSelectedIndex();
        switch (opcion) 
        {
            case 0:   
                JOptionPane.showMessageDialog(null, "Debe elegir una de las opciones de la lista.");
                break;
            case 1:       
                
                if(listaPolinomio.getSelectedIndex()==0)
                {
                    controlador.borrar(0);
                    labelResultado.setText(controlador.imprimePolinomio(0));
                }
                else
                {
                     controlador.borrar(1);
                    labelResultado.setText(controlador.imprimePolinomio(1));
                }
                
//                if(listaPolinomio.getSelectedIndex()==0)
//                {
//                    labelPolinomio1.setText("");
//                    campoPolinomio1.setEnabled(true);
//                    botonPolinomio1.setEnabled(true);
//                    listaOperacionesEntrePolinomios.setEnabled(false);
//                    botonAceptarOperacionEntrePolinomios.setEnabled(false);
//                }
//                else
//                {
//                    labelPolinomio2.setText("");
//                    campoPolinomio2.setEnabled(true);
//                    botonIngreso2.setEnabled(true);
//                    listaOperacionesEntrePolinomios.setEnabled(false);
//                    botonAceptarOperacionEntrePolinomios.setEnabled(false);
//                }
                break;
            case 2:
//                controlador.evaluarPolinomio(listaOperacionesPolinomio.getSelectedIndex());
                
                String s=campoVariable.getText();
                if (s==null || "".equals(s) || " ".equals(s)) {
                                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor para evaluar");

                }else{
                float a = Float.parseFloat(s);
                
                    if (listaPolinomio.getSelectedIndex()==0) {
                        labelResultado.setText(Double.toString(controlador.evaluarP(a,0)));
                    } else {
                        labelResultado.setText(Double.toString(controlador.evaluarP(a,1)));
                    }

                }
                
                break;
            case 3:
                if(listaPolinomio.getSelectedIndex()==0)
                {
                    controlador.derivar(0);
                    labelResultado.setText(controlador.imprimePolinomio(0));
                }
                else
                {
                     controlador.derivar(1);
                    labelResultado.setText(controlador.imprimePolinomio(1));
                }
//                labelPolinomio1.setText("");
                campoPolinomio1.setEnabled(true);
                botonPolinomio1.setEnabled(true);
                    listaOperacionesEntrePolinomios.setEnabled(false);
                    botonAceptarOperacionEntrePolinomios.setEnabled(false);
                
                break;
            case 4:
                String ss=campoVariable.getText();
                if (ss==null || "".equals(ss) || " ".equals(ss)) {
                                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor para evaluar");

                }else{
                int a = Integer.parseInt(ss);
                
                    if (listaPolinomio.getSelectedIndex()==0) {
                        controlador.nderivada(0,a);
                        labelResultado.setText(controlador.imprimePolinomio(0));
                    } else {
                        controlador.nderivada(1,a);
                        labelResultado.setText(controlador.imprimePolinomio(1));
                    }

                }
                
                break;
            case 5:
                if(listaPolinomio.getSelectedIndex()==0)
                {
                    controlador.integral(0);
                    labelResultado.setText(controlador.imprimePolinomio(0));
                }
                else
                {
                     controlador.integral(1);
                    labelResultado.setText(controlador.imprimePolinomio(1));
                }
                
                
                break;
            case 6:
                    
                String s2=campoVariable.getText();
                if (s2==null || "".equals(s2) || " ".equals(s2)) {
                                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor para evaluar");

                }else{
                    s2 = s2.replace(" ", "");
                    String[] limit = s2.split("-");
                    int a = Integer.parseInt(limit[0]);
                    int b = Integer.parseInt(limit[1]);
                
                    if (listaPolinomio.getSelectedIndex()==0) {
                        labelResultado.setText(Float.toString(controlador.integralD(a,b,0)));
                    } else {
                        labelResultado.setText(Float.toString(controlador.integralD(a,b,1)));
                    }

                }
                
                break;
            default:
                break;
        }
    }//GEN-LAST:event_botonAceptarOperacionPolinomioActionPerformed

    private void botonAceptarOperacionEntrePolinomiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarOperacionEntrePolinomiosActionPerformed
        int opcion = listaOperacionesEntrePolinomios.getSelectedIndex();
        switch (opcion) 
        {
            case 0:
                controlador.sumar();
                labelResultado.setText(controlador.imprimePolinomio(3));
                break;
            case 1:
                controlador.multiplicar();
                labelResultado.setText(controlador.imprimePolinomio(3));                
                break;
            case 2:
                
                labelResultado.setText(controlador.factor());      
                
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
//            default:
//                break;
        }
    }//GEN-LAST:event_botonAceptarOperacionEntrePolinomiosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarOperacionEntrePolinomios;
    private javax.swing.JButton botonAceptarOperacionPolinomio;
    private javax.swing.JButton botonIngreso2;
    private javax.swing.JButton botonPolinomio1;
    private javax.swing.JTextField campoPolinomio1;
    private javax.swing.JTextField campoPolinomio2;
    private javax.swing.JTextField campoVariable;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelOperacionesEntrePolinomios;
    private javax.swing.JLabel labelOperacionesPolinomio;
    private javax.swing.JLabel labelPolinomio1;
    private javax.swing.JLabel labelPolinomio2;
    private javax.swing.JLabel labelPolinomioIngreso1;
    private javax.swing.JLabel labelPolinomioIngreso2;
    private javax.swing.JLabel labelPolinomioSeleccionado;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVariable;
    private javax.swing.JComboBox<String> listaOperacionesEntrePolinomios;
    private javax.swing.JComboBox<String> listaOperacionesPolinomio;
    private javax.swing.JComboBox<String> listaPolinomio;
    private javax.swing.JPanel panelIngresoPolinomio1;
    private javax.swing.JPanel panelIngresoPolinomio2;
    private javax.swing.JPanel panelOperacionesEntrePolinomios;
    private javax.swing.JPanel panelOperacionesPolinomio;
    private javax.swing.JPanel panelPolinomio1;
    private javax.swing.JPanel panelPolinomio2;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}

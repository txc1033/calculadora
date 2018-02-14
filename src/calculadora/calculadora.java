/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import javax.swing.*;
import javax.swing.UIManager.*;

/**
 *
 * @author javie
 * calculadora basica evolutiva
 */
public class calculadora extends javax.swing.JFrame {

    Double numero1,numero2,respuesta; // se inicializan variables a usar de tipo double para uso global
    String operacion; // se inicializa variable a usar de tipo string que almacenara el operador para uso global
    
    @SuppressWarnings("UseSpecificCatch") // suprimir la advertencia de catch exception(sin especificar)
    public calculadora() { // clase para visualizar la ventana de la aplicaccion (app)
        setLocationRelativeTo(null); // metodo para centrar la ventana en el escritorio
        initComponents(); // metodo para inicializar los componentens de la app
        try { // try - catch para inicializar el metodo uimanager
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // metodo para asignar un tema para la app (visual)
        }catch(Exception ex){}} 
    
    @SuppressWarnings("UseSpecificCatch")// suprimir la advertencia de catch exception(sin especificar)
    public void oper (String op) { // metodo para las teclas de operacion sin retorno de valor y con recepcion de parametro op de tipo string
        String reset; // se inicializa variable local de tipo string
        try { // try - catch para controlar los errores del metodo
        if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)){//sentencia if que controla op solo permite los signos + - * /
            numero1 = Double.parseDouble(pantalla.getText()); // se le asigna a la variable numero1 el primer valor ingresado en pantalla (quedando en la memoria) para posterior uso
            pantalla.setText(""); // se limpia la pantalla
            operacion = op;}} // se le asigna el valor de op a la variable operacion siempre y cuando se cumpla la sentencia if
        catch (Exception e){ // en caso de error general
            reset = pantalla.getText(); // se le asigna el valor de pantalla en la variable reset
            pantalla.setText(reset); // se imprime el valor de reset
        }}
    
    public void teclado (int a) { // metodo paras las teclas numericas 0 a 9 teclas coma "," y tecla limpiar con recepcion de parametro a de tipo int
        String ingreseNumero; // se inicializa variable local
        if (pantalla.getText().length()<=16) { // sentencia if que controla la longuitud de valores que se muetra en la pantalla
        if (a <= 9) { // sentencia que ingresa los numeros en pantalla del 0 al 9 dependiendo de la variable a
           ingreseNumero = pantalla.getText() + a; // se le asigna a la variable ingreseNumero el valor de pantalla + el valor de a
           pantalla.setText(ingreseNumero);} // se imprime el valor de ingreseNumero asignado anteriormente
        if (a == 10){ // sentencia que al momento de detectar que la variable a sea igual a 10 procede a realizar la funcion de coma
           ingreseNumero = pantalla.getText() + ","; // se le asigna a la variable ingreseNumero el valor de pantalla + el valor ","
           pantalla.setText(ingreseNumero);} // se imprime el valor de ingreseNumero asignado anteriormente
        else{pantalla.getText();} //en caso de no cumplirse las sentencias anteriores se muestra el texto de pantalla [generalmente en null o ""]
        }
        if (a == 11){ // sentencia que al momento de detectar que la variable a sea igual a 11 procede a realizar la funcion de limpiar
            pantalla.setText("");} // se le asigna a la variable ingreseNumero el valor de pantalla + el valor ""
    }
    @SuppressWarnings("unchecked")// suprimir la advertencia de catch exception(sin especificar)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        divicion = new javax.swing.JButton();
        por = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(178, 244));
        setMinimumSize(new java.awt.Dimension(178, 244));
        setName("Calculadora"); // NOI18N
        setResizable(false);

        n1.setText("1");
        n1.setName("n1"); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.setName("n2"); // NOI18N
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.setName("n3"); // NOI18N
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.setName("n4"); // NOI18N
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.setName("n5"); // NOI18N
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.setName("n6"); // NOI18N
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.setName("n7"); // NOI18N
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.setName("n8"); // NOI18N
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setText("9");
        n9.setName("n9"); // NOI18N
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        coma.setText(",");
        coma.setMaximumSize(new java.awt.Dimension(37, 32));
        coma.setMinimumSize(new java.awt.Dimension(37, 32));
        coma.setName("coma"); // NOI18N
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });

        n0.setText("0");
        n0.setName("n0"); // NOI18N
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.setName("igual"); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.setName("suma"); // NOI18N
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.setName("resta"); // NOI18N
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        divicion.setText("/");
        divicion.setName("divicion"); // NOI18N
        divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divicionActionPerformed(evt);
            }
        });

        por.setText("*");
        por.setName("por"); // NOI18N
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        limpiar.setText("clear");
        limpiar.setName("limpiar"); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setToolTipText("");
        pantalla.setName("pantalla"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(n8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pantalla))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1)
                    .addComponent(n3)
                    .addComponent(n2)
                    .addComponent(suma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4)
                    .addComponent(n6)
                    .addComponent(n5)
                    .addComponent(resta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7)
                    .addComponent(n9)
                    .addComponent(n8)
                    .addComponent(por))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual)
                    .addComponent(n0)
                    .addComponent(divicion))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo al pulsar el boton limpiar
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
     teclado(11);  // se llama el metodo teclado asignandole a la variable a el numero 11
    }//GEN-LAST:event_limpiarActionPerformed
    // metodo al pulsar el boton n1
    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
     teclado(1); // se llama el metodo teclado asignandole a la variable a el numero 1
    }//GEN-LAST:event_n1ActionPerformed
    // metodo al pulsar el boton n2
    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
     teclado(2); // se llama el metodo teclado asignandole a la variable a el numero 2
    }//GEN-LAST:event_n2ActionPerformed
    // metodo al pulsar el boton n3
    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
     teclado(3); // se llama el metodo teclado asignandole a la variable a el numero 3
    }//GEN-LAST:event_n3ActionPerformed
    // metodo al pulsar el boton n4
    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
     teclado(4); // se llama el metodo teclado asignandole a la variable a el numero 4
    }//GEN-LAST:event_n4ActionPerformed
    // metodo al pulsar el boton n5
    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
     teclado(5); // se llama el metodo teclado asignandole a la variable a el numero 5
    }//GEN-LAST:event_n5ActionPerformed
    // metodo al pulsar el boton n6
    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
     teclado(6); // se llama el metodo teclado asignandole a la variable a el numero 6
    }//GEN-LAST:event_n6ActionPerformed
    // metodo al pulsar el boton n7
    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
     teclado(7); // se llama el metodo teclado asignandole a la variable a el numero 7
    }//GEN-LAST:event_n7ActionPerformed
    // metodo al pulsar el boton n8
    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
     teclado(8); // se llama el metodo teclado asignandole a la variable a el numero 8
    }//GEN-LAST:event_n8ActionPerformed
    // metodo al pulsar el boton n9
    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
     teclado(9); // se llama el metodo teclado asignandole a la variable a el numero 9
    }//GEN-LAST:event_n9ActionPerformed
    // metodo al pulsar el boton coma
    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
     teclado(10); // se llama el metodo teclado asignandole a la variable a el numero 10
    }//GEN-LAST:event_comaActionPerformed
    // metodo al pulsar el boton n0
    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
     teclado(0); // se llama el metodo teclado asignandole a la variable a el numero 0
    }//GEN-LAST:event_n0ActionPerformed
    // metodo al pulsar el boton suma
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
     oper("+"); // se llama el metodo oper asignandole a la variable a el valor de "+"  
    }//GEN-LAST:event_sumaActionPerformed
    // metodo al pulsar el boton resta
    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
      oper("-"); // se llama el metodo oper asignandole a la variable a el valor de "-"  
    }//GEN-LAST:event_restaActionPerformed
    // metodo al pulsar el boton por
    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
     oper("*"); // se llama el metodo oper asignandole a la variable a el valor de "*"  
    }//GEN-LAST:event_porActionPerformed
    // metodo al pulsar el boton divicion
    private void divicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divicionActionPerformed
     oper("/"); // se llama el metodo oper asignandole a la variable a el valor de "/"  
    }//GEN-LAST:event_divicionActionPerformed

    @SuppressWarnings("UseSpecificCatch")// suprimir la advertencia de catch exception(sin especificar)
    // metodo al pulsar el boton igual
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try { // try - catch para controlar los errores del metodo
        String seleccionar; // se inicializa la variable local seleccionar de tipo string
        numero2 = Double.parseDouble(pantalla.getText()); // se le asigna a la variable numero2 el valor de tipo double de pantalla
        switch (operacion) { //se crea sentencia switch en base al valor de la variable operacion
            case "+": // en caso que operacion sea igual a "+"
                respuesta = numero1 + numero2; // se le asigna a la variable respuesta el valor de la suma entre la variable numero1 con numero2
                seleccionar = String.format("%.0f", respuesta); /* se le asigna la variable seleccionar el valor de respuesta de tipo double convirtiendola
                                                                   a tipo string con el formato "%.0f" que quiere decir valor double sin decimales*/ 
                pantalla.setText(seleccionar); // se imprime el valor de seleccionar
                numero1 = 0.0; // se le asigna a la variable numero1 el valor de 0.0 (tipo double) para evitar la repeticion de la operacion
                break; // sentencia que finaliza la sentencia switch para evitar que se ejecuten las otras variaciones
            case "-": // en caso que operacion sea igual a "-"
                respuesta = numero1 - numero2; // se le asigna a la variable respuesta el valor de la resta entre la variable numero1 con numero2
                seleccionar = String.format("%.0f", respuesta); /* se le asigna la variable seleccionar el valor de respuesta de tipo double convirtiendola
                                                                   a tipo string con el formato "%.0f" que quiere decir valor double sin decimales*/
                pantalla.setText(seleccionar); // se imprime el valor de seleccionar
                numero1 = 0.0; // se le asigna a la variable numero1 el valor de 0.0 (tipo double) para evitar la repeticion de la operacion
                break; // sentencia que finaliza la sentencia switch para evitar que se ejecuten las otras variaciones
            case "*": // en caso que operacion sea igual a "*"
                respuesta = numero1 * numero2; // se le asigna a la variable respuesta el valor de la multiplicacion entre la variable numero1 con numero2
                seleccionar = String.format("%.0f", respuesta); /* se le asigna la variable seleccionar el valor de respuesta de tipo double convirtiendola
                                                                   a tipo string con el formato "%.0f" que quiere decir valor double sin decimales*/
                pantalla.setText(seleccionar); // se imprime el valor de seleccionar
                numero1 = 1.0; // se le asigna a la variable numero1 el valor de 1.0 (tipo double) para evitar la repeticion de la operacion
                break; // sentencia que finaliza la sentencia switch para evitar que se ejecuten las otras variaciones
            case "/": // en caso que operacion sea igual a "/"
                respuesta = numero1 / numero2; // se le asigna a la variable respuesta el valor de la divicion entre la variable numero1 con numero2
                seleccionar = String.format("%.2f", respuesta); /* se le asigna la variable seleccionar el valor de respuesta de tipo double convirtiendola
                                                                   a tipo string con el formato "%.2f" que quiere decir valor double con dos decimales*/
                pantalla.setText(seleccionar); // se imprime el valor de seleccionar
                numero1 = 1.0; // se le asigna a la variable numero1 el valor de 1.0 (tipo double) para evitar la repeticion de la operacion
                break;}} // sentencia que finaliza la sentencia switch para evitar que se ejecuten las otras variaciones
        catch (Exception e){
               String reset;
               reset = pantalla.getText();
               pantalla.setText("");
               pantalla.setText(reset);}
    }//GEN-LAST:event_igualActionPerformed
   
   public static void main(String args[]) { // Metodo main para inicializar la clase calculadora 
        java.awt.EventQueue.invokeLater(() -> { // se llama al metodo invocar
            new calculadora().setVisible(true); // se inicializa la clase calculadora con el metodo mostras ventana en valor true (booleano)
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coma;
    private javax.swing.JButton divicion;
    private javax.swing.JButton igual;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton por;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
} // Fin de la clase calculadora "app"

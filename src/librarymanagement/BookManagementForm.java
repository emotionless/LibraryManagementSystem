/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookManagementForm.java
 *
 * Created on Dec 19, 2012, 1:40:20 AM
 */
package librarymanagement;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import jxl.*;
import jxl.write.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SHAMS
 */
public class BookManagementForm extends JPanel {

    public BookManagementForm() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    public String date() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String d = df.format(new Date()).toString();
        return d;
    }

    public void QRCodeShams(String bt, String afn, String aln, String bked, String sno, String selno) {
        ByteArrayOutputStream out = QRCode.from("Book Title:" + bt + "\nAuthors First Name:" + afn + "\nAuthors Last Name:" + aln + "\nBook Edition:" + bked + "\nSerial No:" + sno + "\nSelf No:" + selno + "\n").to(ImageType.PNG).stream();

        try {
            FileOutputStream fout = new FileOutputStream(new File(
                    "D:\\QR Code\\" + sno +bt+ ".PNG"));

            fout.write(out.toByteArray());

            fout.flush();
            fout.close();
            JOptionPane.showMessageDialog(null, "saved to D:\\QR Code\\...");

        } catch (FileNotFoundException e) {
            // Do Logging
            e.printStackTrace();
        } catch (IOException e) {
            // Do Logging
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("iitPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookmanagement b");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        booktitleLabel = new javax.swing.JLabel();
        authorsfirstnameLabel = new javax.swing.JLabel();
        authorslastnameLabel = new javax.swing.JLabel();
        bookeditionLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        publishedyearLabel = new javax.swing.JLabel();
        catagoryLabel = new javax.swing.JLabel();
        selfnoLabel = new javax.swing.JLabel();
        entrydateLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        identificationnumberLabel = new javax.swing.JLabel();
        serialnoLabel = new javax.swing.JLabel();
        booktitleField = new javax.swing.JTextField();
        authorsfirstnameField = new javax.swing.JTextField();
        authorslastnameField = new javax.swing.JTextField();
        bookeditionField = new javax.swing.JTextField();
        publisherField = new javax.swing.JTextField();
        publishedyearField = new javax.swing.JTextField();
        catagoryField = new javax.swing.JTextField();
        selfnoField = new javax.swing.JTextField();
        entrydateField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        identificationnumberField = new javax.swing.JTextField();
        serialnoField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${booktitle}"));
        columnBinding.setColumnName("Booktitle");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorsfirstname}"));
        columnBinding.setColumnName("Authorsfirstname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorslastname}"));
        columnBinding.setColumnName("Authorslastname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookedition}"));
        columnBinding.setColumnName("Bookedition");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${publisher}"));
        columnBinding.setColumnName("Publisher");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${publishedyear}"));
        columnBinding.setColumnName("Publishedyear");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${catagory}"));
        columnBinding.setColumnName("Catagory");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${selfno}"));
        columnBinding.setColumnName("Selfno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${entrydate}"));
        columnBinding.setColumnName("Entrydate");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${price}"));
        columnBinding.setColumnName("Price");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identificationnumber}"));
        columnBinding.setColumnName("Identificationnumber");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serialno}"));
        columnBinding.setColumnName("Serialno");
        columnBinding.setColumnClass(Long.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(masterTable);

        booktitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        booktitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        booktitleLabel.setText("Booktitle:");

        authorsfirstnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        authorsfirstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorsfirstnameLabel.setText("Authorsfirstname:");

        authorslastnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        authorslastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorslastnameLabel.setText("Authorslastname:");

        bookeditionLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        bookeditionLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookeditionLabel.setText("Bookedition:");

        publisherLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        publisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        publisherLabel.setText("Publisher:");

        publishedyearLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        publishedyearLabel.setForeground(new java.awt.Color(255, 255, 255));
        publishedyearLabel.setText("Publishedyear:");

        catagoryLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        catagoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        catagoryLabel.setText("Catagory:");

        selfnoLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        selfnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        selfnoLabel.setText("Selfno:");

        entrydateLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        entrydateLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrydateLabel.setText("Entrydate:");

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price:");

        identificationnumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        identificationnumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        identificationnumberLabel.setText("Identificationnumber:");

        serialnoLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        serialnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        serialnoLabel.setText("Serialno:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.booktitle}"), booktitleField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), booktitleField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.authorsfirstname}"), authorsfirstnameField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), authorsfirstnameField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.authorslastname}"), authorslastnameField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), authorslastnameField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bookedition}"), bookeditionField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), bookeditionField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.publisher}"), publisherField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), publisherField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.publishedyear}"), publishedyearField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), publishedyearField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.catagory}"), catagoryField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), catagoryField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.selfno}"), selfnoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), selfnoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.entrydate}"), entrydateField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), entrydateField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        entrydateField.addMouseListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.price}"), priceField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), priceField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.identificationnumber}"), identificationnumberField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), identificationnumberField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.serialno}"), serialnoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), serialnoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        saveButton.setText("Save");
        saveButton.addActionListener(formListener);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);

        newButton.setText("New");
        newButton.addActionListener(formListener);

        deleteButton.setText("Delete");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);

        jButton1.setText("Genarate QR Code");
        jButton1.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booktitleLabel)
                            .addComponent(authorsfirstnameLabel)
                            .addComponent(authorslastnameLabel)
                            .addComponent(bookeditionLabel)
                            .addComponent(publisherLabel)
                            .addComponent(publishedyearLabel)
                            .addComponent(catagoryLabel)
                            .addComponent(selfnoLabel)
                            .addComponent(entrydateLabel)
                            .addComponent(priceLabel)
                            .addComponent(identificationnumberLabel)
                            .addComponent(serialnoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booktitleField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(authorsfirstnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(authorslastnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(bookeditionField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(publisherField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(publishedyearField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(catagoryField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(selfnoField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(entrydateField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(priceField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(identificationnumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                            .addComponent(serialnoField, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, newButton, refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booktitleLabel)
                    .addComponent(booktitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorsfirstnameLabel)
                    .addComponent(authorsfirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorslastnameLabel)
                    .addComponent(authorslastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookeditionLabel)
                    .addComponent(bookeditionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publisherLabel)
                    .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publishedyearLabel)
                    .addComponent(publishedyearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagoryLabel)
                    .addComponent(catagoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selfnoLabel)
                    .addComponent(selfnoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrydateLabel)
                    .addComponent(entrydateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificationnumberLabel)
                    .addComponent(identificationnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnoLabel)
                    .addComponent(serialnoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(refreshButton)
                    .addComponent(deleteButton)
                    .addComponent(newButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                BookManagementForm.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                BookManagementForm.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                BookManagementForm.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                BookManagementForm.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                BookManagementForm.this.jButton1ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == entrydateField) {
                BookManagementForm.this.entrydateFieldMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<librarymanagement.Bookmanagement> toRemove = new ArrayList<librarymanagement.Bookmanagement>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            librarymanagement.Bookmanagement b = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(b);
            entityManager.remove(b);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        librarymanagement.Bookmanagement b = new librarymanagement.Bookmanagement();
        entityManager.persist(b);
        list.add(b);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<librarymanagement.Bookmanagement> merged = new ArrayList<librarymanagement.Bookmanagement>(list.size());
            for (librarymanagement.Bookmanagement b : list) {
                merged.add(entityManager.merge(b));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 QRCodeShams(booktitleField.getText(), authorsfirstnameField.getText(), authorslastnameField.getText(), bookeditionField.getText(), serialnoField.getText(), selfnoField.getText());

    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void entrydateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrydateFieldMouseClicked
entrydateField.setText(date());
    // TODO add your handling code here:
}//GEN-LAST:event_entrydateFieldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorsfirstnameField;
    private javax.swing.JLabel authorsfirstnameLabel;
    private javax.swing.JTextField authorslastnameField;
    private javax.swing.JLabel authorslastnameLabel;
    private javax.swing.JTextField bookeditionField;
    private javax.swing.JLabel bookeditionLabel;
    private javax.swing.JTextField booktitleField;
    private javax.swing.JLabel booktitleLabel;
    private javax.swing.JTextField catagoryField;
    private javax.swing.JLabel catagoryLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField entrydateField;
    private javax.swing.JLabel entrydateLabel;
    private javax.swing.JTextField identificationnumberField;
    private javax.swing.JLabel identificationnumberLabel;
    private javax.swing.JButton jButton1;
    private java.util.List<librarymanagement.Bookmanagement> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField publishedyearField;
    private javax.swing.JLabel publishedyearLabel;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel publisherLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField selfnoField;
    private javax.swing.JLabel selfnoLabel;
    private javax.swing.JTextField serialnoField;
    private javax.swing.JLabel serialnoLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(BookManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new BookManagementForm());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
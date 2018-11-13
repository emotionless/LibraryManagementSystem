/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookDistributionForm.java
 *
 * Created on Dec 19, 2012, 7:19:31 PM
 */
package librarymanagement;

import java.awt.EventQueue;
import java.beans.Beans;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Calendar;

/**
 *
 * @author SHAMS
 */
public class BookDistributionForm extends JPanel {

    public BookDistributionForm() {
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

    public String returnDate() {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DATE, 21);
        String d1 = now.get(Calendar.DATE) + "-" + now.get(Calendar.MONTH) +1+ "-" + now.get(Calendar.YEAR);
        return d1;
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookdistribution b");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        booktitleLabel = new javax.swing.JLabel();
        authorsfirstnameLabel = new javax.swing.JLabel();
        authorslastnameLabel = new javax.swing.JLabel();
        bookeditionLabel = new javax.swing.JLabel();
        identificationnumberLabel = new javax.swing.JLabel();
        serialnoLabel = new javax.swing.JLabel();
        studentnameLabel = new javax.swing.JLabel();
        studentidnumberLabel = new javax.swing.JLabel();
        dateofissueLabel = new javax.swing.JLabel();
        datetoreturnLabel = new javax.swing.JLabel();
        catagoryLabel = new javax.swing.JLabel();
        booktitleField = new javax.swing.JTextField();
        authorsfirstnameField = new javax.swing.JTextField();
        authorslastnameField = new javax.swing.JTextField();
        bookeditionField = new javax.swing.JTextField();
        identificationnumberField = new javax.swing.JTextField();
        serialnoField = new javax.swing.JTextField();
        studentnameField = new javax.swing.JTextField();
        studentidnumberField = new javax.swing.JTextField();
        dateofissueField = new javax.swing.JTextField();
        datetoreturnField = new javax.swing.JTextField();
        catagoryField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setBackground(new java.awt.Color(0, 51, 51));

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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identificationnumber}"));
        columnBinding.setColumnName("Identificationnumber");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serialno}"));
        columnBinding.setColumnName("Serialno");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentname}"));
        columnBinding.setColumnName("Studentname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentidnumber}"));
        columnBinding.setColumnName("Studentidnumber");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dateofissue}"));
        columnBinding.setColumnName("Dateofissue");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datetoreturn}"));
        columnBinding.setColumnName("Datetoreturn");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${catagory}"));
        columnBinding.setColumnName("Catagory");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(masterTable);

        booktitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        booktitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        booktitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        booktitleLabel.setText("Booktitle:");

        authorsfirstnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        authorsfirstnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        authorsfirstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorsfirstnameLabel.setText("Authorsfirstname:");

        authorslastnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        authorslastnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        authorslastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorslastnameLabel.setText("Authorslastname:");

        bookeditionLabel.setBackground(new java.awt.Color(255, 255, 255));
        bookeditionLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        bookeditionLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookeditionLabel.setText("Bookedition:");

        identificationnumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        identificationnumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        identificationnumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        identificationnumberLabel.setText("Identificationnumber:");

        serialnoLabel.setBackground(new java.awt.Color(255, 255, 255));
        serialnoLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        serialnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        serialnoLabel.setText("Serialno:");

        studentnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        studentnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        studentnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentnameLabel.setText("Studentname:");

        studentidnumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        studentidnumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        studentidnumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentidnumberLabel.setText("Studentidnumber:");

        dateofissueLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateofissueLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        dateofissueLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateofissueLabel.setText("Dateofissue:");

        datetoreturnLabel.setBackground(new java.awt.Color(255, 255, 255));
        datetoreturnLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        datetoreturnLabel.setForeground(new java.awt.Color(255, 255, 255));
        datetoreturnLabel.setText("Datetoreturn:");

        catagoryLabel.setBackground(new java.awt.Color(255, 255, 255));
        catagoryLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        catagoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        catagoryLabel.setText("Catagory:");

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

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.studentname}"), studentnameField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), studentnameField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.studentidnumber}"), studentidnumberField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), studentidnumberField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dateofissue}"), dateofissueField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), dateofissueField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        dateofissueField.addMouseListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.datetoreturn}"), datetoreturnField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), datetoreturnField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        datetoreturnField.addMouseListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.catagory}"), catagoryField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), catagoryField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
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

        jButton1.setText("Read QR Code");
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
                            .addComponent(identificationnumberLabel)
                            .addComponent(serialnoLabel)
                            .addComponent(studentnameLabel)
                            .addComponent(studentidnumberLabel)
                            .addComponent(dateofissueLabel)
                            .addComponent(datetoreturnLabel)
                            .addComponent(catagoryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booktitleField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(authorsfirstnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(authorslastnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(bookeditionField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(identificationnumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(serialnoField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(studentnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(studentidnumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(dateofissueField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(datetoreturnField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                            .addComponent(catagoryField, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, newButton, refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
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
                    .addComponent(identificationnumberLabel)
                    .addComponent(identificationnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnoLabel)
                    .addComponent(serialnoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentnameLabel)
                    .addComponent(studentnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentidnumberLabel)
                    .addComponent(studentidnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateofissueLabel)
                    .addComponent(dateofissueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datetoreturnLabel)
                    .addComponent(datetoreturnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagoryLabel)
                    .addComponent(catagoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(refreshButton)
                    .addComponent(deleteButton)
                    .addComponent(newButton)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                BookDistributionForm.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                BookDistributionForm.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                BookDistributionForm.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                BookDistributionForm.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                BookDistributionForm.this.jButton1ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == dateofissueField) {
                BookDistributionForm.this.dateofissueFieldMouseClicked(evt);
            }
            else if (evt.getSource() == datetoreturnField) {
                BookDistributionForm.this.datetoreturnFieldMouseClicked(evt);
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
        List<librarymanagement.Bookdistribution> toRemove = new ArrayList<librarymanagement.Bookdistribution>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            librarymanagement.Bookdistribution b = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(b);
            entityManager.remove(b);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        librarymanagement.Bookdistribution b = new librarymanagement.Bookdistribution();
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
            List<librarymanagement.Bookdistribution> merged = new ArrayList<librarymanagement.Bookdistribution>(list.size());
            for (librarymanagement.Bookdistribution b : list) {
                merged.add(entityManager.merge(b));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

private void dateofissueFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateofissueFieldMouseClicked
dateofissueField.setText(date());
    // TODO add your handling code here:
}//GEN-LAST:event_dateofissueFieldMouseClicked

private void datetoreturnFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datetoreturnFieldMouseClicked
datetoreturnField.setText(returnDate());
    // TODO add your handling code here:
}//GEN-LAST:event_datetoreturnFieldMouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Chose c=new Chose();
c.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField dateofissueField;
    private javax.swing.JLabel dateofissueLabel;
    private javax.swing.JTextField datetoreturnField;
    private javax.swing.JLabel datetoreturnLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField identificationnumberField;
    private javax.swing.JLabel identificationnumberLabel;
    private javax.swing.JButton jButton1;
    private java.util.List<librarymanagement.Bookdistribution> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField serialnoField;
    private javax.swing.JLabel serialnoLabel;
    private javax.swing.JTextField studentidnumberField;
    private javax.swing.JLabel studentidnumberLabel;
    private javax.swing.JTextField studentnameField;
    private javax.swing.JLabel studentnameLabel;
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
            java.util.logging.Logger.getLogger(BookDistributionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDistributionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDistributionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDistributionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new BookDistributionForm());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
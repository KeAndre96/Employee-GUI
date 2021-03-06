import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr. Graham
 */
public class Company_Employee extends javax.swing.JFrame {
    private Company company;
    private String name;
    private String department;
    private int hours;
    private double salary;
    private double yearlySalary;
    private Employee emp;
    /**
     * Creates new form Company_Employee
     */
    public Company_Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CompanyInfoPanel = new javax.swing.JPanel();
        CompanyLabel = new javax.swing.JLabel();
        CompanyTextField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        StateLabel = new javax.swing.JLabel();
        StateComboBox = new javax.swing.JComboBox<>();
        ZipCodeLabel = new javax.swing.JLabel();
        ZipCodeTextField = new javax.swing.JTextField();
        CompanySubmit = new javax.swing.JButton();
        EmployeeInfoPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        DepartmentLabel = new javax.swing.JLabel();
        DepartmentTextField = new javax.swing.JTextField();
        PayRateLabel = new javax.swing.JLabel();
        HourlyButton = new javax.swing.JRadioButton();
        SalariedButton = new javax.swing.JRadioButton();
        YearlySalaryLabel = new javax.swing.JLabel();
        YearlyTextField = new javax.swing.JTextField();
        HourlyRatesLabel = new javax.swing.JLabel();
        HourlyTextField = new javax.swing.JTextField();
        HoursWorkedLabel = new javax.swing.JLabel();
        EmployeeSubmit = new javax.swing.JButton();
        HoursSpinner = new javax.swing.JSpinner();
        DisplayPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTextArea = new javax.swing.JTextArea();
        ViewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CompanyLabel.setText("Enter name of Company: ");

        AddressLabel.setText("Enter Street Address:");

        CityLabel.setText("Enter City:");

        StateLabel.setText("Pick a State:");

        StateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL ", "AK", "AZ", "AR", "CA ", "CO ", "CT ", "DE ", "FL", "GA ", "HI ", "ID", "IL ", "IN ", "IA ", "KS ", "KY ", "LA", "ME ", "MD ", "MA ", "MI ", "MN ", "MS ", "MO", "MT", "NE ", "NV ", "NH ", "NJ ", "NM ", "NY ", "NC ", "ND", "OH ", "OK ", "OR ", "PA ", "RI", "SC ", "SD ", "TN ", "TX ", "UT", "VT ", "VA ", "WA", "WV ", "WI ", "WY" }));
        StateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateComboBoxActionPerformed(evt);
            }
        });

        ZipCodeLabel.setText("Enter Zip/Postal Code:");

        ZipCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipCodeTextFieldActionPerformed(evt);
            }
        });

        CompanySubmit.setText("Submit");
        CompanySubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanySubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CompanyInfoPanelLayout = new javax.swing.GroupLayout(CompanyInfoPanel);
        CompanyInfoPanel.setLayout(CompanyInfoPanelLayout);
        CompanyInfoPanelLayout.setHorizontalGroup(
            CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(CompanyInfoPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CompanyInfoPanelLayout.createSequentialGroup()
                                    .addGroup(CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CompanyTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddressTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                                    .addComponent(CompanyLabel)
                                    .addGap(73, 73, 73)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                                .addComponent(AddressLabel)
                                .addGap(87, 87, 87)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                            .addComponent(CityLabel)
                            .addGap(114, 114, 114)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                        .addGroup(CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StateLabel)
                            .addGroup(CompanyInfoPanelLayout.createSequentialGroup()
                                .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                        .addComponent(ZipCodeLabel)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                        .addComponent(CompanySubmit)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompanyInfoPanelLayout.createSequentialGroup()
                        .addComponent(ZipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        CompanyInfoPanelLayout.setVerticalGroup(
            CompanyInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompanyInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CompanyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StateLabel)
                .addGap(18, 18, 18)
                .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ZipCodeLabel)
                .addGap(31, 31, 31)
                .addComponent(ZipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(CompanySubmit)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        NameLabel.setText("Enter your first & last name: ");

        NameTextField.setEnabled(false);

        DepartmentLabel.setText("Enter the department you work in:");

        DepartmentTextField.setEnabled(false);

        PayRateLabel.setText("Choose your Pay Rate:");

        buttonGroup1.add(HourlyButton);
        HourlyButton.setText("Hourly");
        HourlyButton.setEnabled(false);
        HourlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourlyButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(SalariedButton);
        SalariedButton.setText("Salaried");
        SalariedButton.setEnabled(false);
        SalariedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalariedButtonActionPerformed(evt);
            }
        });

        YearlySalaryLabel.setText("Yearly Salary: $");

        YearlyTextField.setEnabled(false);

        HourlyRatesLabel.setText("Hourly Rate:  $");

        HourlyTextField.setEnabled(false);

        HoursWorkedLabel.setText("Hours Worked");

        EmployeeSubmit.setText("Submit");
        EmployeeSubmit.setEnabled(false);
        EmployeeSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSubmitActionPerformed(evt);
            }
        });

        HoursSpinner.setEnabled(false);

        javax.swing.GroupLayout EmployeeInfoPanelLayout = new javax.swing.GroupLayout(EmployeeInfoPanel);
        EmployeeInfoPanel.setLayout(EmployeeInfoPanelLayout);
        EmployeeInfoPanelLayout.setHorizontalGroup(
            EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoPanelLayout.createSequentialGroup()
                        .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(YearlySalaryLabel)
                                    .addComponent(HourlyRatesLabel)
                                    .addComponent(HoursWorkedLabel))
                                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmployeeSubmit)
                                            .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(HourlyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                .addComponent(YearlyTextField))))
                                    .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(HoursSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoPanelLayout.createSequentialGroup()
                        .addComponent(DepartmentLabel)
                        .addGap(81, 81, 81))))
            .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(PayRateLabel))
                    .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalariedButton)
                            .addComponent(HourlyButton))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NameLabel)
                .addGap(98, 98, 98))
        );
        EmployeeInfoPanelLayout.setVerticalGroup(
            EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameLabel)
                .addGap(18, 18, 18)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(DepartmentLabel)
                .addGap(18, 18, 18)
                .addComponent(DepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PayRateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HourlyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalariedButton)
                .addGap(29, 29, 29)
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearlySalaryLabel)
                    .addComponent(YearlyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourlyRatesLabel)
                    .addComponent(HourlyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoursWorkedLabel)
                    .addComponent(HoursSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(EmployeeSubmit)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        DisplayTextArea.setEditable(false);
        DisplayTextArea.setColumns(20);
        DisplayTextArea.setRows(5);
        DisplayTextArea.setEnabled(false);
        jScrollPane1.setViewportView(DisplayTextArea);

        ViewButton.setText("View Employee Info");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayPanelLayout.createSequentialGroup()
                        .addComponent(ViewButton)
                        .addGap(86, 86, 86))))
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ViewButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CompanyInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CompanyInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EmployeeInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ZipCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void HourlyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        YearlyTextField.setEnabled(false);
        HourlyTextField.setEnabled(true);
        HoursSpinner.setEnabled(true);
    }                                            

    private void CompanySubmitActionPerformed(java.awt.event.ActionEvent evt) {                                              
        CompanySubmit.setEnabled(false);
        EmployeeSubmit.setEnabled(true);
        
        String CompName = CompanyTextField.getText();
        String Street = AddressTextField.getText();
        String City = CityTextField.getText();
        String State = (String) StateComboBox.getSelectedItem();
        String ZipCode = ZipCodeTextField.getText();
        company = new Company(CompName, new Address(Street, City, State, ZipCode));
        
        CompanyTextField.setEnabled(false);
        AddressTextField.setEnabled(false);
        CityTextField.setEnabled(false);
        StateComboBox.setEnabled(false);
        ZipCodeTextField.setEnabled(false);
        
        NameTextField.setEnabled(true);
        DepartmentTextField.setEnabled(true);
        HourlyButton.setEnabled(true);
        SalariedButton.setEnabled(true);
        YearlyTextField.setEnabled(true);
        HourlyTextField.setEnabled(true);
        HoursSpinner.setEnabled(true);
        
    }                                             

    private void StateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void EmployeeSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                               
       name = NameTextField.getText();
       department = DepartmentTextField.getText();
       String num1 = YearlyTextField.getText();
       if(!num1.isEmpty())
       {
            yearlySalary = Double.parseDouble(num1);
       }
       String num2 = HourlyTextField.getText();
       if(!num2.isEmpty())
       {
            salary = Double.parseDouble(num2);
            hours = (Integer) HoursSpinner.getValue();
       }
    try 
    {    if(HourlyButton.isSelected())
        {
           emp = new HourlyEmployee(name, department, salary, hours);
        }
        else
        {
           emp = new SalariedEmployee(name, department, yearlySalary);
        }
    }
    catch(InputException ede)
    {
        JOptionPane.showMessageDialog(null, ede.getMessage());
    }
    company.addEmployee(emp);
    try
    {    
        company.addEmployeeFile();
    }
    catch(IOException nbe)
    {
        JOptionPane.showMessageDialog(null, nbe.getMessage());
    }
            resetForm();
    }                                              
    private void resetForm()
    {
        NameTextField.setText("");
        DepartmentTextField.setText("");
        buttonGroup1.clearSelection();
        YearlyTextField.setText("");
        HourlyTextField.setText("");
        HoursSpinner.setValue(0);
        HourlyTextField.setEnabled(true);
        HoursSpinner.setEnabled(true);
        YearlyTextField.setEnabled(true);
        
    }
    private void SalariedButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        HourlyTextField.setEnabled(false);
        HoursSpinner.setEnabled(false);
        YearlyTextField.setEnabled(true);
    }                                              

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        DisplayTextArea.setText("");
        try
        {
            File inFile = new File("employee_info.txt");
            Scanner reader = new Scanner(inFile);
            if(inFile.exists())
            {
                while(reader.hasNext())
                {
                    String line = reader.nextLine();
                    DisplayTextArea.append(line + "\n");
                }
            }
            else
            {
                System.out.print("File does not exist");
            }
            reader.close();
        }
        catch(FileNotFoundException nbe)
        {
            JOptionPane.showMessageDialog(null, nbe.getMessage());
        }
    }                                          

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
            java.util.logging.Logger.getLogger(Company_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JPanel CompanyInfoPanel;
    private javax.swing.JLabel CompanyLabel;
    private javax.swing.JButton CompanySubmit;
    private javax.swing.JTextField CompanyTextField;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JTextField DepartmentTextField;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JTextArea DisplayTextArea;
    private javax.swing.JPanel EmployeeInfoPanel;
    private javax.swing.JButton EmployeeSubmit;
    private javax.swing.JRadioButton HourlyButton;
    private javax.swing.JLabel HourlyRatesLabel;
    private javax.swing.JTextField HourlyTextField;
    private javax.swing.JSpinner HoursSpinner;
    private javax.swing.JLabel HoursWorkedLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PayRateLabel;
    private javax.swing.JRadioButton SalariedButton;
    private javax.swing.JComboBox<String> StateComboBox;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel YearlySalaryLabel;
    private javax.swing.JTextField YearlyTextField;
    private javax.swing.JLabel ZipCodeLabel;
    private javax.swing.JTextField ZipCodeTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
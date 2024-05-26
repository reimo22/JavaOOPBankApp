package BankSys;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Registration {
    private JFrame frmRegistration;
    private JTextField firstNameField;
    private JTextField middleNameField;
    private JTextField lastNameField;
    private JTextField birthdateField;
    private JTextField genderField;
    private JTextField addressField;
    private JTextField fatherNameField;
    private JTextField motherNameField;
    private JTextField contactNoField;
    private JTextField emailField;

    public Registration() {
        createView();
    }

    private void createView() {
        frmRegistration = new JFrame("Banking with us! Sign up for an account");
        frmRegistration.setTitle("Registration");
        frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRegistration.setSize(675, 675);
        frmRegistration.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 240));
        panel.setLayout(null);

        JLabel label_3 = new JLabel("First Name:");
        label_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_3.setBounds(50, 130, 106, 15);
        panel.add(label_3);
        firstNameField = new JTextField();
        firstNameField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        firstNameField.setOpaque(false);
        firstNameField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
        firstNameField.setBounds(175, 160, 435, 30);
        panel.add(firstNameField);

        JLabel label_4 = new JLabel("Middle Name:");
        label_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_4.setBounds(50, 170, 98, 15);
        panel.add(label_4);
        middleNameField = new JTextField();
        middleNameField.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        middleNameField.setOpaque(false);
        middleNameField.setBounds(175, 120, 435, 30);
        panel.add(middleNameField);

        JLabel label_5 = new JLabel("Last Name:");
        label_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_5.setBounds(50, 210, 90, 15);
        panel.add(label_5);
        lastNameField = new JTextField();
        lastNameField.setOpaque(false);
        lastNameField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        lastNameField.setBounds(175, 200, 435, 30);
        panel.add(lastNameField);

        JLabel label_6 = new JLabel("Birthdate:");
        label_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_6.setBounds(50, 290, 106, 15);
        panel.add(label_6);
        birthdateField = new JTextField();
        birthdateField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        birthdateField.setOpaque(false);
        birthdateField.setBounds(175, 280, 435, 30);
        panel.add(birthdateField);

        JLabel label_7 = new JLabel("Gender:");
        label_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_7.setBounds(50, 250, 67, 14);
        panel.add(label_7);
        genderField = new JTextField();
        genderField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        genderField.setOpaque(false);
        genderField.setBounds(175, 240, 435, 30);
        panel.add(genderField);

        JLabel label_8 = new JLabel("Address:");
        label_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_8.setBounds(50, 370, 90, 15);
        panel.add(label_8);
        addressField = new JTextField();
        addressField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        addressField.setOpaque(false);
        addressField.setBounds(175, 360, 435, 30);
        panel.add(addressField);

        JLabel label_9 = new JLabel("Father Name:");
        label_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_9.setBounds(50, 490, 106, 15);
        panel.add(label_9);
        fatherNameField = new JTextField();
        fatherNameField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        fatherNameField.setOpaque(false);
        fatherNameField.setBounds(175, 480, 435, 30);
        panel.add(fatherNameField);

        JLabel label_10 = new JLabel("Mother Name:");
        label_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_10.setBounds(50, 447, 106, 20);
        panel.add(label_10);
        motherNameField = new JTextField();
        motherNameField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        motherNameField.setOpaque(false);
        motherNameField.setBounds(175, 440, 435, 30);
        panel.add(motherNameField);

        JLabel label_11 = new JLabel("Contact No:");
        label_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_11.setBounds(50, 330, 98, 15);
        panel.add(label_11);
        contactNoField = new JTextField();
        contactNoField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contactNoField.setOpaque(false);
        contactNoField.setBounds(175, 320, 435, 30);
        panel.add(contactNoField);

        JLabel label_12 = new JLabel("Email address:");
        label_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
        label_12.setBounds(50, 409, 106, 15);
        panel.add(label_12);
        emailField = new JTextField();
        emailField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        emailField.setOpaque(false);
        emailField.setBounds(175, 400, 435, 28);
        panel.add(emailField);
        JLabel label_13 = new JLabel();
        label_13.setBounds(193, 430, 188, 28);
        panel.add(label_13); // Empty label to fill the grid

        // Add the panel to a scroll pane
        JScrollPane scrollPane = new JScrollPane(panel);
                
                        JButton nextpagebtn = new JButton("Next");
                        nextpagebtn.setBounds(512, 544, 98, 34);
                        panel.add(nextpagebtn);
                        nextpagebtn.setBorderPainted(false);
                        nextpagebtn.setBackground(new Color(220, 220, 220));
                        nextpagebtn.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
                        
                        JPanel panel_1 = new JPanel();
                        panel_1.setBackground(new Color(128, 128, 128));
                        panel_1.setBounds(0, 0, 657, 82);
                        panel.add(panel_1);
                        panel_1.setLayout(null);
                        
                        JLabel lblNewLabel = new JLabel("Registration");
                        lblNewLabel.setBounds(10, 23, 201, 48);
                        panel_1.add(lblNewLabel);
                        lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 30));
                        
                        JPanel panel_2 = new JPanel();
                        panel_2.setBackground(new Color(255, 218, 185));
                        panel_2.setBounds(0, 0, 165, 634);
                        panel.add(panel_2);
                
                        // Add ActionListener for the sign-up button
                        nextpagebtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String username = usernameField.getText();
                                String password = new String(passwordField.getPassword());
                                String pinCode = pinCodeField.getText();
                                String firstName = firstNameField.getText();
                                String middleName = middleNameField.getText();
                                String lastName = lastNameField.getText();
                                String birthdate = birthdateField.getText();
                                String gender = genderField.getText();
                                String address = addressField.getText();
                                String fatherName = fatherNameField.getText();
                                String motherName = motherNameField.getText();
                                String contactNo = contactNoField.getText();
                                String email = emailField.getText();
                
                                // Validate the input here
                
                                JOptionPane.showMessageDialog(frmRegistration, "Thank you for signing up, " + firstName + "!");
                                frmRegistration.dispose();
                            }
                        });
        frmRegistration.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frmRegistration.setVisible(true);
    }

    public static void main(String[] args) {
        new Registration();
    }
}

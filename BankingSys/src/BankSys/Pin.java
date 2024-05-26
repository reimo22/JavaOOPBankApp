package BankSys;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class Pin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField pinField;
    private JPasswordField confirmPinField;
    private JButton confirmButton;
    private PinListener pinListener;

    // Add a listener interface
    public interface PinListener {
        void pinConfirmed(String pin);
    }
    
    public void setPinListener(PinListener listener) {
        this.pinListener = listener;
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pin frame = new Pin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Pin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 675, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 139, 139));
        panel.setBounds(103, 96, 476, 372);
        contentPane.add(panel);
        panel.setLayout(null);

        // Initialize components
        JLabel enterPinLabel = new JLabel("Enter 4-Digit PIN");
        enterPinLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
        enterPinLabel.setBounds(166, 63, 164, 20);
        panel.add(enterPinLabel);

        pinField = new JPasswordField(10);
        pinField.setBounds(125, 94, 205, 25);
        ((AbstractDocument) pinField.getDocument()).setDocumentFilter(new PinDocumentFilter());
        panel.add(pinField);

        JLabel confirmPinLabel = new JLabel("Confirm 4-Digit PIN");
        confirmPinLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
        confirmPinLabel.setBounds(154, 177, 164, 40);
        panel.add(confirmPinLabel);

        confirmPinField = new JPasswordField(10);
        confirmPinField.setBounds(125, 214, 205, 25);
        ((AbstractDocument) confirmPinField.getDocument()).setDocumentFilter(new PinDocumentFilter());
        panel.add(confirmPinField);

        confirmButton = new JButton("Confirm ");
        confirmButton.setBounds(184, 312, 100, 25);
        panel.add(confirmButton);

        // Add action listener to the button
        confirmButton.addActionListener(new ConfirmButtonListener());
    }

    /*private class ConfirmButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String pin = new String(pinField.getPassword());
            String confirmPin = new String(confirmPinField.getPassword());

            if (pin.length() != 4 || confirmPin.length() != 4) {
                JOptionPane.showMessageDialog(Pin.this, "PIN must be 4 digits.");
                return;
            }

            if (pin.equals(confirmPin)) {
                // Proceed to the dashboard
                JOptionPane.showMessageDialog(Pin.this, "PIN confirmed. Proceeding to dashboard.");
                // insert code here

                dispose(); // Close the current frame
            } else {
                JOptionPane.showMessageDialog(Pin.this, "PINs do not match. Please try again.");
            }
        }
    }*/
    private class ConfirmButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String pin = new String(pinField.getPassword());
            String confirmPin = new String(confirmPinField.getPassword());

            if (pin.length() != 4 || confirmPin.length() != 4) {
                JOptionPane.showMessageDialog(Pin.this, "PIN must be 4 digits.");
                return;
            }

            if (pin.equals(confirmPin)) {
                // Notify the listener if it's set
                if (pinListener != null) {
                    pinListener.pinConfirmed(pin);
                }

                dispose(); // Close the current frame
            } else {
                JOptionPane.showMessageDialog(Pin.this, "PINs do not match. Please try again.");
            }
        }
    }

    private class PinDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (isNumeric(string) && (fb.getDocument().getLength() + string.length()) <= 4) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isNumeric(text) && (fb.getDocument().getLength() - length + text.length()) <= 4) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            super.remove(fb, offset, length);
        }

        private boolean isNumeric(String str) {
            return str.matches("\\d*");
        }
    }
}
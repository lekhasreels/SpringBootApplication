package com.userlogin.CreatingSpringBootSearchAppByUsingV3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class UserSearchApp extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField searchField;
    private JButton searchButton;
    private JTextArea resultTextArea;

    public UserSearchApp() {
        setTitle("User Search");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        resultTextArea = new JTextArea(10, 30);

        panel.add(new JLabel("Enter Username or Street Name:"));
        panel.add(searchField);
        panel.add(searchButton);

        searchButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);
    }
    private void performSearch() {
        @SuppressWarnings("unused")
		String searchQuery = searchField.getText();
        // Call the REST API to search users by username or street name
        // Parse the response and display it in the resultTextArea
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserSearchApp().setVisible(true);
            }
        });
    }
}

package VistaGrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class VistaForm extends JFrame {
  private JPanel content;
  private JTextField textUsuario;
  private JButton btnIniciar;

  public VistaForm (String label) {
    content = new JPanel();
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    //setBounds(100, 100, 247, 109);
    setSize(600, 300);
    setResizable(false);
    setLocationRelativeTo(null);
    content.setBorder(new EmptyBorder(15, 15, 15, 15));
    JLabel lblUsuario = new JLabel(label);
    content.add(lblUsuario);
    
    textUsuario = new JTextField();
    content.add(textUsuario);
    textUsuario.setColumns(10);
    textUsuario.setBorder(new EmptyBorder(15, 15, 15, 15));
    
    btnIniciar = new JButton("Iniciar");
    content.add(btnIniciar);
    
    setContentPane(content);
  }

  public void onClickIniciar (ActionListener action) {
    this.btnIniciar.addActionListener(action);
    SwingUtilities.getRootPane(btnIniciar).setDefaultButton(btnIniciar);
  }

  public String getNombreUsuario () {
    return this.textUsuario.getText();
  }
}

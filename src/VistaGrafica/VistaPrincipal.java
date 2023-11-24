package VistaGrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import modelo.Nota;

public class VistaPrincipal extends JFrame {
  JPanel content;
  JPanel notas;
  JButton btnAgregar;
  
  public VistaPrincipal () {
    content = new JPanel();
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    //setBounds(100, 100, 247, 109);
    setSize(500, 500);
    setResizable(false);
    setLocationRelativeTo(null);
    content.setBorder(new EmptyBorder(15, 15, 15, 15));
    JLabel lblUsuario = new JLabel("Notas");
    content.add(lblUsuario);
    
    notas = new JPanel();
    notas.setLayout(new BoxLayout(notas, BoxLayout.Y_AXIS));
    notas.setSize(300, 500);
    notas.setVisible(true);

    content.add(notas);

    btnAgregar = new JButton("Nueva nota");
    btnAgregar.setSize(100, 100);
    content.add(btnAgregar);
    
    setContentPane(content);
  }

  public void onClickAgregar (ActionListener action) {
    this.btnAgregar.addActionListener(action);
  }

  public void actualizar (Object valor) {
    notas.add(generarNota((Nota) valor));
    notas.revalidate();
    notas.repaint();
  }

  public JPanel generarNota (Nota nota) {
    JPanel notaPanel = new JPanel();
    notaPanel.setVisible(true);
    notaPanel.setSize(10, 10);
    notaPanel.add(new JLabel(nota.getCreacion() + " " + nota.getUsuario().getNombre() + ":" + nota.getDescripcion()));
    return notaPanel;
  }
}

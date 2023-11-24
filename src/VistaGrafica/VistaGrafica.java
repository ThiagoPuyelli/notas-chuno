package VistaGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.Controlador;

public class VistaGrafica implements IVista {
  VistaPrincipal principal = new VistaPrincipal();
  VistaForm login = new VistaForm("Usuario");
  VistaForm nota = new VistaForm("Contenido de nota");
  Controlador controlador;

  public VistaGrafica (Controlador controlador) {
    this.controlador = controlador;
    controlador.setVista(this);
    iniciarLogin();

    login.onClickIniciar(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
				controlador.conectarUsuario(login.getNombreUsuario());
				iniciarPrincipal();
			}
    });
  }

  public void iniciarLogin () {
    login.setVisible(true);
    principal.setVisible(false);
  }

  public void iniciarPrincipal () {
    login.setVisible(false);
    principal.setVisible(true);
  }

  public void iniciarNota () {
    nota.setVisible(true);
  }

  public void cerrarNota () {
    nota.setVisible(false);
  }

  public void actualizar (Object valor) {
    principal.actualizar(valor);
  }
}

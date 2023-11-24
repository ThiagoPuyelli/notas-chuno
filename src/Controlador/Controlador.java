package Controlador;

import java.time.LocalDate;

import VistaGrafica.IVista;
import VistaGrafica.VistaGrafica;
import modelo.IObserver;
import modelo.IUsuario;
import modelo.Nota;
import modelo.Tablero;
import modelo.Usuario;

public class Controlador implements IObserver {
  Tablero tablero;
  IVista vista;
  IUsuario usuario;
  
  public Controlador (Tablero tablero) {
    this.tablero = tablero;
  }

  public void setVista(IVista vista) {
    this.vista = vista;
  }

  public void setUsuario (IUsuario usuario) {
    this.usuario = usuario;
  }

  public void conectarUsuario (String nombre) {
    this.usuario = (IUsuario) tablero.conectarUsuario(nombre, this);
  }

  public void actualizar (Object valor) {
    vista.actualizar(valor);
  }
}

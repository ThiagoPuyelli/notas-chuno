package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Tablero {
  private HashMap<Integer, Usuario> usuarios = new HashMap<>();
  private ArrayList<Nota> notas = new ArrayList<>();
  private ArrayList<IObserver> observadores = new ArrayList<>();
  

  public Usuario conectarUsuario (String nombre, IObserver observer) {
    Usuario usuario = buscarUsuario(nombre);
    if (usuario != null) {
      return usuario;
    }
    Usuario newUsuario = new Usuario(nombre);
    usuarios.put(newUsuario.getId(), newUsuario);
    this.agregarObservador(observer);
    return newUsuario;
  }

  public Usuario buscarUsuario (String nombre) {
    for (Usuario usuario : usuarios.values()) {
      if (usuario.getNombre().equals(nombre)) {
        return usuario;
      }
    }
    return null;
  }

  public void desconectarUsuario (int id) {
    Usuario usuario = this.usuarios.get(id);
    this.usuarios.remove(usuario.getId());
  }

  public void agregarObservador (IObserver observador) {
    observadores.add(observador);
  }

  public void notificarObservers (Nota nota) {
    for (IObserver observador : observadores) {
      observador.actualizar(nota);
    }
  }
}

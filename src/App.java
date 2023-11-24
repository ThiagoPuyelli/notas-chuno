import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.Controlador;
import VistaGrafica.VistaGrafica;
import modelo.Tablero;
import modelo.Usuario;
import modelo.IUsuario;

public class App {
    public static void main(String[] args) throws Exception {
      Tablero tablero = new Tablero();
      Controlador controlador = new Controlador(tablero);
      VistaGrafica vista = new VistaGrafica(controlador);

      Controlador controlador2 = new Controlador(tablero);
      VistaGrafica vista2 = new VistaGrafica(controlador2);
    }
}

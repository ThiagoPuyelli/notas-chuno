package modelo;

public class Usuario implements IUsuario {
  private static int ID = 0;
  private int id;
  private String nombre;

  public Usuario (String nombre) {
    this.nombre = nombre;
    this.id = ID++;
  }

  public int getId () {
    return id;
  }

  public String getNombre () {
    return nombre;
  }
}

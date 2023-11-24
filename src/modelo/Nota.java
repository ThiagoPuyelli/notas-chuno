package modelo;

import java.time.LocalDate;

public class Nota {
  private LocalDate recordatorio;
  private LocalDate creacion;
  private Usuario usuario;
  private String descripcion;

  public Nota (LocalDate recordatorio, Usuario usuario, String descripcion) {
    this.usuario = usuario;
    this.recordatorio = recordatorio;
    this.descripcion = descripcion;
    this.creacion = LocalDate.now();
  }

  public LocalDate getRecordatorio () {
    return recordatorio;
  }

  public LocalDate getCreacion () {
    return creacion;
  }

  public Usuario getUsuario () {
    return usuario;
  }

  public String getDescripcion () {
    return descripcion;
  }
}

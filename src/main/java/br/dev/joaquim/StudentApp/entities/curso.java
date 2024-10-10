package br.dev.joaquim.StudentApp.entities;

public class curso {
  private int cod_cur;
  private String materia;

  public Student() {
  }

  public Student(int cod_cur, String materia) {
    this.cod_cur
    this.materia = materia;
  }

  public int getCod_cur() {
    return cod_cur;
  }

  public String getMateria() {
    return materia;
  }


  @Override
  public String toString() {
    return "codigo " + getCod_cur() + " [" + getMateria() + "]";
  }
}

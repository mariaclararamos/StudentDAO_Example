package br.dev.joaquim.StudentApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.dev.joaquim.StudentApp.entities.curso;

public class H2ScursoDAO implements cursoDAO {

  private Connection connection;
  private String url = "jdbc:h2:file:~/data/students;";
  private String user = "root";
  private String password = "root";

  public H2cursoDAO() {
    connect();
    createTableIfNotExists();
  }

  private void connect() {
    try {
      this.connection = DriverManager.getConnection(url, user, password);
    } catch (SQLException ex) {
      this.connection = null;
      System.out.println("Problema ao conectar no banco de dados");
      ex.printStackTrace();
    }
  }

  private void createTableIfNotExists() {
    try {
      String sql = "CREATE TABLE IF NOT EXISTS curso(" +
          "ra INT, name VARCHAR(256), PRIMARY KEY (ra));";
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.execute();
    } catch (SQLException ex) {
      System.out.println("Problema ao criar a tabela");
      ex.printStackTrace();
    } catch (NullPointerException ex) {
      System.out.println("Problema ao criar a tabela (sem conexao)");
    }
  }

  @Override
  public boolean create(Curso curso) {
    try {
      String sql = "INSERT INTO curso VALUES(?,?)";
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setInt(1, student.getcod_curso());
      stmt.setString(2, student.getMateria());
      stmt.executeUpdate();

      return true;

    } catch (SQLException ex) {
      System.out.println("Problema ao criar curso");
      ex.printStackTrace();
    } catch (NullPointerException ex) {
      System.out.println("Problema ao criar curso (sem conexao)");
    }

    return false;
  }
  

  @Override
  public boolean update(Curso curso) {
    try {
      String sql = "UPDATE curso SET materia = ? WHERE cod_curso = ?";
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setString(1, student.getMateria());
      stmt.setInt(2, student.getCod_curso());
      stmt.executeUpdate();

      return true;

    } catch (SQLException ex) {
      System.out.println("Problema ao atualizar curso");
      ex.printStackTrace();
    } catch (NullPointerException ex) {
      System.out.println("Problema ao atualizar curso (sem conexao)");
    }

    return false;
  }

  @Override
  public boolean delete(int cod_curso) {
    try {
      String sql = "DELETE FROM curso WHERE cod_curso = ?";
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setInt(1, ra);
      stmt.executeUpdate();

      return true;

    } catch (SQLException ex) {
      System.out.println("Problema ao apagar curso");
      ex.printStackTrace();
    } catch (NullPointerException ex) {
      System.out.println("Problema ao apagar curso (sem conexao)");
    }

    return false;
  }
}

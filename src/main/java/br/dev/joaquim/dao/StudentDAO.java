package br.dev.joaquim.dao;

import java.util.List;

import br.dev.joaquim.entities.Student;

public interface StudentDAO {
  public boolean create(Student student);

  public List<Student> findAll();

  public Student findByRa(int ra);

  public boolean update(Student student);

  public boolean delete(int ra);
}

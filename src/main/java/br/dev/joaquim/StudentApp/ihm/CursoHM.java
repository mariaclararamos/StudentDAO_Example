package br.dev.joaquim.StudentApp.ihm;

import java.util.Scanner;

import br.dev.joaquim.StudentApp.dao.StudentDAO;
import br.dev.joaquim.StudentApp.entities.Student;

public class StudentIHM {

    private cursoDAO cursoDAO;

    public CursoIHM(cursoDAO corsoDAO) {
        this.cursoDAO = cursoDAO;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("=== Student Management Menu ===");
            System.out.println("1. Add curso");
            System.out.println("3. Update curso");
            System.out.println("4. Delete curso");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addCurso(scanner);
                    break;
            
                case 3:
                    updateCurso(scanner);
                    break;
                case 4:
                    deleteCurso(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private void add(Scanner scanner) {
        System.out.print("Enter materia name: ");
        String name = scanner.nextLine();
        System.out.print("Enter código: ");
        int ra = scanner.nextInt();

        Student curso = new curso();
        student.setName(materia);
        student.setRa(cod_curso);

        cursoDAO.create(curso);
        System.out.println("curso added successfully.");
    }

    
    }

    private void updateCurso(Scanner scanner) {
        System.out.print("Enter student cod_curso to update: ");
        int cod_curso = scanner.nextInt();
        scanner.nextLine(); 

        curso curso = cursoDAO.findBycod_curso(cod_curso);
        if (curso == null) {
            System.out.println("curso not found.");
            return;
        }

        System.out.print("Enter new materia: ");
        String materia = scanner.nextLine();

        curso.setMateria(materia);

        cursoDAO.update(curso);
        System.out.println("curso updated successfully.");
    }

    private void deleteCurso(Scanner scanner) {
        System.out.print("Enter student cod_curso to delete: ");
        int cod_curso = scanner.nextInt();
        cursoDAO.delete(cod_curso);
        System.out.println("curso deleted successfully.");
    }
}

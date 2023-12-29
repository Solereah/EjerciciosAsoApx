package business;

import dto.CursoDTO;
import dto.EstudianteDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjercicioLogicaDeNegocio {
    public static void main(String[] args) {
        // Crear un curso con algunos estudiantes
        CursoDTO cursoInicial = crearCursoInicial();

        // TODO: Llamar a un método que aumente la edad de todos los estudiantes en el curso en 1
        aumentarEdadEstudiantes(cursoInicial);

        // TODO: Llamar a un método que filtre los estudiantes mayores de X años en el curso
        CursoDTO cursoFiltrado = filtrarEstudiantesPorEdad(cursoInicial, 10);

        // Llamar al método que organiza los nombres por orden alfabético
        ordenarNombresAlfabeticamente(cursoFiltrado.getEstudiantes());

        // Mostrar resultados
        System.out.println("Curso inicial: " + cursoInicial);
        System.out.println("Curso filtrado: " + cursoFiltrado);
    }

    private static CursoDTO crearCursoInicial() {
        CursoDTO curso = new CursoDTO();
        curso.setNombre("Programación Avanzada");

        List<EstudianteDTO> estudiantes = new ArrayList<>();
        estudiantes.add(new EstudianteDTO("Juan", 19));
        estudiantes.add(new EstudianteDTO("Zamir", 30));
        estudiantes.add(new EstudianteDTO("Maria", 21));
        estudiantes.add(new EstudianteDTO("Pedro", 18));
        estudiantes.add(new EstudianteDTO("Aleja", 15));

        curso.setEstudiantes(estudiantes);

        return curso;
    }

    // TODO: Implementar el método para aumentar la edad de todos los estudiantes en el curso en 1
    private static void aumentarEdadEstudiantes(CursoDTO curso) {
        // TODO: Lógica de negocio para aumentar la edad de los estudiantes en 1
        List<EstudianteDTO> estudiantes = curso.getEstudiantes();

        for(EstudianteDTO estudiante: estudiantes ){
            estudiante.setEdad(estudiante.getEdad()+1);
        }
    }

    // TODO: Implementar el método para filtrar los estudiantes mayores de cierta edad en el curso
    private static CursoDTO filtrarEstudiantesPorEdad(CursoDTO curso, int edadMinima) {
        List<EstudianteDTO> estudiantes = curso.getEstudiantes();

        CursoDTO cursoFiltrado = new CursoDTO(curso.getNombre(),
                estudiantes.stream()
                        .filter(e -> e.getEdad() >= edadMinima)
                        .toList());
        return cursoFiltrado;
    }

    // TODO: Implementar el método para organizar los nombres por orden alfabético
    public static void ordenarNombresAlfabeticamente(List<EstudianteDTO> estudiantes) {
        ArrayList<EstudianteDTO> estudiantesOrdenadosNombre = new ArrayList<>();
        estudiantesOrdenadosNombre.addAll(estudiantes);
        estudiantesOrdenadosNombre.sort(Comparator.comparing(EstudianteDTO::getNombre));
    }
}

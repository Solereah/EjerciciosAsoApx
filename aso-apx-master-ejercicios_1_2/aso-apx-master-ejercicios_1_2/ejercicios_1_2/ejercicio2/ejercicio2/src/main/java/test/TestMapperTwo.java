package test;

import dto.InputTwoDTO;
import dto.OutputTwoDTO;


import java.util.Arrays;


import static mapper.MapperTwo.mapInputToOutputTwo;

public class TestMapperTwo {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO con lista de habilidades
        InputTwoDTO inputDTO = new InputTwoDTO("Juan Miguel", 25, "Software Engineer",  Arrays.asList("Java", "Spring", "SQL"));

        // TODO: Llamar al método de mapeo y mostrar el resultado en el Main
        OutputTwoDTO outputDTO = mapInputToOutputTwo(inputDTO);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + inputDTO);
        System.out.println("DTO de salida mapeado: " + outputDTO);
    }
}

package mapper;

import dto.InputTwoDTO;
import dto.OutputTwoDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapperTwo {
    // TODO: Implementar el método de mapeo aquí
    public static OutputTwoDTO mapInputToOutputTwo(InputTwoDTO inputTwoDTO) {
        // TODO: Mapear las propiedades de InputTwoDTO a OutputTwoDTO, incluyendo la transformación de habilidades
        //Ejemplo ficticio:
       //List<String> formattedSkills =
         //inputTwoDTO.getSkills().stream().map(String::toUpperCase).collect(Collectors.toList());
        //return new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(),inputTwoDTO.getOccupation(),
          //formattedSkills);

        List<String> formattedSkills = new ArrayList<>();
        for(String skill: inputTwoDTO.getSkills()){
            formattedSkills.add(skill.toUpperCase());
        }
        return new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(),
                inputTwoDTO.getOccupation(), formattedSkills);
    }
}

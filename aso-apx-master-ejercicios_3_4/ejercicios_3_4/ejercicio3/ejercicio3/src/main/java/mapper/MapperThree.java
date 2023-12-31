package mapper;

import dto.OutputInfoDTO;
import dto.PersonInfoDTO;
import dto.ProjectDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperThree {
    // TODO: Implementar el método de mapeo aquí
    public static OutputInfoDTO mapInputToOutputThree(PersonInfoDTO personInfoDTO) {
        // TODO: Mapear las propiedades de PersonInfoDTO a OutputInfoDTO, incluyendo la transformación de proyectos
        // Ejemplo ficticio:
         List<String> formattedProjectNames =
                 personInfoDTO.getProjects().stream()
                         .map(ProjectDTO::getName)
                         .toList()
                         .stream().
                         flatMap(p -> Arrays.stream(p.split(",")))
                         .collect(Collectors.toList());



        return new OutputInfoDTO(personInfoDTO.getFullName(), personInfoDTO.getAge(), personInfoDTO.getOccupation(),
                formattedProjectNames);


    }
}

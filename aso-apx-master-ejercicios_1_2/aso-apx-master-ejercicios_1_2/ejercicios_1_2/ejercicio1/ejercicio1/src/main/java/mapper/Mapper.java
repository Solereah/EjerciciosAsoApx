package mapper;

import dto.InputDTO;
import dto.OutputDTO;

public class Mapper {
    // TODO: Implementar el método de mapeo aquí
    public static OutputDTO mapInputToOutput(InputDTO inputDTO) {
        // TODO: Mapear las propiedades de InputDTO a OutputDTO
        String fullName = inputDTO.getName();
        int yearsOld = inputDTO.getAge() ;
        String jobTitle = inputDTO.getOccupation();

        return new OutputDTO(fullName, yearsOld, jobTitle);


    }
}

package mapper;

import dto.InputDTO;
import dto.OutputDTO;

public class Mapper {
    // TODO: Implementar el método de mapeo aquí
    public static OutputDTO mapInputToOutput(InputDTO inputDTO) {
        // TODO: Mapear las propiedades de InputDTO a OutputDTO
      if(inputDTO==null){
          return null;
      }
        String fullName = inputDTO.getName() != null ? inputDTO.getName():null;
        Integer yearsOld = inputDTO.getAge() != 0 ? inputDTO.getAge() : null ;
        String jobTitle = inputDTO.getOccupation()!=null? inputDTO.getOccupation() : null;

        OutputDTO outputDTO = new OutputDTO(fullName,yearsOld,jobTitle);

        return outputDTO;


    }
}

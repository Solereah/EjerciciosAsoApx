package mapper;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    /**
     * Mapea una lista de entrada a una lista de salida.
     *
     * @param requestDTO La solicitud de entrada que contiene los datos a mapear.
     * @return Una lista de objetos ResponseDTO mapeados desde la entrada.
     * @throws ParseException Si ocurre un error al analizar los datos.
     */
    public static List<ResponseDTO> mapListaEntradaToSalida(RequestDTO requestDTO) throws ParseException {
        String formatoFecha = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);

        // Lista de salida
        List<ResponseDTO> listaSalida = new ArrayList<>();

        for (ContactDTO contactDTO : requestDTO.getContact()) {

            for (String info : requestDTO.getRequest()) {
                String[] campo = info.split(",");
                ResponseDTO responseDTO = new ResponseDTO();

                responseDTO.setEmail(contactDTO.getEmail());
                responseDTO.setCel(contactDTO.getCel());
                responseDTO.setNombre(campo[0]);
                responseDTO.setNumero(Integer.parseInt(campo[1]));
                try {
                    responseDTO.setFecha(sdf.parse(campo[2]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                listaSalida.add(responseDTO);
            }
        }

        return listaSalida;
    }
}

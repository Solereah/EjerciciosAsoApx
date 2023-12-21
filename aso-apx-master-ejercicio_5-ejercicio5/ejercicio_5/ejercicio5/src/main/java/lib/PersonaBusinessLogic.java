package lib;

import dto.PersonaInputDTO;
import dto.PersonaOutputDTO;
import dto.TipoContacto;

public class PersonaBusinessLogic {
	public static void main(String[] args) {
		// Crear un objeto de entrada DTO con datos de una persona
		PersonaInputDTO inputDTOCel = new PersonaInputDTO("Zamir", "+57 300333", TipoContacto.CELULAR);
		PersonaInputDTO inputDTOEmail = new PersonaInputDTO("Jose", "zam@co", TipoContacto.EMAIL);

		// TODO: Llamar al método de negocio y mostrar el resultado en el Main
		PersonaOutputDTO outputDTOCel = procesarDatosPersona(inputDTOCel);
		PersonaOutputDTO outputDTOEmail = procesarDatosPersona(inputDTOEmail);

		// Mostrar el resultado
		System.out.println("DTO de entrada: " + inputDTOCel);
		System.out.println("DTO de salida procesado: " + outputDTOCel);
		System.out.println("DTO de entrada: " + inputDTOEmail);
		System.out.println("DTO de salida procesado: " + outputDTOEmail);
	}

	// TODO: Implementar el método de negocio aquí
	private static PersonaOutputDTO procesarDatosPersona(PersonaInputDTO inputDTO) {
		// TODO: Aplicar la lógica de negocio según los requisitos
		// Por ejemplo, para el número de contacto, extraer solo los dígitos
		// y para el tipo de contacto, validar y procesar según sea necesario.
		if (inputDTO == null) {
			return null;
		}

		PersonaOutputDTO personaOutputDTO = new PersonaOutputDTO();
		personaOutputDTO.setNombre(inputDTO.getNombre());
		if (inputDTO.getTipoContacto() == TipoContacto.CELULAR) {
			String numeroCelular = extraerNumeroCelular(inputDTO.getContacto());
			personaOutputDTO.setContactoProcesado(numeroCelular);
		} else {
			boolean correoValido = validarCorreoElectronico(inputDTO.getContacto());
			personaOutputDTO.setContactoProcesado(correoValido ? inputDTO.getContacto() : null);
		}

		return personaOutputDTO;
	}

	private static String extraerNumeroCelular(String contacto) {
		return contacto.replaceAll("[^0-9]", " ").trim();
	}

	private static boolean validarCorreoElectronico(String correo) {
		return correo.matches("^[a-zA-Z]+@[a-zA-Z]+$");
	}
}
}

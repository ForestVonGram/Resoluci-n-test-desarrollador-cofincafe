import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Importación de jackson para poder usar la clase ObjectMapper
import com.fasterxml.jackson.databind.ObjectMapper;

//Servicio para la clase Cliente
public class ClienteService {

    //Lista de los clientes con el balance negativo
    public List<Cliente> obtenerClientesBalanceNegativo(List<Cliente> clientes) {
        return clientes.stream()
                .filter(c -> c.getBalance() < 0)
                .collect(Collectors.toList());
    }

    //Lista del top 3 clientes con mayor balance
    public List<Cliente> obtenerClientesTop3MayorBalance(List<Cliente> clientes) {
        return clientes.stream()
                .sorted(Comparator.comparingDouble(Cliente::getBalance).reversed())
                .limit(3)
                .collect(Collectors.toList());
        //Se usa comparator para realizar la comparación entre el balance de los clientes y escoger los 3 más altos.
        //Se limita a 3 para obtener solo los 3 primeros
    }

    //Conversión de la lista a JSON
    public String convertirListaAJson(List<Cliente> clientes) {
        try {
            //ObjectMapper para mayor facilidad en la serialización y deserialización
            ObjectMapper mapper = new ObjectMapper();

            //writerWithDefaultPrettyPrinter para que la salida de texto tenga formato más legible.
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(clientes);
        } catch(Exception e) {
            //Manejo de excepciones
            throw new RuntimeException("Error al convertir a JSON", e);
        }
    }
}

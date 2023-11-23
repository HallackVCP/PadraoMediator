import org.example.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveElogiarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("Recepcao do hotel. Agradecemos seu contato.\n" +
                        "O Hotel respondeu sua demanda de reserva conforme a confirmacao a seguir.\n" +
                        ">>Reserva do quarto:  201 para o cliente: Jao realizada",
                cliente.realizarReserva("Jao", 201));
    }

    @Test
    void deveReclamarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("Recepcao do hotel. Agradecemos seu contato.\n" +
                        "O Hotel respondeu sua demanda de cancelamento conforme a confirmacao a seguir.\n" +
                        ">>Reserva do quarto:  201 para o cliente: Jao cancelada",
                cliente.cancelarReserva("Jao", 201));
    }

}

package org.example;

public class Recepcao {

    private static Recepcao instancia = new Recepcao();

    private Recepcao(){}

    public static Recepcao getInstancia() {
        return instancia;
    }

    public String receberReservaHotel(String nmCliente, Integer nrQuarto) {
        return "Recepcao do hotel. Agradecemos seu contato.\n"+
                "O Hotel respondeu sua demanda de reserva conforme a confirmacao a seguir.\n" +
                ">>" + Hotel.getInstancia().receberReserva(nmCliente, nrQuarto);
    }

    public String cancelarReservaHotel(String nmCliente, Integer nrQuarto) {
        return "Recepcao do hotel. Agradecemos seu contato.\n"+
                "O Hotel respondeu sua demanda de cancelamento conforme a confirmacao a seguir.\n" +
                ">>" + Hotel.getInstancia().cancelarReserva(nmCliente, nrQuarto);
    }
}

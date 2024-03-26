import java.util.Date;

// Definición de la clase Reserva
class Reserva {
    private String aeropuerto;
    private int cantidadBoletos;
    private Date horarioSalida;
    private int idVuelo; // Identificador único del vuelo asociado

    // Constructor de la clase Reserva
    public Reserva(String aeropuerto, int cantidadBoletos, Date horarioSalida, int idVuelo) {
        this.aeropuerto = aeropuerto;
        this.cantidadBoletos = cantidadBoletos;
        this.horarioSalida = horarioSalida;
        this.idVuelo = idVuelo;
    }

    // Getters y setters
    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public Date getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(Date horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
}

// Definición de la clase Vuelo
class Vuelo {
    private int idVuelo;
    private int alturaMaxima;
    private int velocidadMaxima;

    // Constructor de la clase Vuelo
    public Vuelo(int idVuelo, int alturaMaxima, int velocidadMaxima) {
        this.idVuelo = idVuelo;
        this.alturaMaxima = alturaMaxima;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y setters
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso

        // Creamos instancias de vuelo
        Vuelo vuelo1 = new Vuelo(1, 10000, 800);
        Vuelo vuelo2 = new Vuelo(2, 12000, 900);

        // Creamos instancias de reserva asociadas a vuelos específicos
        Reserva reserva1 = new Reserva("Aeropuerto A", 2, new Date(), 1);
        Reserva reserva2 = new Reserva("Aeropuerto B", 3, new Date(), 2);

        // Accedemos a la información de la reserva y del vuelo asociado
        System.out.println("Reserva 1:");
        System.out.println("Aeropuerto: " + reserva1.getAeropuerto());
        System.out.println("Cantidad de Boletos: " + reserva1.getCantidadBoletos());
        System.out.println("Horario de Salida: " + reserva1.getHorarioSalida());
        System.out.println("ID de Vuelo: " + reserva1.getIdVuelo());
        System.out.println("Altura Máxima del Vuelo asociado: " + vuelo1.getAlturaMaxima());
        System.out.println("Velocidad Máxima del Vuelo asociado: " + vuelo1.getVelocidadMaxima());
    }
}

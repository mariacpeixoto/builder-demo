
public class CarBuilder implements Builder {
    // Variáveis de instância para armazenar os atributos do carro em construção
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    // Métodos da interface Builder para configurar os atributos do carro
    public void setCarType(CarType type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    // Método para obter o resultado da construção do carro
    public Car getResult() {
        // Retorna uma nova instância de Car com os atributos configurados
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

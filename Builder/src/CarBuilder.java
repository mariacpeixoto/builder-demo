
public class CarBuilder implements Builder {
    // Vari�veis de inst�ncia para armazenar os atributos do carro em constru��o
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    // M�todos da interface Builder para configurar os atributos do carro
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

    // M�todo para obter o resultado da constru��o do carro
    public Car getResult() {
        // Retorna uma nova inst�ncia de Car com os atributos configurados
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

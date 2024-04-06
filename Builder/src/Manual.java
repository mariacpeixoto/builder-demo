
public class Manual {
    // Vari�veis de inst�ncia para armazenar os atributos do manual
    private final CarType carType; // Tipo de carro
    private final int seats; // N�mero de assentos
    private final Engine engine; // Motor
    private final Transmission transmission; // Transmiss�o
    private final TripComputer tripComputer; // Computador de viagem
    private final GPSNavigator gpsNavigator; // Navegador GPS

    // Construtor da classe Manual que inicializa todos os atributos
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    // M�todo para imprimir as informa��es do manual
    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n"; // Adiciona o tipo de carro ao texto
        info += "Count of seats: " + seats + "\n"; // Adiciona o n�mero de assentos ao texto
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n"; // Adiciona informa��es do motor ao texto
        info += "Transmission: " + transmission + "\n"; // Adiciona informa��es da transmiss�o ao texto
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n"; // Se o computador de viagem estiver presente, adiciona ao texto que est� funcional
        } else {
            info += "Trip Computer: N/A" + "\n"; // Caso contr�rio, adiciona que n�o est� dispon�vel
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n"; // Se o navegador GPS estiver presente, adiciona ao texto que est� funcional
        } else {
            info += "GPS Navigator: N/A" + "\n"; // Caso contr�rio, adiciona que n�o est� dispon�vel
        }
        return info; // Retorna o texto com as informa��es do manual
    }
}

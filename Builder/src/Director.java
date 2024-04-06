
public class Director {
    // Método para construir um carro esportivo
    public void constructSportsCar(Builder builder) {
        // Define o tipo de carro como carro esportivo
        builder.setCarType(CarType.SPORTS_CAR);
        // Define o número de assentos para 2
        builder.setSeats(2);
        // Define o motor do carro esportivo
        builder.setEngine(new Engine(3.0, 0));
        // Define a transmissão como semi-automática
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        // Define um computador de viagem para o carro
        builder.setTripComputer(new TripComputer());
        // Define um navegador GPS para o carro
        builder.setGPSNavigator(new GPSNavigator());
    }

    // Método para construir um carro urbano
    public void constructCityCar(Builder builder) {
        // Define o tipo de carro como carro urbano
        builder.setCarType(CarType.CITY_CAR);
        // Define o número de assentos para 2
        builder.setSeats(2);
        // Define o motor do carro urbano
        builder.setEngine(new Engine(1.2, 0));
        // Define a transmissão como automática
        builder.setTransmission(Transmission.AUTOMATIC);
        // Define um computador de viagem para o carro
        builder.setTripComputer(new TripComputer());
        // Define um navegador GPS para o carro
        builder.setGPSNavigator(new GPSNavigator());
    }

    // Método para construir um SUV
    public void constructSUV(Builder builder) {
        // Define o tipo de carro como SUV
        builder.setCarType(CarType.SUV);
        // Define o número de assentos para 4
        builder.setSeats(4);
        // Define o motor do SUV
        builder.setEngine(new Engine(2.5, 0));
        // Define a transmissão como manual
        builder.setTransmission(Transmission.MANUAL);
        // Define um navegador GPS para o carro
        builder.setGPSNavigator(new GPSNavigator());
    }
}


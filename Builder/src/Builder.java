
/* Essa interface Builder define métodos para configurar os diferentes aspectos de um carro, como tipo, número de assentos, motor, transmissão, computador de viagem e navegador GPS.
 * Cada método na interface representa um aspecto específico do carro que pode ser configurado durante a construção.*/
public interface Builder {
	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

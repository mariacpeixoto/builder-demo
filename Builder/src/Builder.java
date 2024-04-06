
/* Essa interface Builder define m�todos para configurar os diferentes aspectos de um carro, como tipo, n�mero de assentos, motor, transmiss�o, computador de viagem e navegador GPS.
 * Cada m�todo na interface representa um aspecto espec�fico do carro que pode ser configurado durante a constru��o.*/
public interface Builder {
	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

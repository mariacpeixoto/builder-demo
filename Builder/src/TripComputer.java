
public class TripComputer {
    // Vari�vel de inst�ncia para armazenar o carro associado ao trip computer
    private Car car;

    // M�todo para definir o carro associado ao trip computer
    public void setCar(Car car) {
        this.car = car;
    }

    // M�todo para exibir o n�vel de combust�vel do carro associado
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel()); // Imprime o n�vel de combust�vel do carro
    }

    // M�todo para exibir o status do carro associado
    public void showStatus() {
        // Verifica se o motor do carro associado est� ligado
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started"); // Se o motor estiver ligado, imprime que o carro est� ligado
        } else {
            System.out.println("Car isn't started"); // Caso contr�rio, imprime que o carro n�o est� ligado
        }
    }
}


public class TripComputer {
    // Variável de instância para armazenar o carro associado ao trip computer
    private Car car;

    // Método para definir o carro associado ao trip computer
    public void setCar(Car car) {
        this.car = car;
    }

    // Método para exibir o nível de combustível do carro associado
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel()); // Imprime o nível de combustível do carro
    }

    // Método para exibir o status do carro associado
    public void showStatus() {
        // Verifica se o motor do carro associado está ligado
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started"); // Se o motor estiver ligado, imprime que o carro está ligado
        } else {
            System.out.println("Car isn't started"); // Caso contrário, imprime que o carro não está ligado
        }
    }
}

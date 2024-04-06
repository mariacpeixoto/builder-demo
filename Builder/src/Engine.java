
public class Engine {
    // Variáveis de instância para armazenar os atributos do motor
    private final double volume; // Volume do motor (em litros)
    private double mileage; // Quilometragem do motor
    private boolean started; // Indica se o motor está ligado

    // Construtor da classe Engine que inicializa o volume do motor e a quilometragem
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    // Método para ligar o motor
    public void on() {
        started = true;
    }

    // Método para desligar o motor
    public void off() {
        started = false;
    }

    // Método para verificar se o motor está ligado
    public boolean isStarted() {
        return started;
    }

    // Método para fazer o motor funcionar, incrementando a quilometragem
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!"); // Exibe uma mensagem de erro se o motor não estiver ligado
        }
    }

    // Método getter para obter o volume do motor
    public double getVolume() {
        return volume;
    }

    // Método getter para obter a quilometragem do motor
    public double getMileage() {
        return mileage;
    }
}

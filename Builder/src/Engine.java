
public class Engine {
    // Vari�veis de inst�ncia para armazenar os atributos do motor
    private final double volume; // Volume do motor (em litros)
    private double mileage; // Quilometragem do motor
    private boolean started; // Indica se o motor est� ligado

    // Construtor da classe Engine que inicializa o volume do motor e a quilometragem
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    // M�todo para ligar o motor
    public void on() {
        started = true;
    }

    // M�todo para desligar o motor
    public void off() {
        started = false;
    }

    // M�todo para verificar se o motor est� ligado
    public boolean isStarted() {
        return started;
    }

    // M�todo para fazer o motor funcionar, incrementando a quilometragem
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!"); // Exibe uma mensagem de erro se o motor n�o estiver ligado
        }
    }

    // M�todo getter para obter o volume do motor
    public double getVolume() {
        return volume;
    }

    // M�todo getter para obter a quilometragem do motor
    public double getMileage() {
        return mileage;
    }
}

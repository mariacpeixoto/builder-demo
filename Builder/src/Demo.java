
public class Demo {
    public static void main(String[] args) {
        // Cria uma inst�ncia do Diretor
        Director director = new Director();
        
        // Cria um builder de carro
        CarBuilder builder = new CarBuilder();
        
        // O diretor instrui o builder a construir um carro esportivo
        director.constructSportsCar(builder);

        // Obtendo o carro constru�do pelo builder
        Car car = builder.getResult();
        
        // Imprime informa��es sobre o carro constru�do
        System.out.println("Car built:\n" + car.getCarType());

        // Cria um builder de manual de carro
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor instrui o builder de manual a construir um carro esportivo
        director.constructSportsCar(manualBuilder);
        
        // Obter o manual do carro constru�do pelo builder de manual
        Manual carManual = manualBuilder.getResult();
        
        // Imprime informa��es sobre o manual do carro constru�do
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}


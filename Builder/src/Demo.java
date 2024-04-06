
public class Demo {
    public static void main(String[] args) {
        // Cria uma instância do Diretor
        Director director = new Director();
        
        // Cria um builder de carro
        CarBuilder builder = new CarBuilder();
        
        // O diretor instrui o builder a construir um carro esportivo
        director.constructSportsCar(builder);

        // Obtendo o carro construído pelo builder
        Car car = builder.getResult();
        
        // Imprime informações sobre o carro construído
        System.out.println("Car built:\n" + car.getCarType());

        // Cria um builder de manual de carro
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor instrui o builder de manual a construir um carro esportivo
        director.constructSportsCar(manualBuilder);
        
        // Obter o manual do carro construído pelo builder de manual
        Manual carManual = manualBuilder.getResult();
        
        // Imprime informações sobre o manual do carro construído
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}


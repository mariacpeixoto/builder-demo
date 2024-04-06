
public class GPSNavigator {
    // Variável de instância para armazenar a rota do GPS
    private String route;

    // Construtor padrão que define uma rota padrão
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    // Construtor que permite especificar manualmente a rota do GPS
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    // Método getter para obter a rota do GPS
    public String getRoute() {
        return route;
    }
}


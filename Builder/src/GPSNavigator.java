
public class GPSNavigator {
    // Vari�vel de inst�ncia para armazenar a rota do GPS
    private String route;

    // Construtor padr�o que define uma rota padr�o
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    // Construtor que permite especificar manualmente a rota do GPS
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    // M�todo getter para obter a rota do GPS
    public String getRoute() {
        return route;
    }
}


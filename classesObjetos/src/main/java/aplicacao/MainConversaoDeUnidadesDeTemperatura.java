//exercicio 2
package aplicacao;

import exercicioMetodos.ConversaoDeUnidadesDeTemperatura;

public class MainConversaoDeUnidadesDeTemperatura {
    public static void main(String[] args){ 
    
        double celsius = 25.0;
        double fahrenheit = ConversaoDeUnidadesDeTemperatura.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");
    }
    
}

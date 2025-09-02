package principal;

public class CalculoPrimo {

    public void calculandoPrimo(int candidato) {
        if (candidato < 2) {
            return; 
        }
        for (int j = 2; j <= candidato / 2; j++) {
            if (candidato % j == 0) {
                return; 
            }
        }
        System.out.println(candidato + " é Primo");
    }
}

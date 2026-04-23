public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];

        empregado[0] = new EmpregadoHorista(1, "José", 140, 200);
        empregado[1] = new EmpregadoComissionado(2, "Selmini", 350000, 20);
        empregado[2] = new EmpregadoHorista(3, "Ana", 200, 300);
        empregado[3] = new EmpregadoComissionado(4, "Laura", 50000, 25);

        
    }
}

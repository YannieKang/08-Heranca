public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDeHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDeHoraTrabalhada){
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDeHoraTrabalhada = valorDeHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDeHoraTrabalhada;
    }

    @Override
    public String toString() {
        return "EmpregadoHorista{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", totalDeHorasTrabalhadas=" + totalDeHorasTrabalhadas +
                ", valorDeHoraTrabalhada=" + valorDeHoraTrabalhada +
                '}';
    }
}

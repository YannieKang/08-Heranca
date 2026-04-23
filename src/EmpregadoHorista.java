public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDeHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDeHoraTrabalhada){
        super( nome, matricula);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDeHoraTrabalhada = valorDeHoraTrabalhada;
    }



}

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome,  double totalDeVendas, double comissao) {
        super(nome, matricula);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
}

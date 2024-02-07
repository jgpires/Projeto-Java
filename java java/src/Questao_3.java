// Classe abstrata para calcular o salário
abstract class Funcionario {
    protected int horasTrabalhadas;

    public Funcionario(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método abstrato para calcular o salário
    public abstract double calcularSalario();
}

// Primeiro grupo de funcionários com bônus de 30%
class Grupo1 extends Funcionario {
    private static final double PRECO_HORA = 200.0;
    private static final double BONUS = 0.3;

    public Grupo1(int horasTrabalhadas) {
        super(horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = horasTrabalhadas * PRECO_HORA;
        return salarioBase + (salarioBase * BONUS);
    }
}

// Segundo grupo de funcionários sem bônus
class Grupo2 extends Funcionario {
    private static final double PRECO_HORA = 250.0;

    public Grupo2(int horasTrabalhadas) {
        super(horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * PRECO_HORA;
    }
}

public class Questao_3 {
    public static void main(String[] args) {
        // Exemplo de uso
        Funcionario funcionario1 = new Grupo1(40); // Grupo 1 trabalhou 40 horas
        Funcionario funcionario2 = new Grupo2(35); // Grupo 2 trabalhou 35 horas

        System.out.println("Salário do funcionário do Grupo 1: R$" + funcionario1.calcularSalario());
        System.out.println("Salário do funcionário do Grupo 2: R$" + funcionario2.calcularSalario());
    }
}

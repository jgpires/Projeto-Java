import java.util.Calendar;

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular o ano de nascimento
    public int calcularAnoNascimento() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return anoAtual - idade;
    }
}

class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, int idade, double altura, String rg, String cpf) {
        super(nome, idade, altura);
        this.rg = rg;
        this.cpf = cpf;
    }

    // Getters e Setters para RG e CPF
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

public class Questao_2 {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("João", 25, 1.75, "123456", "7891011");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Ano de nascimento: " + pessoa.calcularAnoNascimento());
        System.out.println("RG: " + pessoa.getRg());
        System.out.println("CPF: " + pessoa.getCpf());

        // Alterando dados
        pessoa.setNome("José");
        pessoa.setIdade(30);
        pessoa.setAltura(1.80);
        pessoa.setRg("789012");
        pessoa.setCpf("11121314");

        System.out.println("\nDados alterados:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Ano de nascimento: " + pessoa.calcularAnoNascimento());
        System.out.println("RG: " + pessoa.getRg());
        System.out.println("CPF: " + pessoa.getCpf());
    }
}

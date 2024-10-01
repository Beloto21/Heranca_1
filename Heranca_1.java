
class Pessoa {
    // atributos sobre as pessoas
    protected String nome;
    protected String endereco;
    protected String email;

    // construtor da classe pessoa
    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// classe que representa uma pessoa fisica
class PessoaFisica extends Pessoa {
    
    private String cpf;

    // construtor da classe PessoaFisica
    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email); 
        this.cpf = cpf;
    }

    // getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa Física: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", E-mail: " + email;
    }
}

// classe que representa uma pessoa juridica
class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    // construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email); 
        this.cnpj = cnpj;
    }

    // getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica: " + nome + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", E-mail: " + email;
    }
}

// classe que representa um funcionario
class Funcionario extends PessoaFisica {
    
    private double salario;

    // construtor da classe funcionario
    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email, cpf); 
        this.salario = salario;
    }

    // getters e setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", CPF: " + getCpf() + ", Endereço: " + endereco + ", E-mail: " + email + ", Salário: " + salario;
    }
}

// classe para testar as outras classes
public class Teste {
    public static void main(String[] args) {
        
        PessoaFisica clientePF = new PessoaFisica("João Silva", "Rua das Flores, 123", "joao@gmail.com", "123.456.789-00");
        System.out.println(clientePF);

        
        PessoaJuridica clientePJ = new PessoaJuridica("Empresa XYZ Ltda", "Av. Paulista, 1000", "contato@xyz.com.br", "12.345.678/0001-99");
        System.out.println(clientePJ);

        
        Funcionario funcionario = new Funcionario("Maria Oliveira", "Rua do Trabalho, 456", "maria@gmail.com", "987.654.321-00", 3500.00);
        System.out.println(funcionario);
    }
}

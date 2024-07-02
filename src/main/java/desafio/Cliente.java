package desafio;

public class Cliente {
   private Banco banco;
   private String cpf;
   private String nome;
   private String telefone;
   private String endereco;

   public Cliente(String nome, Banco banco) {
      this.nome = nome;
      this.banco = banco;
      this.banco.clientes.add(this);
   }

   public Cliente(String cpf, String nome, String telefone, String endereco) {
      this.cpf = cpf;
      this.nome = nome;
      this.telefone = telefone;
      this.endereco = endereco;
   }

   public String getCpf() {
      return cpf;
   }

   public String getNome() {
      return nome;
   }

   public String getTelefone() {
      return telefone;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }
   public void setBanco(Banco banco) {
      this.banco = banco;
      this.banco.clientes.add(this);
   }

   @Override
   public String toString() {
      return  "{"
              + "Banco = " + banco.nome
              + ", Titular = " + this.getNome()
              + '}';
   }
}

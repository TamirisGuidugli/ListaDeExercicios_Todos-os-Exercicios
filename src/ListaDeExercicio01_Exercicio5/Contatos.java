package ListaDeExercicio01_Exercicio5;

public class Contatos {

    private String nome;
    private String telefone;
    private String email;

    public Contatos(String nome ,String telefone,String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getTelefone() + " - " + getEmail();
    }

}


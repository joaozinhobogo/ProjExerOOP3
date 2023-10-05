package classe;

/**
 * Author joao_g_cristovao
 */
public class Pessoa {

    private String nrCpf;
    private String nome;
    private String email;
    private String telefone;

    public String getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(String nrCpf) {
        if (nrCpf.length() == 11) {
            this.nrCpf = nrCpf;
        } else {
            this.nrCpf = "CPF Inválido";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals("")) {
            this.nome = "Campo em branco";
        } else {
            this.nome = nome;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.equals("")) {
            this.email = "Campo em branco";
        } else {
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.equals("")) {
            this.telefone = "Campo em branco";
        } else {
            this.telefone = telefone;
        }
    }

    public String toString() {
        String saida = "\tNome:............................" + getNrCpf()
                + "\n\tCPF:............................." + getNome()
                + "\n\tEmail:..........................." + getEmail()
                + "\n\tTelefone:........................" + getTelefone();

        return saida;

    }
}

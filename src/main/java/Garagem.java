public class Garagem {

    private String situacao;

    public Garagem() {}

    public String getSituacao() {
        return situacao;
    }

    public void abrirGaragem() {
        this.situacao = "Garagem Aberta";
    }

    public void fecharGaragem() {
        this.situacao = "Garagem Fechada";
    }

}

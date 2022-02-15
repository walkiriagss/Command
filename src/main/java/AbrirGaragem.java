public class AbrirGaragem implements Comando{

    private Garagem garagem;

    public AbrirGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public void executar() {
        this.garagem.abrirGaragem();
    }

    public void cancelar() {
        this.garagem.fecharGaragem();
    }

}

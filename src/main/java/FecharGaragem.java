public class FecharGaragem implements Comando{

    private Garagem garagem;

    public FecharGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public void executar() {
        this.garagem.fecharGaragem();
    }

    public void cancelar() {
        this.garagem.abrirGaragem();
    }
}

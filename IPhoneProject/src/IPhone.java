public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Métodos da interface IReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarFaixa(String faixa) {
        System.out.println("Selecionando a faixa: " + faixa);
    }

    // Métodos da interface IAparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para: " + numero + " Mensagem: " + mensagem);
    }

    // Métodos da interface INavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página atual.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
public class App {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando funções de Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarFaixa("Favorita");
        meuIPhone.pausar();

        // Testando funções de Aparelho Telefônico
        meuIPhone.fazerChamada("123-456-7890");
        meuIPhone.receberChamada("098-765-4321");
        meuIPhone.enviarSMS("123-456-7890", "Olá, como vai?");

        // Testando funções de Navegador de Internet
        meuIPhone.abrirPagina("www.example.com");
        meuIPhone.atualizarPagina();
        meuIPhone.fecharPagina();
    }
}
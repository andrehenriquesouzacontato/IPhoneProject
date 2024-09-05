public interface IAparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void enviarSMS(String numero, String mensagem);
}
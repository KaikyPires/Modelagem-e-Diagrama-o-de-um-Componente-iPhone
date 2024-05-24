public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
    }
}

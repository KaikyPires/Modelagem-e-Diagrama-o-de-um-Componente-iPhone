public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        
        navegador.exibirPagina("www");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("ABC");
    }
}

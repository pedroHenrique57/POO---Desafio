package main.java.edu.IPhone;

import java.util.Scanner;

import main.java.edu.IPhone.aplicativos.AparelhoTelefonicoAPP;
import main.java.edu.IPhone.aplicativos.NavegadorDeInternetAPP;
import main.java.edu.IPhone.aplicativos.ReprodutorMusicalAPP;
import main.java.edu.IPhone.utils.animacoes;

public class IPhone {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    boolean continuaPergunta = true, continuaCelular = true, continuaUsoApp = true;
    AparelhoTelefonicoAPP aparelhoTelefonicoAPP = new AparelhoTelefonicoAPP();
    ReprodutorMusicalAPP reprodutorMusicalAPP = new ReprodutorMusicalAPP();
    NavegadorDeInternetAPP navegadorDeInternetAPP = new NavegadorDeInternetAPP();

    animacoes.animacaoCarregamento("Ligando IPhone", 200);

    System.out.println("\nIPhone ligado!");

    do {
      do {
        System.out.println(
            "\nDentre os aplicativos do sistema, digite o número de qual você gostaria de utilizar:\n1.Telefone\n2.Navegador de Internet\n3.Reprodutor Musical\n4.Desligar celular");

        switch (sc.nextInt()) {
          case 1:
            animacoes.animacaoCarregamento("Carregando App Telefone", 80);

            do {
              do {
                System.out.println(
                    "\nBem vindo ao aplicativo de telefone. Gostaria de utilizar qual Função? Por favor informe o número.\n1.Ligação\n2.Atender Ligação\n3.Abrir correio de voz\n4.Sair do app");

                switch (sc.nextInt()) {
                  case 1:
                    aparelhoTelefonicoAPP.ligar();
                    break;

                  case 2:
                    aparelhoTelefonicoAPP.atender();
                    break;

                  case 3:
                    aparelhoTelefonicoAPP.iniciarCorreioVoz();
                    break;

                  case 4:
                    continuaPergunta = false;
                    continuaUsoApp = false;
                    break;

                  default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
                }
              } while (continuaPergunta);
            } while (continuaUsoApp);
            continuaPergunta = true;
            break;

          case 2:
            animacoes.animacaoCarregamento("Carregando Navegador de Internet", 80);

            do {
              do {
                System.out.println(
                    "\nBem vindo ao Navegador de Internet. Gostaria de utilizar qual Função? Por favor informe o número.\n1.Exibir Pagina\n2.Adicionar Nova Aba\n3.Atualizar Pagina\n4.Sair do app");

                switch (sc.nextInt()) {
                  case 1:
                    navegadorDeInternetAPP.exibirPagina();
                    continuaPergunta = false;
                    break;

                  case 2:
                    navegadorDeInternetAPP.adicionarNovaAba();
                    continuaPergunta = false;
                    break;

                  case 3:
                    navegadorDeInternetAPP.atualizarPagina();
                    continuaPergunta = false;
                    break;

                  case 4:
                    continuaPergunta = false;
                    continuaUsoApp = false;
                    break;

                  default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
                }
              } while (continuaPergunta);
            } while (continuaUsoApp);
            continuaPergunta = true;
            break;

          case 3:
            animacoes.animacaoCarregamento("Carregando Reprodutor Musical", 80);

            do {
              do {
                System.out.println(
                    "\nBem vindo ao Reprodutor Musical. Gostaria de utilizar qual Função? Por favor informe o número.\n1.Tocar Musica\n2.Pausar Musica\n3.Selecionar Musica\n4.Sair do app");

                switch (sc.nextInt()) {
                  case 1:
                    reprodutorMusicalAPP.tocar();
                    continuaPergunta = false;
                    break;

                  case 2:
                    reprodutorMusicalAPP.pausar();
                    continuaPergunta = false;
                    break;

                  case 3:
                    reprodutorMusicalAPP.selecionarMusica();
                    continuaPergunta = false;
                    break;

                  case 4:
                    continuaPergunta = false;
                    continuaUsoApp = false;
                    break;

                  default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
                }
              } while (continuaPergunta);
            } while (continuaUsoApp);
            continuaPergunta = true;
            break;

          case 4:
            animacoes.animacaoCarregamento("Desligando celular", 110);
            System.out.println("Celular Desligado.");
            continuaPergunta = false;
            continuaCelular = false;
            break;

          default:
            System.out.println("\nOpção inválida! Tente novamente.");
            break;
        }
      } while (continuaPergunta);
    } while (continuaCelular);
    sc.close();
  }
}
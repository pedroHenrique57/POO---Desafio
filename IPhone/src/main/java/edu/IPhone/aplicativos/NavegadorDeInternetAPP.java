package main.java.edu.IPhone.aplicativos;

import main.java.edu.IPhone.interfaces.NavegadorDeInternet;

public class NavegadorDeInternetAPP implements NavegadorDeInternet {

  public void exibirPagina() {
    System.out.println("Pagina exibida.");
  };

  public void adicionarNovaAba() {
    System.out.println("Aba Adicionada.");
  };

  public void atualizarPagina() {
    System.out.println("Pagina Atualizada.");
  };
}

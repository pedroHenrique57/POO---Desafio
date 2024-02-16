package main.java.edu.IPhone.aplicativos;

import main.java.edu.IPhone.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoAPP implements AparelhoTelefonico {

  public void ligar() {
    System.out.println("\nLigação Realizada.");
  }

  public void atender() {
    System.out.println("Ligação Atendida.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Correio de Voz iniciado.");
  }
}

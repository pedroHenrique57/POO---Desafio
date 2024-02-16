package main.java.edu.IPhone.aplicativos;

import main.java.edu.IPhone.interfaces.ReprodutorMusical;

public class ReprodutorMusicalAPP implements ReprodutorMusical {

  public void tocar() {
    System.out.println("Musica Tocando.");
  };

  public void pausar() {
    System.out.println("Musica Pausada.");
  };

  public void selecionarMusica() {
    System.out.println("Musica Selecionada.");
  };
}

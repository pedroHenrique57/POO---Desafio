package main.java.edu.IPhone.utils;

public class animacoes {

  public static void animacaoCarregamento(String frase, int timer) throws InterruptedException {
    // System.out.println("\n" + frase);
    for (int i = 0; i < 3; i++) {
      System.out.print("\r"+ frase + " [#     ]");
      Thread.sleep(timer);
      System.out.print("\r"+ frase + " [##    ]");
      Thread.sleep(timer);
      System.out.print("\r"+ frase + " [###   ]");
      Thread.sleep(timer);
      System.out.print("\r"+ frase + " [####  ]");
      Thread.sleep(timer);
      System.out.print("\r"+ frase + " [##### ]");
      Thread.sleep(timer);
      System.out.print("\r"+ frase + " [######]");
      Thread.sleep(timer);
      System.out.print("\033[2K");
    }
  }
}

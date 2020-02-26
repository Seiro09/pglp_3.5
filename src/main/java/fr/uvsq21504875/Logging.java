package fr.uvsq21504875;

import java.time.LocalDateTime;

public class Logging implements Message{

  protected String message;

  public void afficheMessage(String s) {
    System.out.println(LocalDateTime.now() + ": " +  s);
  }
}

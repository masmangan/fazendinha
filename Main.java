public class Main {
  public static void main(String[] args) {
    Animal olivia = new Cat("Olivia");
    Cat buba = new Cat("Buba");
    Dog jujubinha = new Dog("Jujubinha");
    Radio continental = new Radio(" ");

    Talker[] animais = { olivia, buba, jujubinha, continental };

    for (int i = 0; i < animais.length; i++) {
      if (animais[i] instanceof Cat) {
        ((Cat) animais[i]).eat();
      }
      animais[i].talk();
    }

    //continental.talk();
  }
}
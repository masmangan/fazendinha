public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void talk() {
    System.out.printf("%s diz Auuu!!%n", this.name);
  }
}

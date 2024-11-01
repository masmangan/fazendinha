public class Cat extends Animal {

  public Cat(String name) {
    super(name);
    //super();
  }

  @Override
  public void talk() {
    System.out.printf("%s diz Miauuu!!%n", this.name);
  }

  public void eat() {
    System.out.printf("%s comeu ração de gato%n", this.name);
  }
}

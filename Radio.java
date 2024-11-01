
public class Radio implements Talker {
    private String name;

    private void checkName(String name) {
        if (name == null) {
            IllegalArgumentException e = new IllegalArgumentException("O nome não pode ser null!");
            throw e;
        }
        if (name.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException("O nome não pode estar em branco!");
            throw e;
        } 
    }
    
    public Radio(String name) {
        checkName(name);
        this.name = name;
    }

    public void talk() {
        System.out.printf("%s toca música...%n", this.name);
    }
}

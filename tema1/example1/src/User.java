public class User {
    // atributos
    private String nickName;
    private String email;
    private String name;
    private String lastName;
    private Integer Age;
    private Boolean gener;
    private String password;
    private String ci;
    public User (String nickName, String name, String email, String password) {
        this.nickName = nickName;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void greetings() {
        System.out.println("Hola soy " + this.name + " y mi nick name es " + this.nickName);
    }
    static void test() {
        System.out.println("Hola soy un metodo estatico");
    }
}

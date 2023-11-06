package data;

public class Player {
    private String nickName;
    private Integer id;
    private String password;
    private String email;
    private String name;
    private String lastName;
    private String country;
    public Player(
        Integer id, 
        String nickName, 
        String password, 
        String email,
        String lastName,
        String country) {
            this.id = id;
            this.country = country;
            this.email = email;
            this.lastName = lastName;
            this.password = password;
            this.nickName = nickName;
    }
    public void printAttributes() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("id " + this.getId());
        System.out.println("email " + this.getEmail());
        System.out.println("nickname " + this.getNickName());
        System.out.println("country " + this.getCountry());
        System.out.println("lastname " + this.getLastName());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
}

// Lớp Student sẽ được ghi vào file
public class Person implements java.io.Serializable {
    private String name;
    private int age;
    private String role;

    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Getters và setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
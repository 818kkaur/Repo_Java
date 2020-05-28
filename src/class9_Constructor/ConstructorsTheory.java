package class9_Constructor;

public class ConstructorsTheory extends parent_constructor{
    String name;

//    private ConstructorsTheory() {
//
//        System.out.println("User defined empty constructor");
//    }

    public ConstructorsTheory(String name) {
        this.name = name;

    }


    public void setUsername(String username) {
        name = username;
    }

    public void displayName() {
        System.out.println(name);
    }
}





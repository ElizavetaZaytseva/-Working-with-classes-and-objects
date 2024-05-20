package app;

public class Person {

    private final int id;
    private String name;
    private int age;
    private String profession;

    //  с параметрами
    public Person(int id,
                  String name,
                  int age,
                  String profession) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // по умолчанию
    public Person() {
        this.id = 0;
        this.name = null;
        this.age = 0;
        this.profession = null;
    }

    // фомат печати
    public String toString() {
        return "ID: " + id + " "
                + "Name: " + name + " "
                + "Age: " + age + " "
                + "Profession: " + profession;

    }
    // замена профессии
       public void setProfession(String newProfession) {
     this.profession = newProfession;

    }
}







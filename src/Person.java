public class Person {
    private String name;

    public String getName(){
    //TODO: return the person's name
        return name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s", name);
    }

    public Person (String name){
        this.name = name;
    }

    public static void main(String[] args) {
    Person person = new Person("Hung");
        person.sayHello();

    }
}

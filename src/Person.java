public class Person {

    public String name;

    public Person(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void changeString(String string){
        string = "New String";
    }

    public static void changeInt(Integer string){
        string = 100;
    }

    public static void main(String[] args){
        Person person = new Person("Rawnak");
        AnotherPerson anotherPerson = new AnotherPerson();
        anotherPerson.changePersonName(person);
        System.out.println(person.name);

        String string = "My String";
        Person.changeString(string);
        System.out.println(string);

        Integer i = 0;
        Person.changeInt(i);
        System.out.println(i);

//        Person person1 = person;
//        person1.setName("xyz");
//        System.out.println(person.name);
    }

}

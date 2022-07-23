public class AnotherPerson {

    public void changePersonName(Person copyOfObject){
//        copyOfObject.setName("Rahman");
        copyOfObject = new Person("Rahman");
//        System.out.println(copyOfObject.name);
    }
}

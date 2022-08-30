public class Person {
    private String lastname;
    private String firstname;
    private int age;
    private int elements;

    public Person(String last, String first, int a){
        lastname = last;
        firstname = first;
        age = a;
        elements = 0;
    }
    public void displayPerson(){
        System.out.println("Show lastname " + lastname);
        System.out.println("Show firstname " + firstname);
        System.out.println("Show age " + age);
    }
        public String getLastname(){
        return lastname;
        }


}
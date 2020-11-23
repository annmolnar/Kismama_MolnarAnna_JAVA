package osztalyokEsObjektumok.references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3 = new Person("Arielle", 16);
        person1 = person3;
        person2=person1;
        person2.setName("Elza");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int age1 = 24;
        int age2 = age1;
        age2+=1;
        System.out.println(age1);
        System.out.println(age2);

        Person person4 = new Person("Belle", 18);
        person2 = person4;
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int a = 6;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        a = 3;
        System.out.println(a);
        System.out.println(b);



    }
}

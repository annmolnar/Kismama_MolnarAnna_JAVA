package osztalyokEsObjektumok.attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.id="CCC111";
        person.name="Anna";
        System.out.println(person.personToString());

        Address address1 = new Address("HU", "BP", "2 Hős street", "9131");
        System.out.println(address1.addressToString());
        person.moveTo(address1);
        address1.correctData("USA", "NY","5 55th Street", "HAC5111");
        System.out.println(address1.addressToString());
        System.out.println(person.getAddress().addressToString());


    }
}

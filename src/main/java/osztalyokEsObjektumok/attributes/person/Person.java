package osztalyokEsObjektumok.attributes.person;



public class Person {
    String name;
    String id;
    Address address;
    public String personToString(){
        return name.toString()+ " " + id.toString();

    }

    public void moveTo(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void correctData(String name, String id){
        this.name=name;
        this.id=id;
    }
}

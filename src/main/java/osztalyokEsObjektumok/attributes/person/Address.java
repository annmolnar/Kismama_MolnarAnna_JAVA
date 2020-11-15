package osztalyokEsObjektumok.attributes.person;

public class Address {
    String country;
    String city;
    String streetAndNumber;
    String zipCode;
    public String addressToString(){
        return country.toString()+" "+city.toString()+" "+streetAndNumber.toString()+" "+zipCode.toString();
    }

    public Address(String country, String city, String streetAndNumber, String zipCode){
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    }
    public String getStreetAndNumber(){
        return streetAndNumber;
    }
    public String getZipCode(){
        return zipCode;
    }

    public void correctData(String data, String newData){
        data = data;
        newData = newData;
    }

    public void correctData(String country,String city,String streetAndNumber, String zipCode ) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }


}

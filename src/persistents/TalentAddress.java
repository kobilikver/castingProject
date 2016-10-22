package persistents;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class TalentAddress {
    private int id;
    private String countryCode;
    private String city;
    private String street;
    private int entrance;
    private int floor;
    private int apartment;

    public TalentAddress(){}

    public TalentAddress(int id, String countryCode, String city, String street, int entrance,int floor, int apartment){
        this.id = id;
        this.countryCode = countryCode;
        this.entrance = entrance;
        this.apartment = apartment;
        this.city = city;
        this.street = street;
        this.floor = floor;
    }

    /*public static String getCountryBySign(String sign){
        return country.get(sign);
    }

    public static String getSignByCountry(String country){
        return country.get();
    }*/

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the entrance
     */
    public int getEntrance() {
        return entrance;
    }

    /**
     * @param entrance the entrance to set
     */
    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return the apartment
     */
    public int getApartment() {
        return apartment;
    }

    /**
     * @param apartment the apartment to set
     */
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}

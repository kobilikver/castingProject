package persistents;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class TalentContact {
    private int id;
    private int phone;
    private String email;

    public TalentContact(){}

    public TalentContact(int id, int phone, String email){
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

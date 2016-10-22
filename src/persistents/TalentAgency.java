package persistents;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class TalentAgency {
    private int id;
    private boolean isAgency;
    private String agencyName;
    private String agencyContactName;
    private int agencyPhone_1;
    private int agencyPhone_2;
    private String agencyAddress;

    public TalentAgency(){}

    public TalentAgency(int id, boolean isAgency, String agencyName, String agencyContactName, int agencyPhone_1, int agencyPhone_2,String agencyAddress ){
        this.id = id;
        this.isAgency = isAgency;
        this.agencyName = agencyName;
        this.agencyContactName = agencyContactName;
        this.agencyPhone_1 = agencyPhone_1;
        this.agencyPhone_2 = agencyPhone_2;
        this.agencyAddress = agencyAddress;

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
     * @return the isAgency
     */
    public boolean isIsAgency() {
        return isAgency;
    }

    /**
     * @param isAgency the isAgency to set
     */
    public void setIsAgency(boolean isAgency) {
        this.isAgency = isAgency;
    }

    /**
     * @return the agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * @param agencyName the agencyName to set
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * @return the agencyContactName
     */
    public String getAgencyContactName() {
        return agencyContactName;
    }

    /**
     * @param agencyContactName the agencyContactName to set
     */
    public void setAgencyContactName(String agencyContactName) {
        this.agencyContactName = agencyContactName;
    }

    /**
     * @return the agencyPhone_1
     */
    public int getAgencyPhone_1() {
        return agencyPhone_1;
    }

    /**
     * @param agencyPhone_1 the agencyPhone_1 to set
     */
    public void setAgencyPhone_1(int agencyPhone_1) {
        this.agencyPhone_1 = agencyPhone_1;
    }

    /**
     * @return the agencyPhone_2
     */
    public int getAgencyPhone_2() {
        return agencyPhone_2;
    }

    /**
     * @param agencyPhone_2 the agencyPhone_2 to set
     */
    public void setAgencyPhone_2(int agencyPhone_2) {
        this.agencyPhone_2 = agencyPhone_2;
    }

    /**
     * @return the agencyAddress
     */
    public String getAgencyAddress() {
        return agencyAddress;
    }

    /**
     * @param agencyAddress the agencyAddress to set
     */
    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }
}

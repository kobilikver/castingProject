package persistents;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class Talent {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private List<TalentAddress> address;
    private TalentAgency agency;
    private List<TalentContact> contact;
    private String gender;
    private String job;
    private String typecastAge;
    private String typecastVocal;
    private String typecastSing;
    private List<String> languages;
    private List<String> accents;
    private boolean celeb;
    private boolean singer;
    private boolean sings;
    private boolean rapper;
    private boolean narrator;
    private boolean comedian;
    private boolean copycat;
    private boolean versatile;
    private List<Role> roles;
    private List<Role> nominated;

    public Talent(){}

    public String BirthdayToString(){
        SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
        return s.format(this.getBirthday());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public List<TalentAddress> getAddress() {
        return address;
    }

    public void setAddress(List<TalentAddress> newAddress) {
    /*if(this.address == null){
        this.address = new ArrayList<TalentAddress>();
    }*/
        this.address = newAddress;
    }

    public TalentAgency getAgency() {
        return agency;
    }

    public void setAgency(TalentAgency agency) {
        this.agency = agency;
    }

    public List<TalentContact> getContact() {
        return contact;
    }

    public void setContact(List<TalentContact> newContact) {
    /*if(this.contact == null){
        this.contact = new ArrayList<TalentContact>();
    }*/
        this.contact=newContact;
    }

    public String getTypecastAge() {
        return typecastAge;
    }

    public void setTypecastAge(String typecastAge) {
        this.typecastAge = typecastAge;
    }

    public String getTypecastVocal() {
        return typecastVocal;
    }

    public void setTypecastVocal(String typecastVocal) {
        this.typecastVocal = typecastVocal;
    }

    public String getTypecastSing() {
        return typecastSing;
    }

    public void setTypecastSing(String typecastSing) {
        this.typecastSing = typecastSing;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getAccents() {
        return accents;
    }

    public void setAccents(List<String> accents) {
        this.accents = accents;
    }

    public boolean isCeleb() {
        return celeb;
    }

    public void setCeleb(boolean celeb) {
        this.celeb = celeb;
    }

    public boolean isSinger() {
        return singer;
    }

    public void setSinger(boolean singer) {
        this.singer = singer;
    }

    public boolean isSings() {
        return sings;
    }

    public void setSings(boolean sings) {
        this.sings = sings;
    }

    public boolean isRapper() {
        return rapper;
    }

    public void setRapper(boolean rapper) {
        this.rapper = rapper;
    }

    public boolean isNarrator() {
        return narrator;
    }

    public void setNarrator(boolean narrator) {
        this.narrator = narrator;
    }

    public boolean isComedian() {
        return comedian;
    }

    public void setComedian(boolean comedian) {
        this.comedian = comedian;
    }

    public boolean isCopycat() {
        return copycat;
    }

    public void setCopycat(boolean copycat) {
        this.copycat = copycat;
    }

    public boolean isVersatile() {
        return versatile;
    }

    public void setVersatile(boolean versatile) {
        this.versatile = versatile;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public void removeRole(Role role) {
        this.roles.remove(role);
    }

    public List<Role> getNominated() {
        return nominated;
    }

    public void setNominated(List<Role> nominated) {
        this.nominated = nominated;
    }

    public void addNominated(Role nominated) {
        this.nominated.add(nominated);
    }

    public void removeNominated(Role nominated) {
        this.nominated.remove(nominated);
    }
}

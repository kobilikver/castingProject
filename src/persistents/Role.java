package persistents;
import java.util.List;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class Role {
    private int pid; //the id of the project it belong
    private String name;
    private String typecastAge;
    private String typecastVocal;
    private String typecastSing;
    private String language;
    private String accent;
    private boolean celeb;
    private boolean singer;
    private boolean sings;
    private boolean rapper;
    private boolean narrator;
    private boolean comedian;
    private boolean copycat;
    private boolean versatile;
    private String notes;
    private List<Talent> nominees;
    private List<Talent> talents;

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Talent> getNominees() {
        return nominees;
    }

    public void setNominees(List<Talent> nominees) {
        this.nominees = nominees;
    }

    public void addNominee(Talent nominee) {
        this.nominees.add(nominee);
    }

    public void removeNominee(Talent nominee) {
        this.nominees.remove(nominee);
    }

    public void clearNominees() {
        this.nominees.clear();
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }

    public void addTalent(Talent talent) {
        this.talents.add(talent);
    }

    public void removeTalent(Talent talent) {
        this.talents.remove(talent);
    }

    public void clearTalents() {
        this.talents.clear();
    }

    /**
     * @return the pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }
}

package persistents;

import java.sql.Date;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Created by kobi626 on 17/10/2016.
 */
public class Project {
    private int pid;
    private String titleHebrew;
    private String titleEnglish;
    private String status;
    private Date dateOfRelease;
    private Date dateOfStart;
    private Date dateOfDeliver;
    private String type;
    private String supplier;
    private String client;
    private List<Role> roles;
    private List<Project> relatedProjects;
    // ... (pricing issues etc.)

    public Project(){}

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return getTitleHebrew();
    }

    public void setTitle(String title) {
        this.setTitleHebrew(title);
    }

    public String getTitleHebrew() {
        return titleHebrew;
    }

    public void setTitleHebrew(String titleHebrew) {
        this.titleHebrew = titleHebrew;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfDeliver() {
        return dateOfDeliver;
    }

    public void setDateOfDeliver(Date dateOfDeliver) {
        this.dateOfDeliver = dateOfDeliver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public void clearRoles() {
        this.roles.clear();
    }

    public List<Project> getRelatedProjects() {
        return relatedProjects;
    }

    public void setRelatedProjects(List<Project> relatedProjects) {
        this.relatedProjects = relatedProjects;
    }
}

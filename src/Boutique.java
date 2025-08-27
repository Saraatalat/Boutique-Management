package src;
public class Boutique {
    private int boutiqueId;
    private String ownerName;
    private String boutiqueName;
    private String boutiqueType;
    private String description;
    private String location;

    public Boutique() {}

    public Boutique(int boutiqueId, String ownerName, String boutiqueName, String boutiqueType, String description, String location) {
        this.boutiqueId = boutiqueId;
        this.ownerName = ownerName;
        this.boutiqueName = boutiqueName;
        this.boutiqueType = boutiqueType;
        this.description = description;
        this.location = location;
    }

    public int getBoutiqueId() {
        return boutiqueId;
    }

    public void setBoutiqueId(int boutiqueId) {
        this.boutiqueId = boutiqueId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBoutiqueName() {
        return boutiqueName;
    }

    public void setBoutiqueName(String boutiqueName) {
        this.boutiqueName = boutiqueName;
    }

    public String getBoutiqueType() {
        return boutiqueType;
    }

    public void setBoutiqueType(String boutiqueType) {
        this.boutiqueType = boutiqueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

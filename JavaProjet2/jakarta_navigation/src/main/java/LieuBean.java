import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class LieuBean implements Serializable {

    private String nom;
    private String description;
    private double latitude;
    private double longitude;

    // Liste pour stocker les lieux ajoutés
    private List<Lieu> lieux = new ArrayList<>();

    // Getter et Setter pour les propriétés
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Getter pour la liste des lieux
    public List<Lieu> getLieux() {
        return lieux;
    }

    // Méthode pour ajouter un lieu
    public void ajouterLieu() {
        // Ajout d'un nouveau lieu à la liste
        lieux.add(new Lieu(nom, description, latitude, longitude));
        
        // Réinitialiser les champs après ajout
        nom = "";
        description = "";
        latitude = 0;
        longitude = 0;
    }

    // Classe interne pour représenter un Lieu
    public static class Lieu {
        private String nom;
        private String description;
        private double latitude;
        private double longitude;

        public Lieu(String nom, String description, double latitude, double longitude) {
            this.nom = nom;
            this.description = description;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        // Getters pour chaque attribut
        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}

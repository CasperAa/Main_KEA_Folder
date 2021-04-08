package Files_Exceptions.StarWars;

public class Characters {

    private String name;
    private int height;
    private int mass;
    private String hair_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeWorld;
    private String species;

    public Characters (String name, int height, int mass, String hair_color, String eye_color, String birth_year, String gender, String homeWorld, String species){
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeWorld = homeWorld;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getSpecies() {
        return species;
    }

    public String getHomeWorld() {
        return homeWorld;
    }

    public String getGender() {
        return gender;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getHair_color() {
        return hair_color;
    }

    public int getMass() {
        return mass;
    }
    public String getEye_color(){
        return eye_color;
    }
}

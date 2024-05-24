public class Plant {
    private String name;
    private String latinName;
    private boolean plantLife;
    private String location;
    private double height;
    private boolean edible;

    public Plant() {

    }

    public Plant(String name, String latinName, boolean plantLife
            , String location, double height, boolean edible) {
        this.name = name;
        this.latinName = latinName;
        this.plantLife = plantLife;
        this.location = location;
        this.height = height;
        this.edible = edible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.getName();
    }

    public void setLatinNamea(String latinName) {
        this.latinName = latinName;
    }

    public String getLatinName() {
        return this.getLatinName();
    }

    public void setPlantLife(boolean plantLife) {
        this.plantLife = plantLife;
    }

    public void grow() {
        if (plantLife) {
            System.out.println("Annual");
        } else {
            System.out.println("Perennial");
        }
    }

    public String getPlantLife() {
        return this.getPlantLife();

    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.getLocation();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return this.getHeight();
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public String getEdible() {
        return this.getEdible();
    }

    @Override
    public String toString() {
        String edible = (edible) ? "edible" : "inedible";
        return "Plants: " +
                "Plant name: " + name +
                ", plant name in latin: " + latinName +
                ", is the plant an annual: " + plantLife +
                ", plants location: " + location +
                ", plant height in meters: " + height + " m. " +
                ", is the plant edible: " + edible +
                ' ';
    }

}

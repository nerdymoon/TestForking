public class Country {
    private String name;
    private int year;
    private String gender;
    private double readingRate;

    public Country(String name, int year, String gender, double readingRate) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.readingRate = readingRate;
    }
    

    @Override
    public String toString() {
        return this.name+" ("+this.year+"), "+this.gender+", "+this.readingRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getReadingRate() {
        return readingRate;
    }

    public void setReadingRate(double readingRate) {
        this.readingRate = readingRate;
    }
    

    

    
    
}

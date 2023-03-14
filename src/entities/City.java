package entities;

public class City {
    Integer ID; //PK
    String Name;
    String CountryCode;
    String District;
    Integer Population;

    public Integer getID(){
        return ID; }

    public void setID(Integer passedID) {
        this.ID = passedID; }

    public String getName() {
        return Name;}

    public void setName(String passedName) {
        this.Name = passedName; }

    public String getCountryCode() {
        return CountryCode; }

    public void setCountryCode(String countryCode) {
        this.CountryCode = countryCode; }

    public String getDistrict() {
        return District; }

    public void setDistrict(String district) {
        this.District = district; }

    public Integer getPopulation() {
        return Population; }

    public void setPopulation(Integer population) {
        this.Population = population; }
}

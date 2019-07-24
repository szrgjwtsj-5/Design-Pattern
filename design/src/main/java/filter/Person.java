package filter;

public class Person {
    private String name;
    private String gender;
    private String marital;

    public Person(String name, String gender, String marital) {
        this.name = name;
        this.gender = gender;
        this.marital = marital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }
}

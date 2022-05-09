package VariousStructures.oneOnOne;

public class TeamMate {
    int id;
    String firstname;
    String lastname;
    String gender;
    boolean isMember;

    public TeamMate(int id, String firstname, String lastname, String gender, boolean isMember) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.isMember = isMember;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMember() {
        return isMember;
    }

    @Override
    public String toString() {
        return "TeamMate{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", isMember=" + isMember +
                '}';
    }
}

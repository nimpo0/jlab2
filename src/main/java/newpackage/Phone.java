package newpackage;

public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int accountNum;
    private int timeForTownTalks;
    private int longDistanceCallTime;

    public Phone(int id, String lastName, String firstName, String middleName, int accountNum, int timeForTownTalks, int longDistanceCallTime){
        setValue(id , lastName, firstName, middleName, accountNum, timeForTownTalks, longDistanceCallTime);
    }

    public void setValue(int id, String lastName, String firstName, String middleName, int accountNum, int timeForTownTalks, int longDistanceCallTime){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.accountNum = accountNum;
        this.timeForTownTalks = timeForTownTalks;
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public int getId(){
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getTimeForTownTalks() {
        return timeForTownTalks;
    }

    public int getLongDistanceCallTime() {
        return longDistanceCallTime;
    }

    public String toString() {
        return "\nPhone id - " + id +
                ", last name - " + lastName +
                ", first name - " + firstName +
                ", middle name - " + middleName +
                ", account number - " + accountNum +
                ", time for town talks - " + timeForTownTalks +
                ", long distance call time - " + longDistanceCallTime;
    }
}

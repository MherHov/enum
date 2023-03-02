package dayOfWeek;

public enum DayOfTheWeek {
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);
    private final String name;
    private final int numberOfDay;
    DayOfTheWeek(String name,int numberOfDay){
        this.name = name;
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}

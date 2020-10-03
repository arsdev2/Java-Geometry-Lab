public class WeekDate extends Date {

    private int weekNumber = 0;

    public WeekDate(int day, int month, int year) {
        super(day, month, year);
        this.weekNumber = getWeekNumber();
    }

    public int getWeekNumber(){
        weekNumber = getMonth()*4;
        weekNumber +=getDay() /7;
        return weekNumber;
    }

    @Override
    public int getDay() {
        return super.getDay();
    }

    @Override
    public int getMonth() {
        return super.getMonth();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public String toString() {
        return String.format("%s.%s.%s - %s", getDay(), getMonth(), getYear(), weekNumber);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static Date initDate(int day, int month, int year) throws IllegalArgumentException{
        if(day > 31 || month > 12 || (month == 2 && day > 29) || (day <=0 || month <=0 || year <=0)){
            throw new IllegalArgumentException();
        }
        return new Date(day, month, year);
    }

    public static boolean dateEquals(Date date1, Date date2){
        return date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() == date2.getDay();
    }

    public static boolean dateBigger(Date date1, Date date2){
        int year1 = date1.getYear(), year2 = date2.getYear(), month1 = date1.getMonth(), month2 = date2.getMonth(),
                day1 = date1.getDay(), day2 = date1.getDay();
        if(year1 == year2 && month1 == month2 && day1 == day2){return false;}
        return date1.getYear() > date2.getYear() || (date1.getMonth() > date2.getMonth()) ||  (day1 > day2);
    }
    public static boolean dateSmaller(Date date1, Date date2){
        int year1 = date1.getYear(), year2 = date2.getYear(), month1 = date1.getMonth(), month2 = date2.getMonth(),
                day1 = date1.getDay(), day2 = date1.getDay();
        if(year1 == year2 && month1 == month2 && day1 == day2){return false;}
        return date1.getYear() < date2.getYear() || (date1.getMonth() < date2.getMonth()) ||  (day1 < day2);    }

    public static int daysBetween(Date date1, Date date2){
        int averageDays = 0;
        int countOfYears = date2.getYear() - date1.getYear();
        averageDays += countOfYears*365;
        int countOfMonths = date2.getMonth() - date1.getMonth();
        averageDays += countOfMonths*31;
        averageDays += date2.getDay() - date1.getDay();
        return averageDays;
    }

    public static ArrayList<Date> sortByYear(ArrayList<Date> dates){
        ArrayList<Date> resultDates = new ArrayList<>();
        ArrayList<Integer> yearsList = new ArrayList<>();
        ArrayList<Integer> monthsList = new ArrayList<>();
        for(Date date : dates){
            yearsList.add(date.getYear());
            monthsList.add(date.getMonth());
        }
        Collections.sort(yearsList);
        Collections.reverse(yearsList);
        Collections.sort(monthsList);
        Collections.reverse(monthsList);
        for(int i = 0;i<dates.size();i++){
            Date date = dates.get(i);
            Date resultDate = new Date(date.getDay(),monthsList.get(i), yearsList.get(i));
            resultDates.add(resultDate);
        }
        return resultDates;
    }

    public static int getCountOfUniqueValues(HashMap<String, String> map){
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, String> el : map.entrySet()){
            if(!list.contains(el.getValue())){
                list.add(el.getValue());
            }
        }
        return list.size();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}

import java.util.ArrayList;
import java.util.HashMap;

public class DataMain {

    public static void main(String[] args) {
        Date date1 = new Date(31, 1, 2001);
        try{
            Date date2 = Date.initDate(311, 1, 2001);
            Date date3 = Date.initDate(31, 13, 2001);
            Date date4= Date.initDate(31, 1, -12);
        }catch (Exception e){
            System.out.println("Success");
        }
        Date date5 = new Date(11, 1, 2011);
        Date date6 = new Date(11, 1, 2011);
        if(Date.dateEquals(date5, date6)){
            System.out.println("Success_equals");
        }
       if(Date.dateBigger(new Date(11, 1, 2018),new Date(13, 1, 2017)) ){
           System.out.println("Success_bigger");
       }
       if(Date.dateSmaller(new Date(31, 12, 2010), new Date(1, 1, 2011))){
           System.out.println("Success_smaller");
       }
        System.out.println("Days between - " + Date.daysBetween(Date.initDate(12, 3,2011), Date.initDate(27, 4, 2014)));

        ArrayList<Date> dates = new ArrayList<>();
        System.out.println("Before sorting");
        Date date7 = Date.initDate(11, 11, 2018);
        Date date8 = Date.initDate(11, 8, 2011);
        Date date9 = Date.initDate(11, 1, 2009);
        Date date10 = Date.initDate(11, 10, 2010);
        Date date11 = Date.initDate(11, 7, 2001);
        dates.add(date7);
        dates.add(date8);
        dates.add(date9);
        dates.add(date10);
        dates.add(date11);
        System.out.println("--------BEFORE-------------");
        for(Date date : dates){
            System.out.println(String.format("%s.%s.%s", date.getDay(), date.getMonth(), date.getYear()));
        }
        System.out.println("------------------------------------");
        System.out.println("-------------AFTER SORTING-------------------");
        ArrayList<Date> sortedList = Date.sortByYear(dates);
        for(Date date : sortedList){
            System.out.println(String.format("%s.%s.%s", date.getDay(), date.getMonth(), date.getYear()));
        }
        System.out.println("----------------------------------------------");
        System.out.println(new WeekDate(12, 10, 2010));

        HashMap<String, String> data = new HashMap<>();
        data.put("apple", "red");
        data.put("mandarin", "org");
        data.put("mandarinos", "org");
        data.put("applos", "red");
        System.out.println(String.format("Count of unique values - %s", Date.getCountOfUniqueValues(data)));

    }

}

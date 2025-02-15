import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前时间: " + date.toString());
        System.out.println("毫秒数: " + date.getTime());

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("当前日期: "+ year + "-" + month + "-" + day);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("明天日期: " + calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH));


        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        String formattedDate = sdf.format(date1);
        System.out.println("格式化后的日期: " + formattedDate);

        try {
            Date parsedDate = sdf.parse(formattedDate);
            System.out.println("解析后的日期: " + parsedDate.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("当前日期: " + currentDate.toString());
        System.out.println("当前日期: " + currentTime.toString());
        System.out.println("当前日期时间: " + currentDateTime.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("格式化后的日期时间: " + formattedDateTime);



    }
}

package selfwork20.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatData {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        String text = dtf.format(LocalDateTime.of(2001,5,1,23,56));
        System.out.println(text);
    }
}

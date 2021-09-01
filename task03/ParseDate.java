package selfwork20.task03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/d hh:mm:ss a");
        LocalDateTime localDateTime1 = LocalDateTime.parse("1999/июн./18 07:34:56 PM", formatter);
        System.out.println(localDateTime1);
        //Когда парсю Jun то выдает ошибку, когда поменял Jun на июн. все заработало
        //я так понимаю это от настройки ПК зависит
    }
}

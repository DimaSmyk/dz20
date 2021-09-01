package selfwork20.task01;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeBetweenLecture {

    public static void main(String[] args) {
        LocalDateTime firstLesson = LocalDateTime.of(2021,8,2,20, 0);
        LocalDateTime secondLesson = LocalDateTime.of(2021,8,7,14,0);

        Duration duration = Duration.between(firstLesson,secondLesson);
        System.out.println("Days: " + duration.toDays());
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Seconds: " + duration.toSeconds());

    }
}

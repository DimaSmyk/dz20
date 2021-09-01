package selfwork20.task02;

import java.time.Duration;
import java.time.LocalDateTime;

public class LectureTime {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2021,8,7,20, 0);
        LocalDateTime finish = LocalDateTime.of(2021,8,7,22,0);

        Duration duration = Duration.between(start,finish);
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Seconds: " + duration.toSeconds());
    }
}

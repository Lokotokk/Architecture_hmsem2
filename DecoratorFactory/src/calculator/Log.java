package calculator;

public class Log implements Logger {
    LocalDateTime localDateTime;

    @Override
    public void writeLog(String str) {
        System.out.println(LocalDateTime.now() + ":" + str);
    }
}

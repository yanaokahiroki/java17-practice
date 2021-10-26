import java.time.DayOfWeek;

/**
 * JEP361 Switch Expressions
 * 
 * Switchを式として表現できるようになった。
 * caseのラベルをコンマ区切りで複数指定できる。
 * ラムダ式のように「->」で処理を書ける。
 * 複数行の処理の場合には波カッコでブロックにできる。
 * (その場合にはyieldで値を返す)
 * 下記の例の場合には不要だがdefaultも書ける。
 */
public class JEP361{
  public static boolean isBusinessDay(DayOfWeek dayOfWeek) {
    return switch (dayOfWeek) {
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
      case SATURDAY, SUNDAY -> {
        System.out.println("休日です。");
        yield false;
      }
      default -> false;
    };
  }
}

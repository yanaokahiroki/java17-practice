/**
 * JEP394 Pattern Matching for instanceof
 * 
 * instanceofを使った型判断の際にcastが必要なくなった。
 * 下記の例では条件の中でString型のnameを宣言しているため、
 * 従来のようにわざわざcastすることなくnameを使うことができる。
 */
public class JEP394 {
  public static String castType(Object object) {
    if (object instanceof String name) {
      return name;
    }
    return "NotString";
  }
}

/**
 * JEP378 Text Blocks
 * 
 * テキストブロックで複数行の文字列リテラルを簡単に扱えるようになった。
 * 下記の例ではJSON風文字列。
 * エスケープシーケンス「\n」が必要なく読みやすく書けるようになった。
 * Stringクラスのインスタンスメソッドformatted()を使うことでテキストブロック内に変数を使える。
 */
public class JEP378 {
  public static String getMyProfile(String name) {
    String profileJson = """
    {
      "name": "%s",
      "birthDay": "19XX-10-20",
      "age": 25,
      "sex": "male",
      "postalCode": "111-1111",
      "adddress": "Tokyo"
    }
    """.formatted(name);
    return profileJson;
  }
}

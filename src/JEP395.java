/**
 * JEP395 Records
 * 
 * イミュータブルなクラスをレコードで定義できるようになった。
 * コンストラクタ、ゲッター、hashCode()、equals()、toString()を書かなくていい。
 * フィールドは丸カッコ(レコードヘッダー)に書く。
 * レコードヘッダー内の「型 変数名」はレコードコンポーネント。
 * 特別なコンストラクタは自分で定義することもできる。
 * 値の取得はgetXXXではなくフィールド名と同じになる。
 * 下記の例ではProduct.title()で取得できる。
 */
record Product(String title, String body, int price, int stock){}

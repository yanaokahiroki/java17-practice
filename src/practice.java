import java.time.LocalDate;

public class practice{
  public static void main(String[] args) {
    System.out.println(JEP361.isBusinessDay(LocalDate.now().getDayOfWeek()));
    System.out.println(JEP378.getMyProfile("Hiroki Yanaoka"));
    System.out.println(JEP394.castType(1));
    Product product = new Product("Galaxy S21", "カメラがさらに進化したGalaxy S21は、これまでにない写真撮影を可能に。", 118_540, 100);
    System.out.printf("タイトル：%s, 在庫数：%d",product.title(),product.stock());
  }
}

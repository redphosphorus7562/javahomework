import java.util.Date;
public class time {
  public static void main(String[] args)
  {
      int a=10000;
      for(int i=0;i<8;i++) {
          Date d = new Date(a);
          System.out.println(d.toString());
          a*=10;
      }
  }
}

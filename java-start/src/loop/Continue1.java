package loop;

public class Continue1 {

  public static void main(String[] args) {
    int i=1;

    while( i <= 5) {
      if( i == 3) {
        i++;   //-> 거짓이면 넘어가는거 , 3일때 continue 돼서 4가 찍히는거
        continue;
      }
      System.out.println(i);
      i++;
    }
  }
}

package scope;

public class Scope3_1 {
  public static void main(String[] args) {

    int m = 10;
    int temp = 0;
    if (m >0) { //if 조건이 맞으면  m 의 2배
      temp = m * 2;
      System.out.println("temp = " + temp);
    }
    System.out.println("m = " + m);
  }
}

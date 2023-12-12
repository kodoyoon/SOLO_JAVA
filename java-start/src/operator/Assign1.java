package operator;

public class Assign1 {
  public static void main(String[] args) {

    int a = 5;

    a += 3; // 8 ( 5+3)  a = a + 3, a랑 3을 먼저 더하고 그 결과를 a 에 대입해라
    a -= 2; //6
    a *= 4; //24
    a /= 3; //8
    a %= 5; //3
    System.out.println(a);


  }
}


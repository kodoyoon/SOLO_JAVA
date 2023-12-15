package method;

public class MethodValue3 {

  public static void main(String[] args) {
    int num1 = 5;
    System.out.println("changeNumber 호출 전, num1: " + num1); // 출력: 5
    num1 = changeNumber(num1); // 계산이 끝나면  10으로 치환
    System.out.println("changeNumber 호출 후, num1: " + num1); // 출력: 10
  }
  public static int changeNumber(int num2) { // 복사돼서 전달
    num2 = num2 * 2;
    return num2;
  }
}

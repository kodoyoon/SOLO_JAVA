package casting;

public class Casting2 {

  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;

     
//intValue = doubleValue; //컴파일 오류
    
    intValue = (int)doubleValue; //형변환
    // intValue = (int) 1.5;\
    //intValue = 1; (int)로 형변환한다.
    System.out.println("intValue = " + intValue);

  }
}

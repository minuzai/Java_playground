public class OperationBetweenDataType {
  public static void main(String[] args) {
    // 같은 자료형 간의 연산
    int value1 = 3 + 5;
    int value2 = 8 / 5;
    float value3 = 3.0F + 5.0F;
    double value4 = 8.0 / 5.0;

    byte data1 = 3;
    byte data2 = 5;
    // byte value5 = data1 + data2; // ERROR(byte + byte = int)
    int value5 = data1 + data2;

    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
    System.out.println(value4);
    System.out.println(value5);
    System.out.println();

    // 다른 자료형 간의 연산
    // int value6 = 5 + 3.5; // ERROR(int + double = double)
    double value6 = 5 + 3.5;
    int value7 = 5 + (int) 3.5;

    double value8 = 5 / 2.0; // int / double = double
    byte data3 = 3;
    short data4 = 5;
    int value9 = data3 + data4; // byte + short = int
    double value10 = data3 + data4; // byte + short = int -> double (up-casting)

    System.out.println(value6);
    System.out.println(value7);
    System.out.println(value8);
    System.out.println(value9);
    System.out.println(value10);
  }
}
import java.util.Scanner;

class Keyboard_input3 {
  public static void main(String[] args) {
    Scanner ob_sc = new Scanner(System.in);
    String name;
    int age;

    System.out.println("이름과 나이를 입력하세요.");

    age = ob_sc.nextInt();
    name = ob_sc.nextLine();

    System.out.println(name + "은 멋진 이름입니다.");
    System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");
  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        boolean inMainMenu = true;
        while (inMainMenu) {
            System.out.println("(I)ntro (C)ourses (E)xit");
            String stdStr = stdIn.next();
            switch (stdStr) {
                case ("I"):
                case ("i"):
                    System.out.println("안녕하세요! 우리는 코드잇입니다.\n" +
                            "함께 공부합시다!");
                    break;
                case ("C"):
                case ("c"):
                    boolean interCourseMenu = true;
                    while (interCourseMenu) {
                        System.out.println("코드잇 수업을 소개합니다.\n" + "(P)ython (J)ava (i)OS (B)ack");
                        String stdStr1 = stdIn.next();
                        switch (stdStr1) {
                            case ("P"):
                            case ("p"):
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                        "강사: 강영훈\n" +
                                        "추천 선수과목: 없음");
                                break;
                            case ("J"):
                            case ("j"):
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                        "강사: 김신의\n" +
                                        "추천 선수과목: Python");
                                break;
                            case ("I"):
                            case ("i"):
                                System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                        "강사: 성태호\n" +
                                        "추천 선수과목: Python, Java");
                                break;
                            case ("b"):
                            case ("B"):
                                interCourseMenu = false;
                                break;
                            default:
                                System.out.println("다시입력해주세요!");
                                break;
                        }
                    }
                    break;
                case ("E"):
                case ("e"):
                    System.out.println("E\n" +
                            "안녕히 가세요.");
                    inMainMenu = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요!");
                    break;
            }
        }
    }
}

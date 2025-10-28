import java.util.Scanner;

public class MiniGameMain {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 메뉴 [1] 업앤다운 [2] 가위바위보 [3] 숫자야구 [4] 종료
        // 각 게임이 끝나면 메뉴로 돌아오기
        // 유효하지 않은 입력은 전부 재입력 ex) 메뉴가 4개인데 1~4가 아닌 숫자가 들어옴 -> 재입력
        // 모든 게임은 메서드로 구현
        while (true) {
            System.out.println("[1] 업앤다운 [2] 가위바위보 [3] 숫자야구 [4] 종료");
            System.out.print(">> ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    upAndDown();
                    continue;
                case 2:
                    rsp();
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    private static void upAndDown() {
        // 업앤 다운
        // 컴터가 1~100 사이의 숫자를 랜덤 생성
        // 유저의 입력을 받고 1~100 사이가 아니라면 재입력 받기
        int comNum = (int)(Math.random() * 100 + 1);
        int count = 1;
        System.out.println("7번의 기회가 주어집니다.");
        while (true) {
            if (count == 8) {
                System.out.println("정답은 : " + comNum);
                System.out.println("실패");
                break;
            }
            System.out.println("---" + count + "번" + "---");
            System.out.print("숫자 입력 : ");
            int userNum = sc.nextInt();

            if (userNum > 100 || userNum < 0) {
                System.out.println("1 ~ 100까지의 숫자만 입력 하세요");
                continue;
            }
            if (comNum > userNum) {
                System.out.println("-업-");
                count++;

            } else if (comNum < userNum) {
                System.out.println("-다운-");
                count++;
            } else {
                System.out.println("정답!");
                break;
                }
            }
        }


    private static void rsp() {

    }
}


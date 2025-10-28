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
            switch (sc.nextInt()) {
                case 1:
                    upAndDown();
                    continue;
                case 2:
                    rsp();
                    continue;
                case 3:

                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static void upAndDown() {
        // 업앤 다운
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


    public static void rsp() {
        // 가위바위보
        System.out.println("----가위바위보----");
        while (true) {
            int user = 0;
            Integer comRsp = (int)(Math.random() * 3 + 1);
            System.out.print("가위바위보 선택 : ");
            String userRsp = sc.next();

            if (!(userRsp.equals("가위") || userRsp.equals("바위") || userRsp.equals("보"))) {
                System.out.println("가위, 바위, 보 중에서만 입력하세요");
                continue;
            }

            if (userRsp.equals("가위")) user = 1;
            if (userRsp.equals("바위")) user = 2;
            if (userRsp.equals("보")) user = 3;

                // 무승부
            if (user == comRsp) {
                System.out.println("무승부");
                continue;
                // 1 가위
            }
            if(comRsp == 1) {
                System.out.println("컴퓨터 : 가위");
                  if (user == 2) {
                    System.out.println("결과 : 이김");
                    break;
                } else {
                    System.out.println("결과 : 패배");
                }
                  // 2번 바위
            } else if (comRsp == 2) {
                System.out.println("컴퓨터 : 바위");
                if (user == 1) {
                    System.out.println("결과 : 패배");
                } else {
                    System.out.println("결과 : 이김");
                    break;
                }
                  // 3번 보
            } else {
                System.out.println("컴퓨터 : 보");
                if (user == 1) {
                    System.out.println("결과 : 이김");
                    break;
                } else {
                    System.out.println("결과 : 패배");
                }
            }
        }
    }
}


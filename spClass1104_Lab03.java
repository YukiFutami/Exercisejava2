import java.util.Scanner;

public class spClass1104_Lab03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 중 하나 입력
        //  - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해, 가위-바위-보 중 하나 선택
        // 결과 출력
        //  - 예 1) 승리 : 사용자 - 가위, 컴퓨터-보
        //  - 예 2) 패배 : 사용자 - 가위, 컴퓨터-바위
        //  - 예 3) 무승부 : 사용자 - 가위, 컴퓨터 가위
        // 그리고 게임 재실행

        // 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
        //  - Scissors, Rock, Paper 이외의 값이 입력 될 경우
        //    "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요"
        //    출력 후 재입력
        // "quit"를 입력하면 프로그램 종료
        int draw = 0;
        int win = 0;
        int lose = 0;


        // 무한루프
        while(true) {

            System.out.println("Scissors, Rock, Paper 중 하나를 입력 하세요");
            String userInput = sc.nextLine();

            // 예외 처리
            // 1: quit 이면 -> 프로그램 종료 -> break
            // 2: 잘못된 입력 -> 재입력 -> continue
            int userChoice;
            switch (userInput) {
                case "Scissors" -> userChoice = 0;
                case "Rock" -> userChoice = 1;
                case "Paper" -> userChoice = 2;
                case "quit" -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> {
                    System.out.println("재입력");
                    continue;
                }
            }
            System.out.println(userChoice);

            // 컴퓨터 선택 : 가위, 바위, 보 중 하나 선택
            // 난수 이용 : 0 ~ 2 사이 난수 발생 후 "가위, 바위, 보"에 매칭
            String sciRockPaer[] = {"Scissors", "Rock", "Paper"};
            int computerInput = (int) (Math.random() * 3);
            System.out.println("Computer is : " + sciRockPaer[computerInput]);

            // 승패 계산


            // 引き分け
            if (userChoice == computerInput){
                draw++;
            } else if ((userChoice == 0 && computerInput == 2) ||
                        (userChoice == 1 && computerInput == 0) ||
                        (userChoice == 2 && computerInput == 1)) {
                win++;
            } else {
                lose++;
            }

            // 결과 출력
            System.out.println("Win: " + win);
            System.out.println("lose: " + lose);
            System.out.println("Draw: " + draw);
        }

    }
}
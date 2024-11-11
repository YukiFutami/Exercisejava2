import java.util.Random;
import java.util.Scanner;

public class spClass1108_Lab02 {
    public static void main(String[] args){


        // 가위, 바위, 보 게임 만들기

        // 키보드로부타 Scissors, Rock, Paper를 입력받아,
        // 아래와 같이 결과를 출력하라
        // 예 1) 승리   - 사용자 : Scissors, 컴퓨터 : Paper
        // 예 2) 패배   - 사용자 : Scissors, 컴퓨터 : Rock
        // 예 3) 무승부  - 사용자 : Scissors, 컴퓨터 : Scissors

        // 고려사항
        // 1. 사용자로부터 입력 시 "Scissors, Rock, Paper" 이외 값은
        //    재입력 처리
        // 2. "Quit" 입력 전까지 계속해서 게임 실행

        // 3. 승리 시 보너스 포인트 1점 증가, 패배 시 보너스 포인트 1점 차감
        //    연속으로 승리 시 보너스 포인트 3점 추가
        // 4. 결과값 판별 후 현재 포인트 출력
        //    예) 현재포인트 : 1점
        // 5. 게임 종료 조건 추가
        //    사용자 포인트가 7점 이상 또는 -7점 이하이면 종료
        //     7점 이상이면 : "축하합니다. 승리~~~"
        //     -7점 이하이면 : "다음 기회에~~~"


        Scanner scan = new Scanner(System.in);

        int count = 1;
        int score = 0;
        boolean previousWin = false;


        while (true){

            // 入力
            System.out.println("사용자 입력: ");
            String  inputHand = scan.nextLine().toUpperCase();

            // 数字に変換
            int userHand = switch (inputHand){
                case "SCISSORS" -> 0;
                case "ROCK" -> 1;
                case "PAPER" -> 2;
                case "QUIT" -> 3;
                default -> 4;
            };

            // System.out.print("User Hand" + userHand);

            // quit
            if(userHand == 3){
                System.out.println("게임 종료");
                break;
            }

            // 再入力
            if(userHand == 4){
                System.out.println("재입력");
                continue;
            }

            // PCの手をランダムに作成
            Random rd = new Random();
            int inputPcHand = rd.nextInt(3);

//            String pcHand = switch (inputPcHand){ // 配列にしたほうが可読性が良い
//                case 0 -> "Scissors";
//                case 1 -> "Rock";
//                case 2 -> "Paper";
//                default -> "Error";
//            };
            String[] hands = {"Scissors", "Rock", "Paper"};
            String pcHand = hands[inputPcHand];


            // System.out.print("PC Hand" + pcHand);

            // 勝敗を確認
            String result = "";

            // 3. 승리 시 보너스 포인트 1점 증가, 패배 시 보너스 포인트 1점 차감
            if (userHand == inputPcHand){
                result = "무승부";
                previousWin = false;
            } else if ((userHand == 0 && inputPcHand == 1) ||
                    (userHand == 1 && inputPcHand == 2) ||
                    (userHand == 2 && inputPcHand == 0)) {
                result = "패배";
                score--;
                previousWin = false;
            } else { // 연속으로 승리 시 보너스 포인트 3점 추가
                result = "승리";
                score++;
                // もし連続で勝ったら３点追加
                if (previousWin){
                    score += 3;
                }
                previousWin = true;
            }

            // ゲーム終了
            if(score >= 3){
                System.out.println("おめでとうございます。勝利！");
                System.out.println("- 사용자 : " + inputHand + ", 컴퓨터 : " + pcHand);
                break;
            } else if(score <= -3){
                System.out.println("- 사용자 : " + inputHand + ", 컴퓨터 : " + pcHand);
                System.out.println("残念、次の機会に！");
                break;
            }


            // 승부 회수
            count++;

            // 出力
            System.out.println(count + ") " + result + "- 사용자 : " + inputHand + ", 컴퓨터 : " + pcHand);
        }
        // 出力
        System.out.println("point : " + score);
        System.out.println("게임 회수:" + count);
        scan.close();
    }
}



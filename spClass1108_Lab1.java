import java.util.Random;
import java.util.Scanner;

public class spClass1108_Lab1 {
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

        Scanner scan = new Scanner(System.in);

        int count = 1;

        while (true){

            // 入力
            System.out.println("사용자 입력: ");
            String  inputHand = scan.nextLine().toLowerCase();

            // 数字に変換
            int userHand = switch (inputHand){
                case "scissors" -> 0;
                case "rock" -> 1;
                case "paper" -> 2;
                case "quit" -> 3;
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

            String pcHand = switch (inputPcHand){ // 配列にしたほうが可読性が良い
                case 0 -> "Scissors";
                case 1 -> "Rock";
                case 2 -> "Paper";
                default -> "Error";
                };

            // System.out.print("PC Hand" + pcHand);

            // 勝敗を確認
            String result = "";

            if (userHand == inputPcHand){
                result = "무승부";
            } else if ((userHand == 0 && inputPcHand == 1) ||
                       (userHand == 1 && inputPcHand == 2) ||
                       (userHand == 2 && inputPcHand == 0)) {
                result = "패배";
            } else {
                result = "승리";
            }
            // 승부 회수
            count++;

            // 出力
            System.out.println(count + ") " + result + "- 사용자 : " + inputHand + ", 컴퓨터 : " + pcHand);
        }
        // 出力
        System.out.println("게임 회수:" + count);
        scan.close();
    }
}

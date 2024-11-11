import java.util.Scanner;

public class spClass1104_Lab02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 勝敗計算
        int userCount = 0;
        int computerCount = 0;
        int draw = 0;

        // じゃんけんゲーム
        // ユーザーから手、３種類中１つを入力してもらう
        // コンピューター乱数を利用して、一つを選択する
        // 勝敗を決める
        // ゲームは続く

        // 例外処理、　ユーザーの入力が違った場合、再入力
        // quitを入力した場合ゲーム終了

        // task1
        // ユーザーの手を入力
        while (true) {
            System.out.println("Enter your hand: ");
            String userHand = scan.nextLine();
            // ユーザーの入力が違う場合、再入力させる
            if (userHand.equalsIgnoreCase("Scissors") ||
                    userHand.equalsIgnoreCase("Rock") ||
                    userHand.equalsIgnoreCase("Papers")) {
                System.out.println("Your hands is: " + userHand);

                // task2
                // コンピューターの手を配列でつくる　
                String sciRockRaer[] = {"Scissors", "Rock", "Papers"};
                // ランダムを使って、その勝負の手を決める
                int computerInput = (int) (Math.random() * 3);
                // switch式を使ってランダムの手を出力する
                String computerHand = switch (computerInput) {
                    case 0 -> sciRockRaer[0];
                    case 1 -> sciRockRaer[1];
                    case 2 -> sciRockRaer[2];
                    default -> "Error";
                };
                System.out.println("Computer hand is: " + computerHand);

                // task3
                // 勝負させる
                // 結果の出力
                // これを繰り返す

                if (userHand.equalsIgnoreCase("Scissors")) {
                    if (computerHand.equalsIgnoreCase("Scissors")) {
                        draw++;
                    } else if (computerHand.equalsIgnoreCase("Rock")) {
                        computerCount++;
                    } else { // "Papers"
                        userCount++;
                    }
                } else if (userHand.equalsIgnoreCase("Rock")) {
                    if (computerHand.equalsIgnoreCase("Rock")) {
                        draw++;
                    } else if (computerHand.equalsIgnoreCase("Papers")) {
                        computerCount++;
                    } else { // "Scissors"
                        userCount++;
                    }
                } else { // "Papers"
                    if (computerHand.equalsIgnoreCase("Papers")) {
                        draw++;
                    } else if (computerHand.equalsIgnoreCase("Scissors")) {
                        computerCount++;
                    } else { // "Rock"
                        userCount++;
                    }
                }

            } else if (userHand.equalsIgnoreCase("quit")) { // ユーザーの入力がquitの場合、ゲームを終了させる
                System.out.println("Game end");
                System.out.println("Your score is: " + userCount);
                System.out.println("Computer score is: " + computerCount);
                break;
            } else {
                System.out.println("Enter your hand again");
                continue;
            }

        }

    }
}

// task4 option
// 試合数をカウントする
// 最終結果、何勝何敗か出力


//if (user == 1 && computer == 2) || (user == 3 && computer == 2)　｜｜

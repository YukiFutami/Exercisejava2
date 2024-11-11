import java.util.Scanner;

public class spClass1104_Lab01 {
    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        // キーボードから整数Nを入力
//        // もしNが０またはマイナスなら再入力
//
//        int num0fElements = 0;
//        while(true){
//            num0fElements = sc.nextInt();  // int num0fElements = sc.nextInt()にしてはいけない理由は何？
//
//            // 脱出条件
//            if (num0fElements == 0){
//                break;
//            }
//
//            // 以外出力
//            System.out.println("プラスの数を入力してください");
//
//
//        }



        // N個の整数型元素数を持っている１次元配列を生成する

        // 사용자로부터 배열 크기 N을 입력받아,
// N개의 정수를 저장할 수 있는 1차원 배열을 생성하라.
// 단, N이 0 또는 음수이면 재입력을 요구한다.

// 사용자로부터 난수 범위를 지정할 start, end 값을 입력받아,
// start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장하라.
// 단, (end - start + 1) 값이 배열의 크기 N보다 작을 경우
// 다시 입력을 요구한다.
// 예) N = 5 -> 5개의 원소를 가지는 1차원 배열 생성
//     start = 10, end = 12 -> 배열 원소는 10, 11, 12 중 하나의 값이어야 함

// 생성된 배열의 모든 원소 값을 출력하라.
        Scanner scan = new Scanner(System.in);
        int array[];

        while (true) {
            int num = scan.nextInt();

            if (num > 0) {
                array = new int[num];
                break;
            }
            System.out.println("재입력");
        }
        System.out.println("배열은" + array.length);

        int start = scan.nextInt();
        int end = scan.nextInt();
//
//        if (num >= start && num <= end){
//            if (end - start + 1 >= num){
//                // 다시 입력을 요구한다.
//            }
//        }
    }
}

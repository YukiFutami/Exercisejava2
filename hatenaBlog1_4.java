public class hatenaBlog1_4 {
    public static void main(String[] args){

        //  問題1-4
        //int型の変数valueが宣言してあります。変数valueは任意の整数をあらわしています。
        //まずは変数valueの値が偶数か奇数かを判定します。偶数の場合は「偶数です」と表示し、奇数の場合は「奇数です」と表示します。
        //負の数値でもきちんと偶数・奇数を判定してください。
        //次に、変数valueの値が3の倍数、4の倍数、5の倍数であるかの判定を行います。
        //3の倍数の場合は「3の倍数です」と表示します。
        //4の倍数の場合は「4の倍数です」と表示します。
        //5の倍数の場合は「5の倍数です」と表示します。
        //3の倍数かつ4の倍数の数値もあることに注意してください。
        //今回の練習問題はif文だけを使用し、繰り返し構文は使わないでください。

        int value = -15;
        System.out.println("value: " + value);

        if (value % 2 == 0){
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        if (value % 3 == 0){
            System.out.println("3の倍数です");
        }
        if (value % 4 == 0) {
            System.out.println("4の倍数です");
        }
        if (value % 5 == 0) {
            System.out.println("5の倍数です");
        }


    }
}

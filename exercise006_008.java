public class exercise006_008 {
    public static void main(String[] args){

        // 006 繰り返し（for文のネスト） 008 問題
        // ネストされたfor文を使用して、1から100までの素数を表示するプログラムを作成してください。
        // 素数は1と自分自身以外の約数を持たない数です。

        for (int i = 1; i <= 100; i++){ // １から100までを出力
            boolean isPrime = true; // 宣言、素数をtrueに設定

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // 割り切れたらfalse
                    break; //割り切れる場合は素数ではないのでループを抜ける
                }
            }

            // 素数の場合は表示
            if(isPrime){
                System.out.println(i);
            }

        }


    }
}
/*
内側のfor文は、各整数が素数かどうかを判定するための部分です。このループがどのように機能するのかを詳しく説明します。

内側のfor文の役割
目的
内側のfor文の目的は、現在の数 i が素数であるかを確認することです。素数とは、1 とその数自身以外の約数を持たない数です。

コードの部分
java
코드 복사
for (int j = 2; j <= Math.sqrt(i); j++) {
    if (i % j == 0) {
        isPrime = false; // 割り切れる場合は素数ではない
        break; // ループを抜ける
    }
}
各部分の解説
for (int j = 2; j <= Math.sqrt(i); j++):

このループは、jを2から i の平方根までの数でループします。
ここで Math.sqrt(i) を使うのは、i の平方根を超える数で割り算をしても、約数が見つからないためです。たとえば、36の約数は6まで調べれば十分です。6より大きい数で割り算をする必要はありません。
if (i % j == 0):

これは i が j で割り切れるかどうかをチェックする条件です。
i % jは、i を j で割った余りを求めます。余りが0の場合、i は j で割り切れるということになります。
isPrime = false;:

もし i が j で割り切れた場合、isPrime を false に設定します。これは、i が素数ではないことを意味します。
break;:

割り切れたら、これ以上調べる必要はないので、break 文で内側のループを抜けます。
これにより、余計な計算を省いて効率的に素数判定が行われます。
具体的な例
例えば、i = 29のときの処理を見てみましょう。

最初のループで、i は29になります。

isPrime は true に設定されます。

内側のループが始まります。

j = 2: 29 % 2 は 1 なので、isPrime は true のまま。
j = 3: 29 % 3 は 2 なので、isPrime は true のまま。
j = 4: 29 % 4 は 1 なので、isPrime は true のまま。
j = 5: 29 % 5 は 4 なので、isPrime は true のまま。
j = 6: 29 % 6 は 5 なので、isPrime は true のまま.
j = 7: 29 % 7 は 1 なので、isPrime は true のまま.
j = 8: 29 % 8 は 5 なので、isPrime は true のまま.
j = 9: 29 % 9 は 2 なので、isPrime は true のまま.
この段階で j は Math.sqrt(29) のおおよそ 5.38 なので、ループが終了します。
内側のループを終えると、isPrime は true のままです。

最後に、if (isPrime) の条件が成立するので、29は素数として表示されます。

結論
内側のfor文は、現在の数 i がどの数で割り切れるかを調べるために使用されます。割り切れる数が見つかると、その数は素数ではないと判断され、処理を効率的に進めるためにループを終了します。

この流れを理解することで、素数判定がどのように機能しているかがより明確になると思います。もしさらに具体的な質問や不明点があれば、お気軽にどうぞ！
 */
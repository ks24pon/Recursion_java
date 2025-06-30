class Solution{
    public static String fizzBuzz(int n){
        // 出力結果(初期値は空)
        String result = "";

        // 1からnまでループ
        for(int i = 1; i <= n; i++){
            // 3と5の両方で割り切れる場合(15の倍数)
            if(i % 3 == 0 && i % 5 == 0){
                result += "-FizzBuzz";
                // これ以降の処理をスキップ
                continue;
            // 3の倍数の時は"Fizz"
            } else if(i % 3 == 0) {
                result += "-Fizz";
            // 5の倍数の時は"Buzz"
            } else if(i % 5 == 0) {
                result += "-Buzz";
            // どちらでもない場合は数字そのものを文字列として追加
            } else {
                result += "-" + String.valueOf(i);
            }
        }
        // 最初に余分な"-"がついてしまうため、1文字目を除いた文字列を返す
        return result.substring(1);
    }
}


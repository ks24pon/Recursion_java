class Solution{
    public static String notDivisibleNumbers(int x, int y){
        // 例外処理　1の時は分割できる数字が存在しない空文字を返す
        if (x == 1 && y == 1) return "";

        // 文字列を効率的に結合するためのStringBuilder
        StringBuilder result = new StringBuilder();

        // 1からxまでループして、yで割り切れない数字だけを処理
        for (int i = 1; i <= x; i++){
            // iがyで割り切れない場合(余がある)
            if (i % y != 0) {
                // 既に文字列に数字が追加されている場合は、ハイフンを先に追加
                if (result.length() > 0) {
                    result.append("-");
                }
                // 現在の数字iを文字列として追加
                result.append(i);
            }
        }

        // 完成した文字列を返す
        return result.toString();
    }
}


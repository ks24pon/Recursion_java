class Solution {
    public static long recursiveDigitsAdded(long digits) {
        long current = splitAndAdd(digits);

        if (current < 10) {
            // 1桁になったらその値だけ返す
            return current;
        }

        // それ以外は、current（今回の合計）+ 再帰呼び出しの結果（1桁になるまで）
        return current + recursiveDigitsAdded(current);
    }

    private static long splitAndAdd(long n) {
        if (n == 0) return 0;
        return (n % 10) + splitAndAdd(n / 10);
    }
}
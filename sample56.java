class Solution {
    public static int maxBread(int money, int price, int sticker) {
        int bought = money / price; // 最初に買えるパンの数
        return bought + exchange(bought, sticker);
    }

    // 再帰関数：今持ってるシールで交換できるパンの数を計算
    private static int exchange(int stickers, int stickerNeeded) {
        if (stickers < stickerNeeded) {
            return 0; // 交換できない場合は終了
        }
        int newBread = stickers / stickerNeeded;
        int remainingStickers = stickers % stickerNeeded;
        int totalStickers = newBread + remainingStickers; // 新たに得たパンのシール + 残りのシール
        return newBread + exchange(totalStickers, stickerNeeded);
    }
}

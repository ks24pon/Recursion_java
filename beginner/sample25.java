class Solution{
    public static boolean canProcessOrder(boolean beef, boolean chicken, boolean salad, boolean coffee, boolean tea){
        return !(beef == chicken) && !(tea == coffee);
    }
}


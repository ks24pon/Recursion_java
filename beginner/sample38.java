class Solution{
    public static String upperCaseDomain(String email){
        // 関数を完成させてください
        return email.substring(email.indexOf("@")+1).toUpperCase();
    }
}
class MyClass{
    public static void main(String[] args){
        int myPower = 300;
        int mySpeed = 200;
        int myTechnique = 50;
        int myDefense = 500;
        
        myPower += 10;
        mySpeed -= 5;
        myTechnique *= 7;
        myDefense /= 2;

        System.out.println("myPower : " + String.valueOf(myPower));
        System.out.println("mySpeed : " + String.valueOf(mySpeed));
        System.out.println("myTechnique : " + String.valueOf(myTechnique));
        System.out.println("myDefense : " + String.valueOf(myDefense));
    }
}
package chapterFour;

public class Mp3Test {
    public static void main (String... args){

        Mp3 mp;
        mp=new Mp3();
mp.setVolume(10);
        mp.setOn(true);
        System.out.println(mp.getOn());
        System.out.println("The volume is" +" "+mp.getVolume());
        int increase= mp.increaseVolume(0);
        System.out.println(increase);

    }
}

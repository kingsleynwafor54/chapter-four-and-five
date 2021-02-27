package chapterFour;

class Night {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 4) {
            System.out.println(a % 2 == 1 ? "*****\n*****" : "++++++++");
            ++a;
        }
    }
}
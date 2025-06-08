import java.util.Scanner;

class dice {
    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        dice currroll = new dice();
        for(int i = 1;i<10;i++) {
            System.out.println(currroll.roll());
        }
    }

}

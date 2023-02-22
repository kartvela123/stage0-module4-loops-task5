package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String ana;
        for (int x = 1; x <= height; x++) {
            ana = "";
            for (int y = 1; y <= length; y++) {
                if (y == 1 | y == length | x == 1 | x == height) {
                    ana += "8";
                } else {
                    ana += " ";
                }
                }
            System.out.println(ana);
            }

    }
}

package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String ana;
        for (int x = 1; x <= sideLength; x++) {
            ana = "";
            for (int y = 1; y <= sideLength; y++) {
                if (y == 1 | y == sideLength | x == 1 | x == sideLength) {
                    ana += "8";
                } else {
                    ana += " ";
                }

            }
            System.out.println(ana);
        }


    }
}

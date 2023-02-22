package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String ana;
        for (int x = 1; x <= sideLength; x++) {
            ana = "";
            for (int y = 1; y <= sideLength; y++) {
                if (x == sideLength / 2 + 1 | y == sideLength/2 + 1)  {
                    ana += "8";
                }else {
                    ana += " ";
                }
            }
            System.out.println(ana);

            }
        }
    }

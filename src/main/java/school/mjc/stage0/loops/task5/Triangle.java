package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String ana;
        for (int x = 1; x <= cathetusLength; x++) {
            ana = "";
            for (int y = 1; y <= x; y++) {
                ana += "8";


            }
            System.out.println(ana);
        }
    }
}

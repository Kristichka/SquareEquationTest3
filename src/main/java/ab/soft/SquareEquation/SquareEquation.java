package ab.soft.SquareEquation;

public class SquareEquation {
    private int a;
    private int b;
    private int c;

    public SquareEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isSquare() {
        return a != 0;
    }

    public int discriminant() {
        return b * b - 4 * a * c;
    }

    public class Solution {
        public double x1;
        public double x2;
    }

    public Solution findSolution() {

        Solution solution = new Solution();
        if (!isSquare()) return null;
        int D = discriminant();
        if (D > 0) {
            solution.x1 = (-b + Math.sqrt(D)) / (2 * a);
            solution.x2 = (-b - Math.sqrt(D)) / (2 * a);

        } else if (D == 0) {
            solution.x1 = solution.x2 = -b / (2 * a);
        } else return null;
        return solution;
    }
}
package AlgorithmsPart1.UnionFind;

public class CanonicalElement {

    private int[] id;

    private CanonicalElement(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
}

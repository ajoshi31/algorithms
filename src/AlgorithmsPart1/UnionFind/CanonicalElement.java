package AlgorithmsPart1.UnionFind;

public class CanonicalElement {

    private static int[] parent;
    private static int[] rank;

    private CanonicalElement(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    private static boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private static int root(int a) {
        while (a != parent[a]) {
            a = parent[a];
        }
        return a;
    }

    private static void union(int a, int b) {

        int rootA = root(a);
        int rootB = root(b);

        if (rootA == rootB) {
            return;
        }

        if(rank[rootA] < rank[b]){
            parent[rootA] = rootB;
            rank[rootB] = rank[rootB] + rank[rootA];
        } else {
            parent[rootB] = rootA;
            rank[rootA] =  rank[rootA] + rank[rootB];
        }


    }

    private static void find(int a) {

    }


}


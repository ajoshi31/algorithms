package AlgorithmsPart1.UnionFind;


public class FriendsConnection {
    private int[] id;
    private int[] size;
    private static int count;

    private FriendsConnection(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        count = N;

    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private void union(int p, int q) {
        if (!connected(p, q)) {
            int i = root(p);
            int j = root(q);
            if (size[i] < size[j]) {
                id[i] = j;
                size[j] = size[j] + size[i];
            } else {
                id[j] = i;
                size[i] = size[i] + size[j];
            }
            if (id[i] != i) {
                count--;
            }
            if (id[j] != j) {
                count--;
            }
        }
    }

    public static void findFriend() {

        int n = 100; // n friends
        FriendsConnection qf = new FriendsConnection(n);
        int m = 70; // time stamp to connect the friends
        for (int i = 0; i < m; i++) {
            qf.union(1, 2); // read the log file and do union for all;
            if (count == 1) {
                break;
            }
        }
    }
}

import java.util.*;

public class GraphBFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {

        // Create ArrayList for every vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // Vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // Vertex 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // Vertex 4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // Vertex 5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // Vertex 6
        graph[6].add(new Edge(6, 5));
    }

    static void bfs(ArrayList<Edge>[] graph) {

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[graph.length];

        // Start BFS from vertex 0
        q.add(0);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!visited[curr]) {

                System.out.print(curr + " ");

                visited[curr] = true;

                // Visit all adjacent vertices
                for (int i = 0; i < graph[curr].size(); i++) {

                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        int v = 7;

        // Array has 7 positions: 0 to 6
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        bfs(graph);
    }
}
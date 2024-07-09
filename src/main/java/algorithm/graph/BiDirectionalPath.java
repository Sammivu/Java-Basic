package algorithm.graph;
import java.util.*;




    /*
    QUESTION 2​

There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive).
The edges in the graph are represented as a 2D integer array edges,
where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi.
Every vertex pair is connected by at most one edge, and no vertex has an edge to itself. ​
You want to determine if there is a valid path that exists from vertex source to vertex destination. ​
Given edges and the integers n, source, and destination,
return true if there is a valid path from source to destination, or false otherwise.

Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2 ​
Output: true ​
Explanation: There are two paths from vertex 0 to vertex 2: ​
- 0 → 1 → 2 ​
- 0 → 2 ​

     */
    public class BiDirectional {


        public boolean validPath(int n, int[][] edges, int source, int destination) {
            // Create an adjacency list
            Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
            for (int i = 0; i < n; i++) {
                adjacencyList.put(i, new ArrayList<>());
            }

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                adjacencyList.get(u).add(v);
                adjacencyList.get(v).add(u);
            }

            // BFS initialization
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            queue.offer(source);
            visited.add(source);

            // BFS traversal
            while (!queue.isEmpty()) {
                int current = queue.poll();

                // Check if we have reached the destination
                if (current == destination) {
                    return true;
                }

                // Visit all neighbors
                for (int neighbor : adjacencyList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }

            // If the queue is empty and we haven't reached the destination
            return false;
        }

            public static void main(String[] args) {
                BiDirectional gp = new BiDirectional();
                int n = 6;
                int[][] edges = { {0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3} };
                int source = 0;
                int destination = 5;
                System.out.println(gp.validPath(n, edges, source, destination)); // Output: false
            }


    }

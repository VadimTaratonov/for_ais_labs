import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Создание графа
    Graph(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<>();
    }

    // Добавление ребер
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // Алгоритм
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : adjLists[vertex]) {
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS(1);
        //новые комментарии
        // вавава
    }
}

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class PatronConsumidor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Creamos dos tablas Hash
        Hashtable<String, String> table1 = new Hashtable<String, String>();
        Hashtable<String, String> table2 = new Hashtable<String, String>();

        // Agregamos algunos registros a la primera tabla
        table1.put("001", "John Doe");
        table1.put("002", "Jane Doe");
        table1.put("003", "Joe Smith");
        table1.put("004", "Sarah Johnson");

        // Agregamos algunos registros a la segunda tabla
        table2.put("002", "New York");
        table2.put("004", "Los Angeles");
        table2.put("005", "Chicago");
        // Creamos una cola compartida
        Queue<String> queue = new LinkedList<String>();
        // Creamos dos CompletableFuture, uno para producir y otro para consumir
        CompletableFuture<Void> producerFuture = CompletableFuture.supplyAsync(() -> {
            // Este CompletableFuture produce valores y los agrega a la cola
            for (String key : table1.keySet()) {
                String value1 = table1.get(key);
                String value2 = table2.get(key);

                if (value2 != null) {
                    // Si el registro existe en la segunda tabla, lo agregamos a la cola
                    queue.add(value1 + ", " + value2);
                } else {
                    // Si el registro no existe en la segunda tabla, solo agregamos el registro de la primera tabla a la cola
                    queue.add(value1);
                }
            }
            return null;
        });

        CompletableFuture<Void> consumerFuture = CompletableFuture.runAsync(() -> {
            // Este CompletableFuture consume valores de la cola
            while (true) {
                if (!queue.isEmpty()) {
                    String value = queue.poll();
                    System.out.println(value);
                }
                try {
                    Thread.sleep(1000); // dormimos el hilo por un segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Iniciamos los CompletableFuture
        producerFuture.get();
        consumerFuture.get();
    }
}
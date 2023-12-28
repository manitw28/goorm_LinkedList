public class Queue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void offer(T data) {
        queue.add(data);
    }

    public T poll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }

        T data = queue.get(1);
        queue.delete(1);

        return data;
    }

}
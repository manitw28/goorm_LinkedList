// LinkedList 자료구조를 학습하고 간단한 MyLinkedList 를 구현합니다.
// 우리가 만드는 MyLinkedList 는 다음과 같은 메서드를 제공합니다.
//
// add() : MyLinkedList 의 마지막 노드에 data 를 추가 할 수 있습니다.
// get(index i): MyLinkedList 의 i 번째 노드의 data 를 return 합니다.
// delete(index i): MyLinkedList 의 i 번째 노드의 데이터를 삭제합니다.
// 위를 api를 제공하면서, data 의 타입은 LinkedList 를 생성할 때 정할 수 있도록 제네릭으로 구현합니다.
// (하위과제)
// • lterator interface 를 implements 한 후에 구현하여 for-each 로 순회 가능하도록 해봅시다.
// • MyLinkedList 를 이용해서 Queue 와 Stack 을 구현해봅시다.

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        System.out.println("-------------------------");
        // add
        myLinkedList.add("8");
        myLinkedList.add("1");
        myLinkedList.add("3");
        myLinkedList.add("4");

        Iterator<String> it1 = myLinkedList.iterator();
        while (it1.hasNext()) {
            String data = it1.next();
            System.out.println(data);
        }



        System.out.println("-------------------------");
        // get

        String s = myLinkedList.get(3);
        System.out.println(s);



        System.out.println("-------------------------");
        // delete

        myLinkedList.delete(2);
        Iterator<String> it2 = myLinkedList.iterator();
        while (it2.hasNext()) {
            String data = it2.next();
            System.out.println(data);
        }


        System.out.println("-------------------------");
        // STACK

        Stack<Integer> myStack = new Stack<Integer>();
        for (int i = 0; i < 6; i++) {
            System.out.printf("myStack에 %d를 push합니다.%n", i);
            myStack.push(i);
        }

        System.out.printf("%nmyStack이 비었습니까? " + (myStack.isEmpty() ? "예%n%n" : "아니오%n%n"));
        for (int i = 1 ; !myStack.isEmpty(); i++) {
            System.out.printf("myStack에서 %d번째 pop = " + myStack.pop() + "%n", i);
        }
        System.out.printf("%nmyStack이 비었습니까? " + (myStack.isEmpty() ? "예%n" : "아니오%n"));




        System.out.printf("%n-------------------------%n");
        // QUEUE

        Queue<Integer> myQueue = new Queue<Integer>();
        for (int i = 6; i < 10; i++) {
            System.out.printf("myQueue에 %d를 offer합니다.%n", i);
            myQueue.offer(i);
        }

        System.out.printf("%nmyQueue가 비었습니까? " + (myQueue.isEmpty() ? "예%n%n" : "아니오%n%n"));
        for (int i = 1 ; !myQueue.isEmpty(); i++) {
            System.out.printf("myQueue에서 %d번째 poll = " + myQueue.poll() + "%n", i);
        }
        System.out.printf("%nmyQueue이 비었습니까? " + (myQueue.isEmpty() ? "예" : "아니오"));

    }
}
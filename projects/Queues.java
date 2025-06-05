import java.util.Queue;
import java.util.LinkedList;
class Queues{
	public static void main(String[] args){
		Queue<Integer> queu = new LinkedList<>();
		queu.offer(10);
		queu.offer(20);
		queu.offer(30);
		System.out.println("after adding " +queu);
		queu.poll();
		System.out.println("after delete" +queu);
		System.out.println("top element" +(queu.peek()));
		queu.isEmpty();
	}
}
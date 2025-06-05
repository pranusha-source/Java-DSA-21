import java.util.Queue;
import java.util.LinkedList;
class TaskSchedulerQueues{
	static class Task{
		String name;
	public Task(String name){
		this.name=name;
	}
	public void execute(){
		System.out.println("Task"+name);
	}
}
public static void main(String[] args){
	Queue<Task> queue = new LinkedList<>();
	queue.offer(new Task("Task1: Wake up"));
	queue.offer(new Task("Task2: Breakfast"));
	queue.offer(new Task("Task3: Go to college"));
	while(!queue.isEmpty()){
		Task currenttask=queue.poll();
		currenttask.execute();
        System.out.println("remaining task");
	if(queue.isEmpty()){
		System.out.println("No tasks");
	} else {
	for(Task task: queue){
		System.out.println(task.name);
		}
            }
	}
	System.out.println("all task completed");
	}
}

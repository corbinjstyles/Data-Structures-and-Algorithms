import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("Corbin");
        stack.push("Nick");
        stack.push("Alex");
        stack.push("Will");
        stack.push("Stuart");
        stack.push("Colin");
        stack.push("Corbin");

        System.out.println(stack);

        String myName = stack.pop();

        System.out.println(myName);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search("Will"));

        System.out.println(stack.search("Alex"));

        stack.push("Corbin");

        //Looks for top element only if two or more elements are the same
        System.out.println(stack.search("Corbin"));

        //uses for stacks:
        // undo/redo features in text editors
        // moving back/forward through browser history
        // backtracking algorithms (maze/file directries)
        // calling functions (call stack)

    }
}

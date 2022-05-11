package Stack;

public class Main {
    public static void main(String[] args) {
        StackOfSites<String> sites = new StackOfSites<>();

        sites.push("google");
        sites.push("Udemy");
        sites.push("Discord");
        System.out.println(sites.peek());
        sites.printStack();
    }
}

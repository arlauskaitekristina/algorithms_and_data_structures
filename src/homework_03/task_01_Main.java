package homework_03;

public class task_01_Main {
    public static void main(String[] args) {
        task_01_BinaryTree tree = new task_01_BinaryTree();
        for (int i = 0; i < 10; i++) {
            tree.add(i);
        }
        System.out.println("finish");
        tree.add(20);
        tree.add(25);
        tree.add(30);
        tree.add(35);
        tree.add(40);
        System.out.println(tree.find(5));
        System.out.println(tree.find(25));
        System.out.println(tree.find(55));
    }
}


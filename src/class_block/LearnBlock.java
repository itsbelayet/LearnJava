package class_block;

public class LearnBlock {

    public static void main(String[] args) {
        System.out.println("This is Main Block, It will run later");
    }

    static {
        System.out.println("This is Static Block, It will run first");
    }
}

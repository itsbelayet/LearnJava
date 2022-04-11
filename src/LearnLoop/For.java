package LearnLoop;

public class For {
    public static void main(String[] args) {

        int[] val = {10, 20, 30, 40, 50, 60, 70, 80};

        //        for (int va:val) {
//            System.out.println(va);
//        }

//        for(int i=0;i<val.length; i++){
//            System.out.println(val[i]);
//        }

        String name = "Belayet";
        char[] ne = name.toCharArray();
        for (int i = 0; i < ne.length; i++) {
            System.out.println(ne[i]);
        }
        System.out.println(name.repeat(5));
    }
}

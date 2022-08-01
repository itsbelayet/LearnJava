package problemSolving;

import java.util.Arrays;

public class CountDuplicateNumber {
    public static void main(String[] args) {
        int [] elements={2,40,70,40,2,40,70,70};
        countDuplicate(elements);
    }

    static void countDuplicate(int elements[]){
        Arrays.sort(elements);
        // 2,2,40,40,70
        for (int i=0;i<elements.length; i++){
            int count=1;
            for(int j=i+1;j<elements.length;j++){
                if(elements[i]==elements[j])
                    count++;
                else
                    break;
            }
            if (count>1){
                System.out.println("Element "+elements[i]+" Occurs : "+count);
                //i+=(count-1);
                i+=count-1;
            }

        }
    }
}

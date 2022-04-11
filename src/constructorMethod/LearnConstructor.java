package constructorMethod;

public class LearnConstructor {

    LearnConstructor(){                      // Constructor Default
        System.out.println("This is Default Constructor");
    }

    static int year;
    String name;
    public LearnConstructor(String nam,int yar){    // Parametrize Constructor
        LearnConstructor.year=yar;                  // Static Global variable call by class name
        this.name=nam;                              // Non-Static global variable call by this keyword
        System.out.println(LearnConstructor.year+" Parametrize Constructor : "+this.name);
    }

    static int age;
    String fname;
    void LConstructor(String nam, int ag){          // Method Parametrize
        LearnConstructor.age=ag;
        this.fname=nam;
        System.out.println("Name: "+this.fname+" Age: "+LearnConstructor.age);
    }

    public static void main(String[] args) {
        LearnConstructor lc=new LearnConstructor();
        LearnConstructor lcp=new LearnConstructor("Miru",1964);

        lcp.LConstructor("Mohammed",57);
        lc.LConstructor("Hossain",58);
    }

}

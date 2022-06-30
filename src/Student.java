public class Student {
    public String name;     // 8 bytes
    public int age;         // 4 bytes
    public double mark;     // 8 bytes
    public boolean alive;   // 4 bytes

    // default constructor (with no args)
    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    // full constructor with params/args
    public Student(String n, int a, double m, boolean al) {
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

    // constructor with params/args
    public Student(String n) {
        name = n;
    }

    public Student(double m) {
        mark = m;
    }

    public Student(String n, double m) {
        name = n;
        mark = m;
    }

    public Student(double m, String n) {
        name = n;
        mark = m;
    }


    public String getInfo(){
        return name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}

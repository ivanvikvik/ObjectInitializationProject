public class Student {
    public String name;     // 8 bytes
    public int age;         // 4 bytes
    public double mark;     // 8 bytes
    public boolean alive;   // 4 bytes

    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public String getInfo(){
        return name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}

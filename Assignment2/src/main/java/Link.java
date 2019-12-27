public class Link {
    public int age ;
    public double degree;
    public String name;
    Link next ;
    public Link(String n, int a, double d){
        name = n;
        age = a;
        degree = d;

    }
    public void displaylink(){

        System.out.println("Student name is " + name +", their age is " + age + ", with degree: " + degree);
    }
}

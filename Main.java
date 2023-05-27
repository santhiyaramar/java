public class Main
{
int salary;
int price;
void teach(int salary)
{
salary = 10;
System.out.println("teaching"+this.salary);
System.out.println(salary);
}
public static void main (String[] args)
{
Main teacher = new Main();
teacher.salary = 20000;
teacher.teach(teacher.salary);
}
}

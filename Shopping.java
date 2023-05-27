class Shopping
{

public static void main(String[] args)
{
int amount = 1000;
Shopping myself = new Shopping();
myself.purchase(amount); //pass by value

}
void purchase(int cash)
{
System.out.println("came to Shopping with"+ cash); 
}

}

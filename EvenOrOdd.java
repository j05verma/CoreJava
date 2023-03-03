public class EvenOrOdd
{
 public static void main(String[] args)
  {
    Test.CheckEvenOrOdd(10);
  }
}
Class Test{
  public static void CheckEvenOrOdd(int a)
{
  if(a%2==0){
     System.out.println(a+" is even number ");
   }
   else{
       System.out.println(a+" is odd number ");
    }
}
}

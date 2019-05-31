public class PrimeNumber
{
public static void main(String args[])
{
int num;
System.out.println("primenumbers from 20 to 100");
for(int i=20; i<=100; i++)
{
num=0;
for(int j=2; j<i; j++)
{
if(i%j==0)
{
num++;
break;
}
}
if(num==0)
{
System.out.println("\t"+i);
}
}
}
}

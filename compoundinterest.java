class compoundinterest
{
public static void main(String args[])
{
double Q;  
double p=1000;  
float r=0.5f; 
int n=2;  
int t=5;   
Q=p*Math.pow((1+r/n),(n*t));
System.out.println(Q);
}
}
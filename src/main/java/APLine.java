public class APLine
{
  int g,e,f; 
  APLine(int a,int b, int c){
    g=a;e=b;f=c;
  } 
  public double getSlope(){
    return ((double)-g/(double)e);
  } 
  public boolean isOnLine(x,y){
    return g*x+e*y+f=0; 
  } 
}

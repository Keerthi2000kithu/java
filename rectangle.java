public class rectangle
{
double length,breadth;
void setdata(double l,double b)
{
length=l;
breadth=b;
}
double getarea()
{
return length*breadth;
}
public static void main(String args[])
{
rectangle r=new rectangle();
r.setdata(12.48,13);
System.out.println("Area of Rectangle:"+r.getarea());
}
}

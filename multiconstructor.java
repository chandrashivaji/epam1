class circle{
double x,y,r;

circle(double a,double b,double c){
x=a;
y=a;
r=c;
}
circle(double r){
x=0;
y=0;
r=7.0;
}
circle(circle c){
x=c.x;
y=c.y;
r=c.r;
}
circle(){
x=0.0;
y=0.0;
r=1.0;
}
double circumference(){
return 2*3.14*r;
}
double area(){
return 3.14*r*r;
}
}
class multiconstructor{
public static void main(String args[]){
circle c1=new circle(3.0,4.0,5.0);
circle c2=new circle(5.0);
circle c3=new circle(c1);
circle c4=new circle();
System.out.println("circumference "+c1.circumference());
System.out.println("area "+c1.area());
System.out.println("circumference "+c2.circumference());
System.out.println("area "+c2.area());
System.out.println("circumference "+c3.circumference());
System.out.println("area "+c3.area());
System.out.println("circumference "+c4.circumference());
System.out.println("area "+c4.area());
}
}

class circle{
double x,y;
double r;
double circumference(){
return 2*3.14*r;
}
double area(){
return 3.14*r*r;
}
void setcircle(double a,double b,double c){
x=a;
y=b;
r=c;
}
}
class Box{
double width,height,depth;
double area(){
double a;
a=(width*height+height*depth+width*depth)*2;
return a;
}
double volume(){
double v;
v=width*height*depth;
return v;
}
}
class demo2{
public static void main(String args[]){
circle c=new circle();
circle c1=new circle();
Box b=new Box();
c.setcircle(3.0,4.0,5.0);
c1.setcircle(-4.0,8.0,10.0);
b.width=3.0;b.height=4.0;b.depth=5.0;

System.out.println(" circle  circumference"+" "+c.circumference());
System.out.println("circle area"+ " " +c.area());
System.out.println("Box Area"+ " " +b.area());
System.out.println("Volume of Box  " + b.volume());
}
}


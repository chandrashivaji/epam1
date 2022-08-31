class circle{
  double x,y,r;
double circumference(){
return r*2*3.141;
}
double area(){
return (22/7)*r*r;
}
}
class demo1{
public static void main(String args[]){
   circle m=new circle();
m.x=1;
m.y=3;
m.r=5;
System.out.println("circumference"+m.circumference());
System.out.println("area"+m.area());
}
}
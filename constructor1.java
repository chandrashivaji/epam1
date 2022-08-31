class circle{
double x,y,r;
double circum(){
return 3.4*2*r;
}
double area(){
return 3.14*r*r;
}
circle(double a,double b,double c){
x=a;
y=b;
r=c;
}
circle(double x,double r){
this.x=x;
y=0;
this.r=r;
}
}
class constructor1{
public static void main(String args[]){

circle m=new circle(3.0,4.0,5.0);

circle l=new circle(-4.0,8.0,10.0);

System.out.println("circum"+" "+m.circum());
System.out.println("area"+" "+m.area());
System.out.println("circum"+" "+l.circum());
System.out.println("area"+" "+l.area());
}
}

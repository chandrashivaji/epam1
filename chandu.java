class circle{
int a,b,c,m;
float avg;
 int sum(){
m=a+b+c;
     return m;
}
float ave(){
m=a+b+c;
return m;
}
}
class chandu{
public  static void main(String args[]){
  circle d=new circle();
d.a=2;
d.b=29;
d.c=45;
System.out.println("sum "+d.sum());
System.out.println("average"+d.ave());
}
}

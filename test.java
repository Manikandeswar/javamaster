class test
{
public static void main(String args[])
{
test p=new test();
p.start();
}
void start()
{
String s1="here";
String s2=fix(s1);
System.out.println(s1+" "+s2);
}
String fix(String s1)
{
s1=s1+"there";
System.out.println(s1=" ");
return "there";
}
}

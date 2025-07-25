public class Program{
public static void main(String[] args){
  if(args.length<2){
    System.out.println("Please provide two arguments.");
    return;
  }     
  String first=args[0];
  String last=args[1];
  System.out.println(first+" Technologies "+last);
}
}
  

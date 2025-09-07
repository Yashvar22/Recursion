public class ques_13_basic_calculator {
  static int i=0;

  public static int evaluate(String s){
    int res=0;
    int sign=1;
    int num=0;

    while(i<s.length()){
     char ch=s.charAt(i++);
     if(Character.isDigit(ch)){
      num=num*10+(ch-'0');

     }

     else if(ch=='+'){
      res=res+num*sign;
      sign=1;
      num=0;
     }
     else if(ch=='-'){
      res=res+num*sign;
      sign=-1;
      num=0;
     }
     else if(ch=='('){
      num=evaluate(s);
     }
     else if(ch==')'){
      res+=sign*num;
      return res;
     }
    }
    res=res+sign*num;
    return res;

  }
  public static int calculate(String s){
     i=0;
     return evaluate(s);
  }
  public static void main(String[] args) {
     String expr1 = "1+(4+5+2)-3";
        String expr2 = "(1+(4+5+2)-3)+(6+8)";
        String expr3 = "2-1+2";

        System.out.println(expr1 + " = " + calculate(expr1)); // 9
        System.out.println(expr2 + " = " + calculate(expr2)); // 23
        System.out.println(expr3 + " = " + calculate(expr3)); // 3
  }
}

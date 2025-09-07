import java.util.*;

public class ques_12__add_parenthesis {
  public static List<Integer> solve(String expre){
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<expre.length();i++){
      char ch=expre.charAt(i);
      if(ch=='+'||ch=='-'||ch=='*'){
       List<Integer> left=solve(expre.substring(0, i));
       List<Integer> right=solve(expre.substring(i+1));
       for(int l:left){
        for(int r:right){
          if(ch=='+') res.add(l+r);
          if(ch=='-') res.add(l-r);
          if(ch=='*') res.add(l*r);
        }
       }
      }
    }
    // Base case: no operator -> it's just a number
        if (res.isEmpty()) {
            res.add(Integer.valueOf(expre));
        }

    return res;
  }
  public static void main(String[] args) {
     String expr = "2*3-4*5";
        System.out.println(solve(expr));
  }
}

public class ques_14_integer_to_english {
    private static final String[] BELOW_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };


    public String solve(int num){
        if(num<20){
            return BELOW_20[num];
        }
        else if(num<100){
             return TENS[num/10] + (num%10 !=0 ? " " + solve(num%10): "");
        }
        else if(num<1000){
            return solve(num/100) +" "+ "Hundred" +(num%100 !=0 ? " " + solve(num%100): "");
        }
        else if (num < 1_000_000) {
            return solve(num / 1000) + " " +  "Thousand" + (num % 1000 != 0 ? " " + solve(num % 1000) : "");
        } else if (num < 1_000_000_000) {
            return solve(num / 1_000_000) + " Million" + (num % 1_000_000 != 0 ? " " + solve(num % 1_000_000) : "");
        } else {
            return solve(num / 1_000_000_000) + " Billion" + (num % 1_000_000_000 != 0 ? " " + solve(num % 1_000_000_000) : "");
        }
    }
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        return solve(num).trim();
    }
  public static void main(String[] args) {
      ques_14_integer_to_english obj = new ques_14_integer_to_english();

        System.out.println(obj.numberToWords(0));            // Zero
        System.out.println(obj.numberToWords(5));            // Five
        System.out.println(obj.numberToWords(19));           // Nineteen
        System.out.println(obj.numberToWords(123));          // One Hundred Twenty Three
        System.out.println(obj.numberToWords(12345));        // Twelve Thousand Three Hundred Forty Five
        System.out.println(obj.numberToWords(1234567));      // One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
        System.out.println(obj.numberToWords(1000000000));   // One Billion
  }
}

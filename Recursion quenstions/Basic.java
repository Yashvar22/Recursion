class Basic{
  static int cnt=0;
  public static void print(){
    if(cnt==4){
      return;
    }
    System.out.println(cnt);
    cnt++;
    print();
  }
  public static void main(String[] args) {
    print();
    return ;
  }
}
class fact
{
  int fact(int n)
  {
      if(n==0)
      return 1;
      else
      return n*fact(n-1);
  }
  public static void main()
  {
      fact ob = new fact();
      int k= ob.fact(5);
      System.out.println(k);
  }
}
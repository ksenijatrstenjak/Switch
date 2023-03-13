public class CountDown {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;

   int from=10;
   countDown(from);


    }
    public static void countDown (int from) {
     while (from != 0 )  {
         System.out.println(from);
         from = from -1;
     }


} }

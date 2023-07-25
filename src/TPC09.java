public class TPC09 {
    public static void main(String[] args) {

        int a=67;
        int b=40;

        TPC09 t = new TPC09(); //heap Area 힙
        int result = t.sum(a,b);
        System.out.println(result);
    }
    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}

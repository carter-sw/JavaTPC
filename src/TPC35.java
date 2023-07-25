public class TPC35 {
    public static void main(String[] args) {
        String str1 = new String("APPLE");
        String str2 = new String ("APPLE");

        if(str1 == str2){                     //  메모리에서는 같은방향을 가리키고있어도 번지가 달라서 NO 힙메모리 영역
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        if(str1.equals(str2)){          // 반지 같아서 YES
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        String str3="APPLE";
        String str4 = "APPLE";

        if(str3==str4){                 //리터럴 풀
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        if(str3.equals(str4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}

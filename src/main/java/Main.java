import java.util.Scanner;

class Main {
    public int solution(String s) {
        String answer = "";

        for(char x : s.toCharArray()){
            //이게 숫자냐?
            if(Character.isDigit(x)) answer += x;
        }

        //0208이 208이 됨
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));



    }
}
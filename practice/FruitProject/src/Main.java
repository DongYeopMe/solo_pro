import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 메뉴 프린트하고
        * 숫자 받아서 장바구니 넣고
        * 그다음 장바구니 출력
        * 장보기 다 끝나면 총 가격 출력
        * */
        Scanner sc = new Scanner(System.in);
        FruitRepository fruitRepository = new FruitRepository();
        Menu menu = new Menu();
        while(true){
            menu.print();
            int num =sc.nextInt();
        }
    }
}
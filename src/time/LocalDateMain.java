package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정날짜 + 10d=" + plusDays);

        //모든 날짜클래스는 불변이라 변경이 발생하면 새로운 객체 생성해서 반환하므로 반환값을 꼭 받아야함.

    }
}

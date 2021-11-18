package hello.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatEx {

    public static void main(String[] args) { 
        // 날짜 형식 변환시 parsing 오류를 try catch로 체크
        try{ 
            String strDate = "2018-11-18 04:00:00.000";

            SimpleDateFormat dtFormat2 = new SimpleDateFormat("yyMMddHHmmss");

            SimpleDateFormat newDtFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

            // String 타입을 Date 타입으로 변환
            Date formatDate = dtFormat2.parse(strDate);

            Date formatDate2 = dtFormat2.parse(strDate);

            // Date타입의 변수를 새롭게 지정한 포맷으로 변환
            String strNewDtFormat = dtFormat2.format(formatDate);

            String strNewDtFormat2 = newDtFormat2.format(formatDate2);

            System.out.println("포맷 후 : " + strNewDtFormat);
            System.out.println("포맷 후 : " + strNewDtFormat2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

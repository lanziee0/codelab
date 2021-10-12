package com.kr.test;

import java.io.*;
import java.text.DecimalFormat;

public class TestConditions {

    //비교
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strIn = "", rslt = "==";
        int [] iArr = new int[2];
        int i=0;

        try {
            strIn = bf.readLine();
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        String[] sArrIn = strIn.split(" ");
        for(String s: sArrIn){
            iArr[i++] = Integer.parseInt(s);
        }
        if(iArr[0]>iArr[1]){
            rslt = ">";
        }else if(iArr[0]<iArr[1]){
            rslt = "<";
        }
        System.out.println(rslt);

    }*/

    //시험성적 출력
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String rslt = "F", strIn = "";

        try {
            strIn = bf.readLine();
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        int iIn = Integer.parseInt(strIn);
        if( iIn>=90 ) rslt = "A";
        else if( iIn>=80 && iIn < 90) rslt = "B";
        else if(iIn>=70 && iIn < 80) rslt = "C";
        else if(iIn>=60 && iIn < 70) rslt = "D";

        System.out.println(rslt);
    }*/

    //윤년체크
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String rslt = "0", strIn = "";
        String sRegexp = "[^0-9]";
        int iIn = 0;

        try {
            strIn = bf.readLine();
            if(strIn.matches(sRegexp) ){
                System.out.println("!111111111");
                throw new IOException("숫자입력만 가능");
            }
            iIn = Integer.parseInt(strIn);
            if( (0== iIn%400) || ( (0 == iIn%4) && (0 != iIn%100)) ){
                rslt = "1";
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(rslt);
    }*/

    //Quadrant 사분면 판단
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tmp = "0";
        String sRegexp = "[^0-9]";
        Integer []iIn = new Integer[2];
        String sIn = "";
        int iTmp = 0;

        try {
            for(int i=0;i<iIn.length;i++){
                tmp = bf.readLine();
                if(tmp.matches(sRegexp)  ){
                    throw new IOException("숫자입력만 가능");
                } else{
                    iTmp = Integer.parseInt(tmp);
                    if( iTmp>=-1000 && iTmp <=1000 && iTmp !=0 ) {
                        iIn[i] = iTmp;
                    }
                }
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        iTmp = 0;
        System.out.println(checkInteger(iIn[iTmp].intValue(), iIn[++iTmp].intValue()));
    }

    static private String checkInteger(int a, int b){
        String strQuadrant = "1";
        if(a<0 && b>0){
            strQuadrant = "2";
        }else if(a<0 && b<0){
            strQuadrant = "3";
        }else if(a>0 && b<0){
            strQuadrant = "4";
        }
        return strQuadrant;
    }*/

    //알람시계 45분 앞서 맞추기
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sRegexp = "[^0-9|\\u3000|\\u0020|\\u00A0]";
        String s = "";
        String strArr[];
        Integer []iIn = new Integer[2];
        String sIn = "";
        int iHour, iMin ;

        try {
            s = bf.readLine();
            if(s.matches(sRegexp)  ){
                throw new IOException("숫자입력만 가능");
            } else{
                strArr = s.split(" ");
                iHour = Integer.parseInt(strArr[0]);
                iMin = Integer.parseInt(strArr[1]);
                if( iHour>=0 && iHour <=23 && iMin>=0 && iMin<=59 ) {
                    System.out.println(calAfter45min(iHour, iMin));
                } else{
                    throw new IOException("시간 범위를 입력해야 합니다.");
                }
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static private String calAfter45min(int a, int b){
        int min = b-45, hour = a;
        StringBuffer sbAfter45min = new StringBuffer();
        if(min < 0){
            min += 60;
            hour-= 1;
        }
        if(hour<0){
            hour += 24;
        }
        sbAfter45min.append(hour).append(" ").append(min);

        return sbAfter45min.toString();
    }*/

    // N단 구구단 출력
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sRegexp = "[^0-9]";
        String sIn = "";
        int iNo = 0;
        StringBuffer sb = new StringBuffer();


        try {
            sIn = bf.readLine();
            if(sIn.matches(sRegexp)  ){
                throw new IOException("숫자입력만 가능");
            } else{
                iNo = Integer.parseInt(sIn);
                if( iNo>=1 && iNo<=9 ) {
                    for(int i=1;i<=9;i++){
                        sb.delete(0, sb.toString().length());
                        sb.append(iNo).append(" * ").append(i).append(" = ").append(iNo*i);
                        System.out.println(sb.toString());
                    }
                } else{
                    throw new IOException("1부터 9까지 입력");
                }
            }
        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // A+B 출력 IO에러
    /*public static void main(String[] args) {
        int []iArrRslt = readStrBuf();

        if( null!=iArrRslt && iArrRslt.length>0 )
            for (int j = 0; j < iArrRslt.length; j++) {
                System.out.println(iArrRslt[j]);
            }
    }

    static public int[] readStrBuf(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String idxIn;
        String sRegexp = "[1-9]";
        String sIn = "";
        int []iArrRslt = null;
        String []sArrTmp;

        try {
            idxIn = bf.readLine();
            if(!(null!=idxIn && idxIn.trim().matches(sRegexp))  ){
                throw new IOException("숫자입력만 가능");
            } else {
                int tmp = Integer.parseInt(idxIn);
                iArrRslt = new int[tmp];
                for (int i=0;i < tmp;i++) {
                    sIn = bf.readLine();
                    sArrTmp = sIn.split(" ");
                    iArrRslt[i++] = cal2Digit(i, sArrTmp);
                }
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return iArrRslt;


    }

    static public int cal2Digit(int i, String[] s){
        String []sArrNum = new String[2];

        return  Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
    }*/

    // 1~N까지 합 출력
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String idxIn;
        String sRegexp = "^[0-9]+$";
        int iRslt = 0;

        try {
            idxIn = bf.readLine();
            if(!(null!=idxIn && idxIn.matches(sRegexp))  ){
                throw new IOException("숫자입력만 가능");
            } else {
                for(int i=1;i<=Integer.parseInt(idxIn);i++)
                    iRslt +=i;
            }
            System.out.println(iRslt);

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    //빠른 A+B
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int iRslt = 0;

        try {
            idxIn = bf.readLine();
            if(!(null!=idxIn && idxIn.matches(sRegexp))  ){
                throw new IOException("숫자입력만 가능");
            } else {
                for(int i=0;i<Integer.parseInt(idxIn);i++) {
                    sTmp = bf.readLine(); //trim이 안먹는다
                    if(!(null!=sTmp && (sTmp.replace(" ", "")).matches(sRegexp))  ){
                        throw new IOException("숫자입력만 가능");
                    } else{
                        sArr = sTmp.split(" ");
                        bw.write(Integer.parseInt(sArr[0])+Integer.parseInt(sArr[1])+"\n");
                    }
                }
            }
            bw.flush();

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // N찍기
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";

        try {
            idxIn = bf.readLine();
            if(!(null!=idxIn && idxIn.matches(sRegexp))  ){
                throw new IOException("숫자입력만 가능");
            } else {
                for(int i=1;i<=Integer.parseInt(idxIn);i++){
                    bw.write(i+"\n");
                }
            }
            bw.flush();

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 기찍N
    /*{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";

        try {
            idxIn = bf.readLine();
            if (!(null != idxIn && idxIn.matches(sRegexp) && Integer.parseInt(idxIn) <=100000)) {
                throw new IOException(" 100000보다 작은 숫자입력만 가능");
            }else {
                for(int i=Integer.parseInt(idxIn);i>0;i--){
                    bw.write(i+"\n");
                }
            }
            bw.flush();

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // A+B N줄 출력
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";

        try {
            idxIn = br.readLine();
            if (!(null != idxIn && idxIn.matches(sRegexp))) {
                throw new IOException(" 숫자입력만 가능");
            }else {
                for(int i=1;i<=Integer.parseInt(idxIn);i++){
                    sTmp = br.readLine();
                    if(!(null!= sTmp && sTmp.replace(" ", "").matches(sRegexp)) ){
                        System.out.println(" 숫자입력만 가능");
                    } else {
                        sArr = sTmp.split(" ");
                        int t1 = Integer.parseInt(sArr[0]);
                        int t2 = Integer.parseInt(sArr[1]);
                        if( !(t1>0 && t2<10 ) ){
                            System.out.println("0 < A, B < 10");
                        } else{
                            bw.append("Case #").append(i+": ").append(t1+t2+"").append("\n");
                        }
                    }
                }
                bw.flush();
                br.close();
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    //A+B - 3
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int idx = 0, iTmp=0;

        try {
            idxIn = br.readLine();
            if ((null != idxIn && idxIn.replace(" ", "").matches(sRegexp) )) {sArr = idxIn.split(" ");
                idx = Integer.parseInt(idxIn);
                while(iTmp<idx) {
                    idxIn = br.readLine();
                    sArr = idxIn.split(" ");
                    if( sArr.length==2 && null!= idxIn && idxIn.replace(" ", "").matches(sRegexp)){
                        int i1 = Integer.parseInt(sArr[0]);
                        int i2 = Integer.parseInt(sArr[1]);

                        bw.append(i1+i2+"\n");
                    } else {
                        throw new Exception("2개의 숫자입력만 가능");
                    }
                    iTmp++;
                }
            } else {
                throw new IOException(" 숫자입력만 가능");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // A+B = ? N줄
    /*
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";

        try {
            idxIn = br.readLine();
            if (!(null != idxIn && idxIn.matches(sRegexp))) {
                throw new IOException(" 숫자입력만 가능");
            }else {
                for(int i=1;i<=Integer.parseInt(idxIn);i++){
                    sTmp = br.readLine();
                    if(!(null!= sTmp && sTmp.replace(" ", "").matches(sRegexp)) ){
                        System.out.println(" 숫자입력만 가능");
                    } else {
                        sArr = sTmp.split(" ");
                        int t1 = Integer.parseInt(sArr[0]);
                        int t2 = Integer.parseInt(sArr[1]);
                        if( !(t1>0 && t2<10 ) ){
                            System.out.println("0 < A, B < 10");
                        } else{
                            bw.append("Case #").append(i+": ").append(t1+" + "+t2).append(" = ").append(t1+t2+"\n");
                        }
                    }
                }
                bw.flush();
                br.close();
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 별찍기 1
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";

        try {
            idxIn = br.readLine();
            if (!(null != idxIn && idxIn.matches(sRegexp) && Integer.parseInt(idxIn)>=1 && Integer.parseInt(idxIn)<=100)) {
                throw new IOException(" 숫자입력만 가능");
            }else {
                for(int i=1;i<=Integer.parseInt(idxIn);i++){
                    for(int j=1;j<=i;j++){
                        bw.append("*");
                    }
                    bw.append("\n");
                }
                bw.flush();
                br.close();
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 별찍기2
    /* {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sTmp;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int k=1, l, iMax = 0;

        try {
            idxIn = br.readLine();
            if (!(null != idxIn && idxIn.matches(sRegexp) && Integer.parseInt(idxIn)>=1 && Integer.parseInt(idxIn)<=100)) {
                throw new IOException(" 숫자입력만 가능");
            }else {
                iMax = Integer.parseInt(idxIn);
                for(int i=1;i<=iMax;i++){
                    k=1;
                    while( k <= iMax ) {
                        if ( k <= (iMax-i) ) {
                            bw.append(" ");
                        } else {
                            bw.append("*");
                        }k++;
                    }
                    bw.append("\n");
                }
                bw.flush();
                br.close();
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // A개 숫자 중 B보다 작은 수 출력하기
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int idx = 0;

        try {
            idxIn = br.readLine();
            if ((null != idxIn && idxIn.replace(" ", "").matches(sRegexp) )) {sArr = idxIn.split(" ");
                int i1= Integer.parseInt(sArr[0]);
                int i2= Integer.parseInt(sArr[1]);

                if( i1>=1 && i2<=10000 ) {
                    idxIn = br.readLine(); // 비교군 입력

                    if(idxIn!=null && idxIn.replace(" ", "").matches(sRegexp)) {
                        sArr = idxIn.split(" ");

                        while (idx < i1) {
                            if( Integer.parseInt(sArr[idx]) < i2 ) bw.append(sArr[idx]).append(" ");
                            idx++;
                        }
                        bw.flush();
                    } else{
                        throw new IOException(" 숫자입력만 가능");
                    }
                } else{
                    throw new Exception("범위 내 숫자입력만 가능");
                }
            } else {
                throw new IOException(" 숫자입력만 가능");
            }
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    //  A+B - 5
    /*
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int idx = 0, iTmp=0;

        try {
            while(1==1){
                idxIn = br.readLine();
                if( null!= idxIn && idxIn.replace(" ", "").matches(sRegexp)){
                    if(!"0 0".equals(idxIn)) {
                        sArr = idxIn.split(" ");
                        bw.append(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]) + "\n");
                    } else{
                        break;
                    }
                } else{
                    throw new Exception(" 숫자입력만 가능");
                }
            }
            bw.flush();
            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    */

    // A+B - 4  무한입력 EOF
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn;
        String[] sArr = new String[2];
        String sRegexp = "^[0-9]+$";
        int idx = 0, iTmp=0;

        try {
            while(1==1){
                idxIn = br.readLine();
                if("-1".equals(idxIn)){
                    break;
                } else if( null!= idxIn && idxIn.replace(" ", "").matches(sRegexp)){
                    sArr = idxIn.split(" ");
                    bw.append(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]) + "\n");
                } else{
                    break;
                    //throw new Exception(" 숫자입력만 가능");
                }
            }
            bw.flush();
            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 더하기 사이클
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn;
        String sRegexp = "^[0-9]+$";
        String sNow = "", sFirst = "", sNext = "";
        char[] iArr = new char[2];
        String iTmp;
        int i=0;

        try {
            idxIn = br.readLine();
            if( null!= idxIn && idxIn.replace(" ", "").matches(sRegexp)&& Integer.parseInt(idxIn)>=0 && Integer.parseInt(idxIn)<=99){

                while( !(!"".equals(sNext)&& Integer.parseInt(sFirst)==Integer.parseInt(sNext) ) ){
                    if( i==0 ){
                        sFirst = idxIn;
                        sNow = idxIn;

                        if(Integer.parseInt(sNow)<10) {
                            sNow = "0"+sNow;
                        }
                    } else{
                        sNow = sNext;
                    }

                    iArr[0] = sNow.charAt(0);
                    iArr[1] = sNow.charAt(1);

                    iTmp = (Integer.parseInt(iArr[0]+"")+Integer.parseInt(iArr[1]+""))+"";

                    sNext = iArr[1]+String.valueOf(iTmp.charAt(iTmp.length()-1));
                    i++;
                }
            } else{
                throw new Exception(" 범위 내 숫자입력만 가능");
            }
            System.out.println(i);
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 배열 - 최소 최대값
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String idxIn, sMax="", sMin="";
        String sRegexp = "^[0-9]+$";
        int iTmp =0;

        try {
            idxIn = br.readLine();
            if( null!= idxIn && idxIn.replace(" ", "").matches(sRegexp)&& Integer.parseInt(idxIn)>=0 && Integer.parseInt(idxIn)<=1000000){
                int idx = Integer.parseInt(idxIn);
                idxIn = br.readLine();

                //if( idxIn.replace(" ", "").matches("^[0-9]+$") ){
                String []sArr = new String[idx];
                sArr = idxIn.split(" ");

                //최소, 최대값
                while(iTmp < idx ){
                    if("".equals(sMax)) sMax = sArr[iTmp];
                    if("".equals(sMin)) sMin = sArr[iTmp];

                    if( Integer.parseInt(sMin) > Integer.parseInt(sArr[iTmp]) ) {
                        sMin = sArr[iTmp];
                    } else if(  Integer.parseInt(sMax) < Integer.parseInt(sArr[iTmp]) ){
                        sMax = sArr[iTmp];
                    }
                    iTmp++;
                }

                System.out.println( sMin+" "+sMax);

                //} else{
                //    throw new Exception(" 숫자입력만 가능");
                //}
            } else{
                throw new Exception(" 범위 내 숫자입력만 가능");
            }
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 최대값과 그 순서
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] sTmpArr = new String[9];
        String sRegexp = "^[0-9]+$";
        String sMax = "", sIdxMax="";

        try {
            for(int i=0;i<9;i++){
                sTmpArr[i] = br.readLine();
                if(!( null!= sTmpArr[i] && sTmpArr[i].replace(" ", "").matches(sRegexp)&& Integer.parseInt(sTmpArr[i])>=0 && Integer.parseInt(sTmpArr[i])<=100) ){
                    throw new Exception(" 범위 내 숫자입력만 가능");
                }

                if( "".equals(sMax) || Integer.parseInt(sMax) < Integer.parseInt(sTmpArr[i]) ) {
                    sMax = sTmpArr[i];
                    sIdxMax = String.valueOf(i+1);
                }
            }

            bw.append(sMax).append("\n").append(sIdxMax);
            bw.flush();

            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 숫자가 몇개인가
    /*
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sRegexp = "^[0-9]+$";
        String tmp = "";
        int [] iArr = new int[3];
        int [] iArrCnt = new int[10];
        long rslt = 1;
        int i=0;

        try {
            for (i = 0; i < 3; i++) {
                tmp = br.readLine();
                //if (!(null == tmp || tmp.matches("^[0-9]+$") || Integer.parseInt(tmp) <= 0)) {

                    iArr[i] = Integer.parseInt(tmp);
                //} else {
                //    throw new Exception(" 자연수만 입력가능");
                //}
            }
            i = 0;
            for (int j : iArr) {
                rslt *= j;
            }
            tmp = String.valueOf(rslt);

            while (i < tmp.length()) {
                iArrCnt[Integer.parseInt(tmp.charAt(i)+"")]++;
                i++;
            }
            for (int j : iArrCnt)
                bw.append(String.valueOf(j)).append("\n");
            bw.flush();

            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    */

    // 숫자의 개수
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sRegexp = "^[0-9]+$";
        String tmp = "";
        int [] iArr = new int[3];
        int [] iArrCnt = new int[10];
        long rslt = 1;
        int i=0;

        try {
            for (i = 0; i < 3; i++) {
                tmp = br.readLine();
                iArr[i] = Integer.parseInt(tmp);
            }
            i = 0;
            for (int j : iArr) {
                rslt *= j;
            }
            tmp = String.valueOf(rslt);

            while (i < tmp.length()) {
                iArrCnt[Integer.parseInt(tmp.charAt(i)+"")]++;
                i++;
            }
            for (int j : iArrCnt)
                bw.append(String.valueOf(j)).append("\n");


            bw.flush();

            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 넘김 20210621
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idxMax = 10, iTmp = 0;
        int [][] iArr = new int[idxMax][2];
        String tmp="";
        int idx=0,t=0, o = 42;
int r = 0;
        try{
            while(t++<idxMax) {
                tmp = br.readLine();
                iTmp = Integer.parseInt(tmp) % o;
                iArr[idx][0] = iTmp;
                if( idx == 0 ) idx++;
                else
                for (int i = 0; i <= idx; i++){
                    if (iArr[i][0] == iArr[idx][0]) break;
                    else if (i == t){ iArr[idx][1] = 1; idx++; r=r+1;}
                }
                *//*if(idx==0) iArr[idx++] = iTmp;
                else {
                    for (int i = 0; i < iArr.length; i++) {
                        if (i > idx) iArr[idx++] = iTmp;
                        else if (iArr[idx] == iArr[i]) break;
                    }
                    System.out.println(idx + "번째 " + iArr[idx]);
                }*//*
            }
            System.out.println(idx);

            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    // 가짜평균
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int numberOfSubject = Integer.parseInt(br.readLine());
            double []gotScore = new double[numberOfSubject];
            double maxScore = 0, sum=0;

            String tmp = br.readLine();
            String[] sArr = tmp.split(" ");

            for(int i=0;i<sArr.length;i++){
                gotScore[i] = Double.valueOf(sArr[i]);
                if(i==0) maxScore = gotScore[i];
                else if(maxScore < gotScore[i]) maxScore = gotScore[i];
            }

            for(int i=0;i<numberOfSubject;i++){
                sum += gotScore[i]/maxScore*100;
            }
            System.out.println(sum/numberOfSubject);

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }*/

    // OX퀴즈
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String inNum = br.readLine();
            String inStr = "";
            String[] answer = null;
            int score = 0;
            for(int i = 0; (i < Integer.parseInt(inNum));i++){
                inStr = br.readLine();
                answer = inStr.split("X");
                score =0;
                for(String s:answer){
                    if(!"".equals(s)) for(int j=1;j<=s.length();j++) score += j;
                }
                bw.append(score+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }*/
    
    // 평균은 넘겠지
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String inNum = br.readLine();
            String aStudent= "";
            String[] sScore = null;
            int [] inArrScore;
            int inNumOfSubj = 0;
            double averageOfaCase = 0, numUpperAverage = 0;
            double result = 0, numOfAcase=0, numOfHigh = 0;

            for(int i = 0; (i < Integer.parseInt(inNum));i++){
                aStudent = br.readLine();
                sScore = aStudent.split(" ");
                if( !(!"".equals(sScore[0]) && 1<=Integer.parseInt(sScore[0]) && Integer.parseInt(sScore[0]) <=1000
                        && aStudent.replace(" ", "").matches("^[0-9]+$")) ){
                    throw new IOException(" 범위 내 숫자입력만 가능");
                } else{

                    numOfAcase = Integer.parseInt(sScore[0]);
                    sScore[0] = "0";
                    averageOfaCase = calcAvenue(numOfAcase, sScore );

                    //평균 이상의 학생
                    numOfHigh = 0;
                    for(String one:sScore) {
                        if (averageOfaCase < Double.parseDouble(one)) numOfHigh += 1;
                    }
                    result = Math.round( (numOfHigh/numOfAcase)*100000 )/1000.000;
                    DecimalFormat df = new DecimalFormat("0.000");
                    bw.append( df.format(result)+"%\n" );
                }
            }
            bw.flush();
            bw.close();
            br.close();

        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }
    static private double calcAvenue(double numOfStudent, String[] scoreOfOne){
        double ave=0;

        // 한 케이스의 전체 평균 구하기
        for(int i=1;i<scoreOfOne.length;i++) {
            ave += Integer.parseInt(scoreOfOne[i]);
        }
        ave = (double)ave/numOfStudent;

        return ave;
    }*/

    // 셀프넘버 찾기(생성자가 없는 숫자)
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean []rslt = new boolean[10001];
        int a=0, b=0;
        try {
            // 처음 양의 정수는 2자리수. 1~10000중 self number인것?
            for(int i=1;i<=10000;i++){
                a = 0;
                do{
                    if( a==0) a=i;
                    a = calcArr( a ); /// 풀이2. 몫+나머지
                    if(a<=10000) {
                        rslt[a] = true; // 셀프넘버가 아님.
                    }

                    if( b!=0 && b==a) break;
                    b = a;
                }while(a<=10000);
            }
            for(int i=1;i<rslt.length;i++){
                if(!rslt[i]) bw.append(i+"\n");
            }
            bw.flush();
            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static int calcArr(int in){
        String s = String.valueOf(in);
        int r = in;
        for(int j =0 ; j<s.length(); j++){
            r +=(s.charAt(j)-'0');
        }
        return r;
    }*/

    //등차수열
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfHansu = 0;

        try {
            // n이 주어지면 n안에 한수가 몇개 있는지?(한수는 등차수열)
            String sIn = br.readLine();

            for(int i=1;i<=Integer.parseInt(sIn);i++){
                if( calcNum(i) ) numberOfHansu+=1;
            }
            System.out.println(numberOfHansu);
            br.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //true : 한수. count함, false:한수 아님.
    private static boolean calcNum(int in){
        boolean r = false;
        String s = String.valueOf(in);
        if( 1== s.length() || 2== s.length() ) return true;

        int []aNumber = new int[s.length()];

        for(int j =0 ; j<s.length(); j++){
            aNumber[j]=s.charAt(j)-'0';
        }
        int d = aNumber[1]-aNumber[0]; // 수열의 d
        int idx = 0;
        while(idx<aNumber.length-1){ //length가 3인경우 idx는 0,1,2이므로 1까지 돌고 끝나야 한다.
            if( aNumber[idx+1]!=aNumber[idx]+d ){
                break;
            }
            else idx++;
        }

        if( idx== (aNumber.length-1)){
            r = true;
        }
        return r;
    }*/

    // 아스키코드 출력
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int c = s.charAt(0);
            System.out.printf("%d", c);

        } catch (IOException ioe) {
        }
    }*/

    // N자리 숫자들의 합
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String no = br.readLine();
            String inStr = br.readLine();
            long sum = 0;
            for(int i=0;i<inStr.length();i++){
                sum+=Integer.parseInt( inStr.charAt(i)+"");
            }
            System.out.println(sum);

        } catch (IOException ioe) {
        }
    }*/

    //문자열 내 알파벳 index출력하기
    /*{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String inStr = br.readLine(); // -65가 idx
            int aChar = -1;
            int []al = new int[26];
            for(int i=0;i<al.length;i++){
                al[i]=-1;
            }
            int minusAscii = -97;
            for(int i=0;i<inStr.length();i++){
                aChar = inStr.charAt(i);
                al[aChar+minusAscii] = i;
            }

            for(int i:al) bw.append(i+" ");
            bw.flush();

        } catch (IOException ioe) {
        }
    }*/

    //문자열 위치 출력
    /*{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            try {
                String inStr = br.readLine(); // -65가 idx
                int aChar = -1;
                int []al = new int[26];
                for(int i=0;i<al.length;i++){
                    al[i]=-1;
                }
                int minusAscii = -97;
                for(int i=0;i<inStr.length();i++){
                    aChar = inStr.charAt(i);
                    if(al[aChar+minusAscii]==-1) al[aChar+minusAscii] = i;
                }


                for(int i:al) bw.append(i+" ");
                bw.flush();
                bw.close();
                br.close();

            *//*for(int i=0;i<al.length;i++) {
                if(i==al.length-1) bw.append(al[i]+"");
                else bw.append(al[i]+" ");
            }*//*
            } catch (IOException ioe) {
            }
        }*/

    /* 하다 말았음. 다른 노트북으로 했을것임.
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            //입력
            String sNo, sNo2;
            sNo = br.readLine();
            int tNo = Integer.parseInt(sNo);
            String [][]sArr = new String[tNo][2];
            String []rArr = null;
            for(int i=0;i<tNo;i++){
                sNo2 = br.readLine();
                sArr[i] = sNo2.split(" ");
            }

            //문자열
            int reNum = 0;
            String tmpStr = "";
            int j=0, k=0, iRe = 0;
            for(int i=0; i<tNo;i++){
                tmpStr = sArr[i][1];
                j=0; k=0; iRe =Integer.parseInt(sArr[i][0]);
                while( j<tmpStr.length() ){
                    while(k<iRe){ bw.append(tmpStr.charAt(j)); k++; }
                }
                bw.append(" ");
            }bw.flush();

        } catch (IOException ioe) {
        }
    }
    */
}

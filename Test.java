package day20211027;

public class Test {
    public static void main(String[] args){
        int year=2021;
        if((0==year%4&&year%100==0)||year%400==0){
            System.out.println(year+"闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
    public static void main5(String[] args){
        int num=10;
        if(num%2==0){
            System.out.println("num是偶数");
        }else{
            System.out.println("num是奇数");
        }
    }
    public static void main4(String[] args){
        int score=89;
        if(score>=90&&score<=100){
            System.out.println("优秀");
        }else if(score>=80&&score<90){
            System.out.println("良好");
        }else if(score>=70&&score<80){
            System.out.println("一般");
        }else if(score>=60&&score<70){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
    public static void main3(String[] args){
        int a=20;
        int b=20;
        if(a>b){
            System.out.println("a 大于 b");
        }else if(a<b){
            System.out.println("a 小于 b");
        }else{
            System.out.println("a 等于 b");
        }
    }
    public static void main2(String[] args) {
        int score = 86;
        if (score >= 90) {
            System.out.println("优秀");
        } else {
            System.out.println("一般");
        }
    }



    public static void main1(String[] args){
        int a=10;
        int b=20;
        int avg=a+((b-a)>>1);
        System.out.println(avg);
    }
}



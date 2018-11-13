package jp.ac.uryukyu.ie.e185714;

public class main {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException error){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(error.getMessage());
        }
    }
}

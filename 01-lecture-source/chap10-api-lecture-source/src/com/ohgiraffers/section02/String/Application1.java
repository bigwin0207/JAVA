package com.ohgiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {
        /* String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
        /*
        * charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자체계를 의미하며
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundException 이 발생한다.
        * */

        // charAt() 출력 예시
        String str = "apple";

        for(int i = 0; i < str.length(); i++){
            System.out.println("chatAt(" + i + ") : " + str.charAt(i));
        }
        // charAt() 출력 오류 예시
        /*String str = "apple";

        for(int i = 0; i < str.length(); i++){
            System.out.println("chatAt(" + i + ") : " + str.charAt(i));
        }*/

        /*
        * compareTO() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를
        * 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        // compareTO() 출력 예시
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        /* 두 문자열이 같을 경우 */ //0
        System.out.println("compareTo() : " + (str2.compareTo(str3))); // + 뒤에 괄호안으로 넣어줘야 한다.
        /* 두 문자열이 다를 경우 */
        System.out.println("compareTo() : " + (str4.compareTo(str2))); // -32 인자로 전달한 값이 문자열보다 작아서 음수 생성
        System.out.println("compareTo() : " + (str2.compareTo(str4))); //  32 인자로 전달한 값이 문자열보다 커서 양수 생성

        System.out.println("compareTo() : " + (str2.compareTo(str5))); // -5
        System.out.println("compareTo() : " + (str5.compareTo(str2))); // 5

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열을 반환한다.
        * 원본 문자열에는 영향을 주지 않는다.
        * */

        // concat() 출력 예시
        System.out.println("concat() : " + (str2.concat(str5))); //javaoracle
        System.out.println("str2 : " + str2); //java

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        // indexOf() 출력 예시 ( a라는 문자를 어느 인덱스에 위치해 있는지 알 수 있다.)
        String indexOf = "java oracle";
        System.out.println("indexOf('a')" + indexOf.indexOf('a')); // 1

        // 일치하지 않을 경우 -1을 반환한다. (문자열에서 z는 존재하지 않기 때문에 일치하지 않는다.)
        System.out.println("indexOf('z')" + indexOf.indexOf('z')); // -1

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터하고 처음 일치하는 위치의 인덱스를 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        // lastIndexOf() 출력 예시 (문자열은 공백도 취급하기 때문에 공백도 포함한다.)
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a')); // 7
        // 일치하지 않을 경우 -1을 반환한다.
        System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z')); // -1

        /* trim() : 문자열의 앞 위에 공백을 제거한 문자열을 반환한다. */

        // trim() 출력 예시
        String trimstr = "   java   "; // 앞 뒤 공백 3칸

        // trim() 미적용시
        System.out.println("trimstr = #" + trimstr +"#"); // #   java   #
        // trim() 적용시
        System.out.println("trimstr = #" + trimstr.trim() +"#"); // #java#

        // 원본 문자열에는 영향을 주지 않는다.
        System.out.println("trimstr = #" + trimstr +"#"); // #   java   #

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환 시킨다.
        * toUpperCase() : 모든 문자를 대문자로 변환 시킨다.
        * */

        // 출력 예시
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        // 원본에는 영향을 주지 않는다.
        System.out.println("caseStr = " + caseStr);

        /*
        * substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * */

        // 출력 예시
        String javaoracle = "javaoracle";
        System.out.println("substring(3,6)" +javaoracle.substring(3,6)); // 3번째 문자열 부터 6번째 문자열 전까지 자른다.
        System.out.println("substring(3)" + javaoracle.substring(3)); // 3번째 문자열전까지 자른다

        // 원본에는 영향을 주지 않는다.
        System.out.println("javaoracle : " + javaoracle);

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다. */

        // 출력 예시
        System.out.println("replace() : " + javaoracle.replace("java","python")); //javapython

        // 원본에는 영향을 주지 않는다.
        System.out.println("javaoracle : " + javaoracle);

        /* length() : 문자열의 길이를 정수형으로 반환한다. */

        // length() 출력 예시
        System.out.println("length() : " + javaoracle.length()); // 10

        System.out.println("빈 문자열의 길이 : " + (" java ".length())); // 6

        /* isEmpty() : 문자열의 길이가 0이면 true를 아니면 false를 반환한다.*/

        // isEmpty() 출력 예시
        System.out.println("isEmpty() : " +"".isEmpty());   //true
        System.out.println("isEmpty() : " +" ".isEmpty());  //false

        /* 길이가 0인 문자열은 null과는 다르다. */
        String str6 = null;
        String str7 = "";












    }
}

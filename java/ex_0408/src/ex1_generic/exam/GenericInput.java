package ex1_generic.exam;

import java.util.Scanner;

public class GenericInput {

    public static <T> T inputValue(Class<T> clazz, Scanner sc) {
        System.out.print("값 입력: ");
        
        if (clazz == Integer.class) {
            return clazz.cast(sc.nextInt());
        } else if (clazz == Double.class) {
            return clazz.cast(sc.nextDouble());
        } else if (clazz == String.class) {
            return clazz.cast(sc.next());
        }
        
        throw new IllegalArgumentException("지원하지 않는 타입");
    }
}
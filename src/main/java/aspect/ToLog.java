package aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //실행중에 가로챈다
@Target(ElementType.METHOD) //메서드만 사용
public @interface ToLog {

}

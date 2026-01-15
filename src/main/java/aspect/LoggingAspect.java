package aspect;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

//    @Around("execution(* service.*.*(..))") //AspectJ
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();

        logger.info("Method : " + methodName + " with parameters " + Arrays.asList(arguments) + " will excuted");

        Comment comment = new Comment();
        comment.setText("고라니 안귀여워");
        Object [] newArguments = {comment};

        Object  returnByMethod = joinPoint.proceed(newArguments);

        logger.info("Method executed and returned " + returnByMethod);

        return "FAILED";
    }
}

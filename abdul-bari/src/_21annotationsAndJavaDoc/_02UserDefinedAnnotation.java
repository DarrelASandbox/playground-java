package src._21annotationsAndJavaDoc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value = { ElementType.LOCAL_VARIABLE, ElementType.TYPE })
@Inherited
@Repeatable(MyAnno2.class)

@interface MyAnno {
  String name();

  String project();

  String date() default "today";

  String version() default "13";
}

@Documented
@Target(value = { ElementType.LOCAL_VARIABLE, ElementType.TYPE })
@Inherited
@interface MyAnno2 {
  MyAnno[] value();
}

@MyAnno(name = "Jay", project = "Bank")
public class _02UserDefinedAnnotation {
  //@MyAnno(name="Jay")
  int data;

  //@MyAnno(name="Jay")
  public static void main(String[] args) {
    //@MyAnno(name="Jay")
    int x;
    x = 10;
    System.out.println(x);
  }

}

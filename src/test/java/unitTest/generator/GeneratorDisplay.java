package unitTest.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

/*
kita juga bisa melakukan extends ke kontrak implementasi dari interface DisplayNameGenerator
 */
public class GeneratorDisplay implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> aClass) {
        return "Test "+aClass.getName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> aClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
//        String methodName = super.generateDisplayNameForMethod(aClass,method);
//        return "Test "+methodName;
        return "Test "+aClass.getName()+" . "+method.getName();
    }
}

package Lab.ReflectionAndAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Task 1
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);

        System.out.println(clazz.getSuperclass());

//        Class[] interfaces = clazz.getInterfaces();
//        for(Class  anInterface : interfaces){
//            System.out.println(anInterface);
//        }

        // The same action as the one in the comment above
        Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);

        Reflection reflectionObject = clazz.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);

        // Task 2
        Method[] declaredMethods = clazz.getDeclaredMethods();

        Comparator<Method> comparator = Comparator.comparing(Method::getName);

        Set<Method> getters = new TreeSet<>(comparator);
        Set<Method> setters = new TreeSet<>(comparator);

        for (Method method : declaredMethods){
            String name = method.getName();
            if (name.startsWith("get")){
                getters.add(method);
            } else if (name.startsWith("set")){
                setters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.println(getter.getName() + " will return class " + getter.getReturnType().getName());
        }

        for (Method setter : setters) {
            System.out.println(setter.getName() + " and will set field of class " + setter.getParameterTypes()[0].getName());
        }
    }
}

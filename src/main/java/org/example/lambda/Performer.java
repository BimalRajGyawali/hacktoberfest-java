/*
A functional interface can only have one abstract method.
 */
package org.example.lambda;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-04
 */
@FunctionalInterface
public interface Performer {
    Integer performTask(Integer a, Integer b);
}

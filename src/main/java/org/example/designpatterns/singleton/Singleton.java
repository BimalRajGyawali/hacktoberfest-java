/*
Singleton Pattern says that just
"define a class that has only one instance and provides a global point of access to it".
 */
package org.example.designpatterns.singleton;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-11
 */
public class Singleton {

    //static instance which is returned everytime from the getSingleInstance()
    private static Singleton instance = new Singleton();

    //instance variable
    private Integer num;

    //private constructor
    private Singleton() {
        this.num = 1;
    }

    //returns same instance everytime
    public static Singleton getSingleInstance() {
        return instance;
    }

    public void incrementNum() {
        this.num++;
    }

    //getter for num
    public Integer getNum() {
        return this.num;
    }

}

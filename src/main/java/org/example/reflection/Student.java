package org.example.reflection;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-02
 */
public class Student {
    private Integer id;

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anotherMethod() {
        //code here
    }

}

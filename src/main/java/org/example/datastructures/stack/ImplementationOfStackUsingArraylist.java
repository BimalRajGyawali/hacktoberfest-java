package org.example.datastructures.stack;
// ----------------------------------Implementation of Stack Data Structure using Arraylist------------------------------------------
import java.util.*;
public class ImplementationOfStackUsingArraylist{
    static class stack{
       static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size()==0;
        }
        public static void push(int data) {
            list.add(data);
            return;
        }
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int x =list.get(list.size()-1);
             list.remove(list.size()-1);
            return x;
        }
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            int x =list.get(list.size()-1);
            return x;
        }
    }
    public static void main(String[] args) {
        stack S = new stack();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}

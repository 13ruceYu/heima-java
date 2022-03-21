package com.bobo.d5_collection_list;

import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        // 压栈，入栈
        stack.addFirst("1");
        stack.push("2");
        stack.addFirst("3");
        stack.push("4");
        System.out.println(stack);

        // 出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        // 队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}

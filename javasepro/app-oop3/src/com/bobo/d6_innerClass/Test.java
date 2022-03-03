package com.bobo.d6_innerClass;

public class Test {
    private int heartbeat = 100;
    public class Heart {
        private int heartbeat = 110;
        public void show() {
            int heartbeat = 80;
            System.out.println(this.heartbeat); // 110
            System.out.println(heartbeat); // 80
            System.out.println(Test.this.heartbeat);
        }
    }
}

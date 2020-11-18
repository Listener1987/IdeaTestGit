package com.dxb.github;

import org.junit.Test;

public class TestJava {
    @Test
    public void testHello(){
        Hellogit hello = new Hellogit();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}

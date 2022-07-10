package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class TeaTest {
    public static void main(String[] args) {
        // 桥接模式  使用抽象和实现可以沿着各自的维度进行变化 不再有固定的绑定关系
        KissTea kissTea = new KissTea(new Large());
        System.out.println(kissTea.getType());
    }
}

package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class TestAdapter implements Target{
    private Supplier supplier;

    public TestAdapter(Supplier supplier) {
        this.supplier = supplier;
    }


    @Override
    public String supply() {
        return supplier.doSupplier();
    }

    public static void main(String[] args) {
        //不同的供应商 传入adapter   这个case下 我们需要的 提供目标接口的手机供应商 而我们的本身supplier 不支持，但是在 adapter中 做了适配
        // 手机supplier 无需再去实现 目标接口
        TestAdapter testAdapter = new TestAdapter(new Supplier("apple"));
        String supply = testAdapter.supply();
        System.out.println(supply);
    }
}

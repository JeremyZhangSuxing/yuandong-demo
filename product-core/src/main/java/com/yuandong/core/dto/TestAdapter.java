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
        //不同的供应商 传入adapter   这个case下我们没有传入
        TestAdapter testAdapter = new TestAdapter(new Supplier("apple"));
        String supply = testAdapter.supply();
        System.out.println(supply);
    }
}

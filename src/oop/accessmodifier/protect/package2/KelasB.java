package oop.accessmodifier.protect.package2;

import oop.accessmodifier.protect.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}

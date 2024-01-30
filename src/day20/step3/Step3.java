package day20.step3;

public class Step3 {
    public static void main(String[] args) {
        //1.구현 객체
        InterfaceCimpl impl1 = new InterfaceCimpl();
        //2.자동 형변환
        InterfaceA ia = impl1;
        ia.methodA();
        //ia.methodB();
        //ia.methodC();
        InterfaceB ib = impl1;
        //ib.methodA();
        ib.methodB();
        //ib.methodC();
        InterfaceC ic = impl1;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}

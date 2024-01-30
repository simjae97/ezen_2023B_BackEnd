package day20.step3;

public class InterfaceCimpl implements InterfaceC{
    //추상을 물려받았기 떄문에 자식인터페이스를 구현할때 부모 인터페이스도 구현해야한다
    @Override
    public void methodA() {
        System.out.println("InterfaceCimpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCimpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCimpl.methodC");
    }
}

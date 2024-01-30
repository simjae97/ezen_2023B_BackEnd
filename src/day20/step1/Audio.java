package day20.step1;

public class Audio implements RemoteControl{

    //멤버
    //1.필드 (인스턴스 멤버 vs 정적멤버)
    private int volume;
    private int memoryvolume;
    //2.생성자(오버로딩)
    //3.메소드(인스턴스 멤버 vs 정적 멤버) (오버로딩+오버라이딩)
    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            this.volume = MAX_VOLUME;
        }
        else if(volume < MIN_VOLUME){
            this.volume=MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 : "+this.volume);
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryvolume = this.volume;
            System.out.println("무음처리합니다");
            setVolume(MIN_VOLUME);
        }
        else{
            System.out.println("무음해제합니다");
            setVolume(this.memoryvolume);
        }
    }
}

package day23.step1;

public class SimpleList<E> {

    private Object[] array;
    public int size;

    public SimpleList(){
        array = new Object[0];
    }

    //add함수
    public boolean add(E element){
        //1.배열 사이즈 ㅈ ㅡㅇ가
        this.size++;
        //2.배열 길이의 마지막 인덱스의 매개변수 저장
            //배열의 메모리 재할당 해서 가변길이 만들기
            //1.현재 size만큼 배열 선언
        Object[] newArray = new Object[size];
            //2.배열 복사
        for(int i=0; i< this.array.length; i++){
            newArray[i] = this.array[i];
        }
            //3.기존 배열 필드에 새로운 배열 대입
        array = newArray;
        array[size-1] = element;
        return true;
    }

    public E get(int index){
        return (E)this.array[index];
    }

    public int size(){
        return this.size;
    }

    public boolean remove(int index){
        //배열의 사이즈 감소
        this.size--;
        int j = 0;
        Object[] newArray = new Object[size];
        for(int i=0; i<this.array.length; i++){
            newArray[j] = array[i];
            //삭제할 인덱스 빼고
            if(i!= index){
                j++;
            }
        }
        array = newArray;
        return true;
    }

    @Override
    public String toString() {
        String str ="[";
        for( int i = 0; i<this.array.length; i++){
            str += array[i].toString();
            str += i != this.array.length-1?",":"";
        }
        return str+"]";
    }
}

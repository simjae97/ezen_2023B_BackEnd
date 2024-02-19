package day23.step1;

import java.util.ArrayList;

public class SimpleMAP<K,M> {
    private ArrayList<K> key; //키 값을 받아올 ArrayList<K타입>
    private ArrayList<M> value; // 밸류값을 받아올 ArrayList<M타입> 두 리스트의 인덱스가 같은것끼리 키-값 쌍을 묶음

    public SimpleMAP(){ //생성시 key와 value에 새로운 배열을 동적 할당한다
        key = new ArrayList<>();
        value = new ArrayList<>();
    }

    public boolean put(K k, M m){ //키-값을 대입
        if(key.contains(k)){ //만약 key에 동일한 값이 존재한다면 새로 동적할당배열에 add하지 않고 그 키의 인덱스와 같은 밸류배열의 인덱스를 갱신한다
            value.set(key.indexOf(k),m);
        }
        else{ //없으면 인풋
            key.add(k);
            value.add(m);
        }
        return true;
    }

    public M get(K key){ //값을 가져옴
        return value.get(this.key.indexOf(key));
    }

    public M remove(K k){ //값을 뺌
        if(key.contains(k)){
            M result = value.remove(key.indexOf(k));
            key.remove(key.indexOf(k));
            return result;
        }
        return null;
    }

    public int size(){
        return key.size();
    }

    @Override
    public String toString() {
        String str ="{";
        for( int i = 0; i<this.key.size(); i++){
            str += key.get(i).toString()+":";
            str += value.get(i).toString();
            str += i != this.key.size()-1?",":"";
        }
        return str+"}";
    }
}

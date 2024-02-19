package day23.step1;

import java.util.ArrayList;

class SimpleMap2<K, M> {
    private ArrayList<MapEntry<K, M>> entries;

    public SimpleMap2() {
        this.entries = new ArrayList<>();
    }

    public void put(K key, M value) {
        MapEntry<K, M> newEntry = new MapEntry<>(key, value);
        for (MapEntry<K, M> entry : entries) {
            if (entry.getKey().equals(key)) {
                // 이미 존재하는 키라면 값 업데이트
                entry.setValue(value);
                return;
            }
        }

        // 기존 키가 없다면 새로운 엔트리 추가
        entries.add(newEntry);
    }

    public M get(K key) {
        for (MapEntry<K, M> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
            return null; // 키가 없을 경우 null 반환
    }
    public int size() {
        return entries.size();
    }
    public M remove(K key){ //값을 뺌
        for(MapEntry<K,M> entry:entries){
            if (entry.getKey().equals(key)){
                entries.remove(entries);
                return entry.getValue();
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "SimpleMap2{" +
                "entries=" + entries.toString() +
                '}';
    }

}
class MapEntry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public void setKey(K key){
        this.key = key;
    }

    @Override
    public String toString() {
        return "MapEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
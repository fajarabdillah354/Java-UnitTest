package unitTest;

public class Calculator {

    public Integer add(Integer first, Integer second){
        return first + second;
    }

    public Integer divide(Integer first, Integer second){
        if (second == 0){
            throw new IllegalArgumentException("tidak boleh membagi dengan 0");
        }else {
            return first/second;
        }
    }

    public Integer multiple(Integer first, Integer second){
        Integer hasil = first * second;

        return hasil;
    }


}

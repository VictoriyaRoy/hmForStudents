package ua.com.samsungitschool;

import java.util.Collections;
import java.util.List;

public class ListExtension implements IListDeleteByFilter<Integer>{


    @Override
    public List<Integer> deleteFromList(List<Integer> list, Integer deleteFilterKey) {
        int count = Collections.frequency(list,deleteFilterKey);
        for (int i=0; i<count;i++){
            list.remove(deleteFilterKey);
        }
        return list;
    }
}

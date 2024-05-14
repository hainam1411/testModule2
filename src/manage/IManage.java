package manage;

import model.Patient;

import java.util.List;

public interface IManage<T> {
    void add(T t);
    boolean delete(int id);
    int findById(int id);
    List<T> findAll();
}

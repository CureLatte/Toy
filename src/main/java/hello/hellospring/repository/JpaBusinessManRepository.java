package hello.hellospring.repository;

import hello.hellospring.domain.BusinessMan;
import hello.hellospring.domain.Store;

import java.util.List;
import java.util.Optional;

public class JpaBusinessManRepository implements BusinessManRepository {

    @Override
    public BusinessMan save(BusinessMan businessMan) {
        return null;
    }

    @Override
    public Optional<BusinessMan> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BusinessMan> findAll() {
        return null;
    }

    @Override
    public BusinessMan update(Long id, String column, String data) {
        return null;
    }

    @Override
    public BusinessMan delete(Long id) {
        return null;
    }

    @Override
    public Boolean registerStore(Store store) {
        return null;
    }
}

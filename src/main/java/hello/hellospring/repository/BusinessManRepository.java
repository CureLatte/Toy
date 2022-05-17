package hello.hellospring.repository;

import hello.hellospring.domain.BusinessMan;
import hello.hellospring.domain.Store;

import java.util.List;
import java.util.Optional;

public interface BusinessManRepository {
    BusinessMan save(BusinessMan businessMan);
    Optional<BusinessMan> findById(Long id);
    List<BusinessMan> findAll();
    BusinessMan update(Long id, String column, String data );
    BusinessMan delete(Long id);
    Boolean registerStore(Store store);
}

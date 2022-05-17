package hello.hellospring.repository;

import hello.hellospring.domain.BusinessMan;
import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusinessManRepositoryTest {

    JpaBusinessManRepository repository = new JpaBusinessManRepository();

    @Test
    public void save_is_right(){
        // Given
        BusinessMan businessMan = new BusinessMan();
        businessMan.setId(1L);
        businessMan.setName("spring");
        businessMan.setEmail("test@naver.com");
        businessMan.setPhone("010-1234-1234");

        // When
        repository.save(businessMan);

        // Then
        BusinessMan result = repository.findById(businessMan.getId()).get();
        Assertions.assertEquals(businessMan, result);
        assertThat(businessMan).isEqualTo(result);

    }

    @Test
    public void find_by_id(){
        // Given
        BusinessMan businessMan = new BusinessMan();
        businessMan.setId(1L);
        businessMan.setName("spring");
        businessMan.setEmail("test@naver.com");
        businessMan.setPhone("010-1234-1234");
        repository.save(businessMan);

        // When
        BusinessMan result = repository.findById(1L).get();

        // Then
        Assertions.assertEquals(businessMan, result);
        assertThat(businessMan).isEqualTo(result);
    }

    @Test
    public void findAll_right(){
        // Given
        BusinessMan businessMan1 = new BusinessMan();
        businessMan1.setId(1L);
        businessMan1.setName("spring");
        businessMan1.setEmail("test@naver.com");
        businessMan1.setPhone("010-1234-1234");
        repository.save(businessMan1);

        BusinessMan businessMan2 = new BusinessMan();
        businessMan2.setId(1L);
        businessMan2.setName("spring");
        businessMan2.setEmail("test@naver.com");
        businessMan2.setPhone("010-1234-1234");
        repository.save(businessMan2);

        // When
        List<BusinessMan> result =  repository.findAll();

        // Then
        Assertions.assertEquals(businessMan1, result.get(0));
        Assertions.assertEquals(businessMan2, result.get(1));
    }

    @Test
    public void update(){
        // Given
        BusinessMan businessMan1 = new BusinessMan();
        businessMan1.setId(1L);
        businessMan1.setName("spring");
        businessMan1.setEmail("test@naver.com");
        businessMan1.setPhone("010-1234-1234");
        repository.save(businessMan1);

        // When
        repository.update(1L, "name", "test");

        // Then
        Assertions.assertEquals(businessMan1.getName(), "test");
    }

    @Test
    public void delete(){
        // Given
        BusinessMan businessMan1 = new BusinessMan();
        businessMan1.setId(1L);
        businessMan1.setName("spring");
        businessMan1.setEmail("test@naver.com");
        businessMan1.setPhone("010-1234-1234");
        repository.save(businessMan1);

        // When
        repository.delete(1L);

        // Then
        Assertions.assertNull(repository.findById(1L));

    }




}



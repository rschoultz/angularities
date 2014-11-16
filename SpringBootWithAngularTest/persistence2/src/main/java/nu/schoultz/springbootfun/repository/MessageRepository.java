package nu.schoultz.springbootfun.repository;

import nu.schoultz.springbootfun.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {

}

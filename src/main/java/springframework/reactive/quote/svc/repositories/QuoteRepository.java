package springframework.reactive.quote.svc.repositories;

import springframework.reactive.quote.svc.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


/**
 * Created by VenD-Sehrish on 09/09/18.
 */
public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {
}

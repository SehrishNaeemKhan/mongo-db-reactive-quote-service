package springframework.reactive.quote.svc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import springframework.reactive.quote.svc.domain.Quote;
import springframework.reactive.quote.svc.repositories.QuoteRepository;

@RestController
public class QuoteController {

    @Autowired
    QuoteRepository quoteRepository;

    @GetMapping("/quotes")
    public Flux<Quote> getQuotes(){
        return quoteRepository.findAll();
    }
}

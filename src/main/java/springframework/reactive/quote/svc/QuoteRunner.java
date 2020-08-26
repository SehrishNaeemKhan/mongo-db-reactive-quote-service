package springframework.reactive.quote.svc;

import org.springframework.stereotype.Component;
import springframework.reactive.quote.svc.client.StockQuoteClient;
import springframework.reactive.quote.svc.domain.Quote;
import org.springframework.boot.CommandLineRunner;
import reactor.core.publisher.Flux;

@Component
public class QuoteRunner implements CommandLineRunner {

    private final StockQuoteClient stockQuoteClient;

    public QuoteRunner(StockQuoteClient stockQuoteClient) {
        this.stockQuoteClient = stockQuoteClient;
    }

    @Override
    public void run(String... args) throws Exception {
        Flux<Quote> quoteFlux = stockQuoteClient.getQuoteStream();

        quoteFlux.subscribe(System.out::println);
    }
}

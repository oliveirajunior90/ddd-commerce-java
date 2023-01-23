package br.com.commerce.domain;
import br.com.commerce.domain.Identifier;
import br.com.commerce.domain.Entity;
public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        super(id);
    }

}

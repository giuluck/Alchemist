package it.unibo.alchemist.test.util;

import it.unibo.alchemist.model.implementations.nodes.GenericNode;
import it.unibo.alchemist.model.interfaces.Environment;

/**
 * Generic node for testing purposes.
 */
public class TestNode extends GenericNode<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @param env the environment
     */
    public TestNode(final Environment<?> env) {
        super(env);
    }

    @Override
    protected Object createT() {
        return new Object();
    }

}

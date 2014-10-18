package com.netflix.rx.eureka.server;

import com.netflix.rx.eureka.registry.EurekaRegistryImpl;
import com.netflix.rx.eureka.registry.EurekaRegistryMetrics;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author David Liu
 */
@Singleton
public class EurekaBridgeRegistry extends EurekaRegistryImpl {

    @Inject
    public EurekaBridgeRegistry(EurekaRegistryMetrics metrics) {
        super(metrics);
    }
}

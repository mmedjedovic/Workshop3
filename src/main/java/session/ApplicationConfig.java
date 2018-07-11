/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author henk
 */
@javax.ws.rs.ApplicationPath("REST")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.AccountFacadeREST.class);
        resources.add(service.AddressFacadeREST.class);
        resources.add(service.CustomerFacadeREST.class);
        resources.add(service.Order1FacadeREST.class);
        resources.add(service.OrderItemFacadeREST.class);
        resources.add(service.ProductFacadeREST.class);
    }
}
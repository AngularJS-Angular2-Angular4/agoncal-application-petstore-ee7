package org.agoncal.application.petstore.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@ApplicationPath("/rest")
public class RestApplication extends Application
{
   // ======================================
   // =          Business methods          =
   // ======================================

   // TODO Not sure this is still needed for portability in EE 7
//   @Override
//   public Set<Class<?>> getClasses()
//   {
//      Set<Class<?>> classes = new HashSet<>();
//      classes.add(CategoryEndpoint.class);
//      classes.add(CountryEndpoint.class);
//      classes.add(CustomerEndpoint.class);
//      classes.add(ItemEndpoint.class);
//      classes.add(ProductEndpoint.class);
//      return classes;
//   }
	
    public RestApplication() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/applicationPetstore/rest");
        beanConfig.setResourcePackage("org.agoncal.application.petstore.rest");
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan();
    }
	
}
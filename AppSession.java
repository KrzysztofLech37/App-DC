/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizstom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Krzysztof
 */
public class AppSession {
    
private ServiceRegistry serviceRegistry;

private SessionFactory factory;

private Session session;

public Session OpenSession()
{
    serviceRegistry = new StandardServiceRegistryBuilder().
        applySettings(WizStomApp.GetConfiguration().getProperties()).build();
    factory = WizStomApp.GetConfiguration().buildSessionFactory(serviceRegistry);
        
    session = factory.openSession();
    
    return session;
}

public void CloseSession()
{
    session.close();
    factory.close();
    StandardServiceRegistryBuilder.destroy(serviceRegistry);
}        

    
}

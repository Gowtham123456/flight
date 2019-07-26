package flight2.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import flight2.HelloService;
import flight2.HelloServiceImpl;
import flight2.ThrowableMapper;
import flight2.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}

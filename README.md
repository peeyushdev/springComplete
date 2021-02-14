# springComplete

Dependency Injection
1.The idea is to de-couple the dependency of the objects.
2.For Ex-> if two objects are dependent on each other, idea is to de-couple that dependency.
3.We can say instead of hardcoding the object using new keyword in the class where we need that dependency, we can have 
code that passes that object which is required by any class.

Bean
1.Java class which follows the convention
    a. No args constructor.
    b. Implements Serializable.(Object state can be converted into streams and can we send over network at other end we can deserialize)
    c. Has setters and getters.

Spring Container/Factory of Beans     
1.Spring acts like a container of Beans(POJO).
2.Spring manages those objects, object instantiation, object life-cycle,object destruction.
3.If we have two objects A and B, inside A we need B, without spring what we'll do is write somewhere in A b= new B();
4.But using spring we can write a code and ask spring to instantiate Object B for Object A, and this is called Factory Pattern.
5.Inside Class A we need B, what we can do is, we have Object Factory(Normal Factory that produces java objects), we can pass on the 
requirements to this factory and this factory might have some configuration file, where it will search for blue-print of 
the object asked by A and it will return the object asked.
6.All this is taken care by spring library,that is we can use Bean Factory and can supply spring XML file as a configuration file.

Bean Factory
1.Object that can be used to asked for beans from spring. 
2.It news a configuration file, XML(in our case) that basically provides the reference of Blue-print for Beans to be supplied.
3.Now depricated.

Application Content
1.Similar to Bean Factory another Object Application Context, It can do what Bean Factory does plus some additional things also.
2.Additional things like AOP,event notification


Setter Injection
Property Tag<property name="" value="">
1.sets the property of the bean.
2.it uses the setter method for the property to set.

Constructor Injection
<Constructor-arg value="">
1.In value we pass string but spring intelligently converts it to required type.
2.But this leads to serious problem that can come in case we have two Contructors one with string and other with int.
3.Then how spring will get to know which constructor it should call.
4.One of the way is to use type="" and pass dataType
5.index attribute-> assign property value to property at that index in construction declaration.

Object Injection
1.We can use the attribute ref to declare a reference to a bean inside other bean.

Inner Beans
1.If we know some beans are needed for one of the bean so instead of having a sperate bean we can have inner beans also.

Collection Injection
1.Spring provides supports for Collection injection.
2.we can use list,set,map elements to specify the collection objects.
3.Type-conversion takes place here also.

Autowiring
1.Spring helps in injecting the data members of a class using element autowire.
2.Three ways in which we can autowire
    a.byName in which spring of bean with name as the data member name.
    b.byType in which bean with is search with the type required, but works only if we have one for bean for the required type.
        otherwise exception saying no qualifying bean found, required 1 found 3.(in out example).
    c.constructor works exactly same as byType instead of using setter injection uses construction injection. 
    
Bean Scopes
1.SingleTon(default)-> When the applicationContext gets initialise at that time only, spring reads the configuration file,
So in this, spring creates the object for every bean defined in config file and supply that object for all future request.
    One object per container(applicationContext)
2.Prototype-> for every request/reference new bean is created.
3.web-aware->
    a. request->new for every request.
    b. session->new for every session.
    c. global session.     

Aware Interfaces
1.ApplicationContextAware-> while initialization, checks for the bean that implement this interface and calls its setter to 
set the ApplicationContext.
2.BeanNameAware-> name of the bean       
many more are there.

Bean Definition Inheritance
1.When we have lots of bean definition inside our XML file, and we have some common property across many beans
then instead of writing those properties seperately inside every bean definition what we can do is to have one common
bean for all those properties and inherit this in other beans
2.This bean can be a abstract bean.

Bean LifeCycle Callbacks
1.There are callback methods which we can use to tell spring to perform some operation at the time of initializing the 
bean and before the bean is being destroyed.
2.There are two ways of doing this
    a. Implement DisposableBean,InitializingBean
    b. adding directly to xml file
        here we can add at global level also, if that bean has that function it will get execute otherwise gets ignored.
3.But the interface takes the priority in order.

BeanPostProcessor
1.This is used to extend the capabilities of the spring, we can specify what should be done before and after initialization
of the bean property.
2.To inform spring about this,we need to create its bean in the xml file.
3.We can any number of BeanPostProcessor class and all them gets execute.
4.These will get execute for all the beans present in the xml file.

BeanFactoryPostProcessor
1.Similar to BeanPostProcessor, BFPP is called after the Bean Factory is created.
2.Before the initailization of BF this method is called.
3.One of the Example is -> propertyplaceholderconfigurer
    Helps in using placeholder instead of hardcoding the variables

Annotations
1.@Required-> used to specify when any property of the class is required to be set.    
    With the help of BeanPostProcessor we are able to achieve this as RequiredAnnotationBeanPostProcessor
    is responsible for checking Required annotation and if that property is not set then it will throw exception
    property x of class y is required.
2.@Autowire-> used to autowire the properties of a some similar to property tag
    by default it checks for a type of bean, if multiple beans of same type are present then check by the name of the
    data member.
    But there is better way that is to supply the qualifier annotation and in xml file for dependency bean add qualifier.
    If multiple qualifying beans are there for autowiring then exception will be thrown  by spring.
    one more way is to use the alias tag keeping the value as the name of the dependency.

Note-> Instead of declaring the beans for BeanPostProcessors we can directly use this:
        <context:annotation-config/> 
        this will include all the BeanPostProcessors.    

JSR-250
1.Standard JSR-> Java Specification Request that defines all the standard annotations.
    a.@Resource-> similar to @autowire by name,it checks for the name that is passed to it or by default checks for 
     dependency with same name as variable name.
    b.PostConstruct-> similar to init method that should execute after the bean is created.
    c.PreDestroy-> similar to destroy method that should execute before the bean is about to destroy.
    
Component and Streotype Annotations
1. Instead of defined the class as a bean inside the xml file we can specify that a class is a bean using annotations also.
Note-> Using annotation we will not be able to declare the multiple instances of a class means we will have only one 
instance for that bean, so if there is requirement of having more than one instance of a bean then we need to specify
this using xml approach only.

2.Streotype means there are some annotations that tell spring that these class are mean for some spl functioning.
    a. @Component->   more generic
    b. @Service ->    for service layer   
    c. @Reposotory -> for data object 
    d. @Controller -> for controller layer
    All the above acts same to spring it will create the bean for it.
 Note-> but we need to tell spring that apart from the beans that we declare in spring.xml file there are other beans 
 also in the code.
 for that we use component-scan tag in xml.      
     
MessageSource
1.To get the text from the properties file.
2.We need to declare the ResourceBundleMessageSource bean in the spring.xml
3.ApplicationContext(Interface) also extends MessageSource(Interface) so we can directly get this using application context
object also.
Note-> Make sure to add id=messageSource for the bean, otherwise spring will not able to get the object of(messageSource)       
Point 3 is the advantage of context over BeanFactory.

Event Handling
1.There are three entities involved in Event Handling 
    i.e Event Publisher,Event Listener, Event itself.    
2.ApplicationListener listens to the event published by spring or any custom event publish by user.
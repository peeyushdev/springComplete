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
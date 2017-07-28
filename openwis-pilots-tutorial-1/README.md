### OWT1 - Service Oriented Architecture (SOA)


## Introduction


## Service-oriented architecture (SOA) Definition

```
Service-oriented architecture (SOA) is an approach used to create an architecture based upon the use of services.
Services carry out some small function, such as producing data, validating a customer, or providing simple
analytics. The basic principles of service-oriented architecture are independent of vendors, products 
and technologies. A service is a discrete unit of functionality that can be accessed remotely and acted 
upon and updated independently.
```



### Service
Service is the essential concept of SOA.


In the context of software architecture, service-orientation and service-oriented architecture, the term service refers to a software functionality or a set of software functionalities (such as the retrieval of specified information or the execution of a set of operations) with a purpose that can be reused by different clients for different purposes, together with the policies that should control its usage (based on the identity of the client requesting the service, for example).

OASIS defines service as "a mechanism to enable access to one or more capabilities, where the access is provided using a prescribed interface and is exercised consistent with constraints and policies as specified by the service description." [OASIS Reference Model for Service Oriented Architecture 1.0](https://www.oasis-open.org/committees/tc_home.php?wg_abbrev=soa-rm)


Service as a term is not originally a technical concept. The idea of service has been used in many fields long time ago.
Where a person or a company as the *service provider*, is offering to do something – carry goods and messages, look after vehicles, install and repair building roofs – that will benefit other people or companies, as the *service consumers*. The providers offer to contract with the consumers to do these things, in order that the consumers know in advance what they purchase. The idea has been adopted by technologists. They have established the concept of a software service.

A *software service* is performed by a software application. It produces effects that have value to the people or organizations that are its consumers. It has a provider – a person or organization that takes responsibility for running the application to produce those effects. And there is an implicit or explicit contract between the provider and the consumers that the application will produce the effects that the consumers expect. Services can be provided over the web where also may have software interfaces. For example, there are web services that provide real-time stock quote information in a form where it can be analyzed by the consumers’ software. Software services can similarly be provided over internal or external networks, and a service performed by one application can be used by another application running on the same system. It is the organization of an enterprise’s software as software services that are provided internally in this way, and also externally, that is the essential characteristic of SOA.



The use of services provides major benefits:

In contrast to the use of large applications, which tend to be “information silos” that cannot readily exchange information with each other, the use of finer-grained software services improves information flow within and between enterprises.

Integrating major applications is often expensive. SOA can save integration costs.

Organizing internal software as services makes it easier to expose its functionality externally. Which leads to increased visibility that can have business value as, for example, when a logistics company makes the tracking of shipments visible to its customers, increasing customer satisfaction and reducing the costly overhead of status enquiries.

Business processes are often dependent on their supporting software. It can be hard to change large, monolithic programs. This can make it difficult to change the business processes to meet new requirements (arising, for example, from changes in legislation) or to take advantage of new business opportunities. A service-based software architecture is easier to change – it has greater organizational flexibility, enabling it to avoid penalties and reap commercial advantage. (This is one of the ways in which SOA can make an enterprise more “agile”.)
The service concept also makes possible further features of SOA. These can provide additional benefits, as explained in the rest of this section.

Service Reusability
Clear service descriptions are a starting point for service re-use, which can provide another major benefit of SOA:

Using existing software modules rather than writing new ones means lower development and testing costs and – in many cases an even greater saving – lower maintenance costs.



## Defining concepts
A manifesto was published for service-oriented architecture in October, 2009. This came up with six core values which are listed as follows:[SOA Manifesto](www.soa-manifesto.org)

1. Business value is given more importance than technical strategy.
2. Strategic goals are given more importance than project-specific benefits.
3. Intrinsic inter-operability is given more importance than custom integration.
4. Shared services are given more importance than specific-purpose implementations.
5. Flexibility is given more importance than optimization.
6. Evolutionary refinement is given more importance than pursuit of initial perfection.


`rephraising`
 ## Why SOA

Loosely coupling
An underlying premise in the application of SOA to information technology is the principle of loose coupling i.e. avoiding or at least encapsulating temporal, technological and organizational constraints in the information system design.
Loosely coupled systems support late or dynamically binding to other components while running, and can mediate the difference in the component's structure, security model, protocols, and semantics, thus abstracting volatility.
Loose coupling in SOA is how the services are implemented without impacting other services or application. The only interaction between the application and services is through the publish interfaces. This means application doesn’t interested how the services been implemented.

Location transparency

Location transparency means that the consumer of the service doesn’t care where the implementation of the services resides. It could be same server or other server across the internet. Consumer calls are agnostic to service location.


Reusability
SOA compliance to web services and hence applications running on either platform can also consume services running on the other as web services that facilitate reuse. Properly designed implemented SOA application provide infrastructure that makes reuse possibilities in heterogeneous environment such as C,C++,Java, .Net etc.
Managed environments can also wrap COBOL legacy systems and present them  as services. This has extended the useful life of many core legacy systems indefinitely, no matter what language they originally used



Parallel Development
Service Oriented Architecture advocate more parallelism in development environment as SOA is based on layers based architecture. Since Service Oriented Architecture confers layer based architecture therefore it advocates more parallel development. SOA consist of inventory of contract based independent services which could be developed in parallel.
Above figure shows developers could develop independent services in parallel and services will be completed on the same schedule time. Business processes will be accessing the independent services orchestrate them and provide the concrete business functionality.


Higher Availability & Better Scalability

SOA a Multi-layered architecture can be individually clustered with appropriate load balancing to scale up the system.

As we know redundancy is the key for high availability SOA achieve redundancy by introducing redundant elements via clustering.  SOA uses layer architecture to facilitate the logical decoupling that allow to design a very resilient system with each layer of the stack.

The other aspect of SOA testing is that testing of independent reusable service which can be tested independently which force tester to not to test the overall application unless all the service passed successfully. More and better testing usually means fewer defects and a higher overall level of quality.


Code Mobility
Since location transparency is a property of a service-oriented architecture, code mobility becomes a reality. The lookup and dynamic binding to a service means that the client does not care where the service is located. Therefore, an organization has the flexibility to move services to different machines, or to move a service to an external provider.

Rich Testability

Since SOA confers layer based architecture therefore it breaks testing into definable testing areas such as services, security, and governance etc. These testing areas would be tested separately using best tools and approach.
For reference JUnit allows for creation of a test suite. The test suite consists of number of procedure, each of which is designed to test a service or component. In SOA environment automation of testing is very common for frequently changing enterprise services which improve regression testing efficiency.
The other aspect of SOA testing is that testing of independent reusable service which can be tested independently which force tester to not to test the overall application unless all the service passed successfully. More and better testing usually means fewer defects and a higher overall level of quality.




## General SOA principles

According to SOA, a service must have the following Principles:

Principle | Description
----|---------------
Standardized service contract |Services adhere to a standard communications agreements, as defined collectively by one or more service-description documents within a given set of services.
Service reference autonomy (an aspect of loose coupling)|The relationship between services is minimized to the level that they are only aware of their existence.
Service location transparency (an aspect of loose coupling)|Services can be called from anywhere within the network that it is located no matter where it is present.
Service longevity|Services should be designed to be long lived. Where possible services should avoid forcing consumers to change if they do not require new features, if you call a service today you should be able to call the same service tomorrow.
Service abstraction|The services act as black boxes, that is their inner logic is hidden from the consumers.
Service autonomy|Services are independent and control the functionality they encapsulate, from a Design-time and a run-time perspective.
Service statelessness|Services are stateless, that is either return the requested value or give an exception hence minimizing resource use.
Service granularity|A principle to ensure services have an adequate size and scope. The functionality provided by the service to the user must be relevant.
Service normalization|Services are decomposed or consolidated (normalized) to minimize redundancy. In some, this may not be done, These are the cases where performance optimization, access, and aggregation are required.[15]
Service composability|Services can be used to compose other services.
Service discovery|Services are supplemented with communicative meta data by which they can be effectively discovered and interpreted.
Service reusability|Logic is divided into various services, to promote reuse of code.
Service encapsulation|Many services which were not initially planned under SOA, may get encapsulated or become a part of SOA.


Since the definition of SOA does not enforce any technological standards, its implementation can take many forms, such as the following:



## Illustrate possible Approaches to SOA
`stil under construction`
A SOA solution often relies on many integration components, such as

### 1. The Enterprise Service Bus (ESB)

The first approach that allows to build and implement an optimal SOA is the enterprise service bus or ESB.
This approach helps to coordinate and arrange the different elements that are in the form of distributed services on a network.
ESB promotes agility and flexibility with regard to high-level protocol communication between applications.
Also considers the systems as discrete and distributed services that connect to one another through message oriented infrastructure that is asynchronous.This kind of a message-oriented infrastructure makes it possible to have loosely coupled connections between independent services or modules.Networkwise, the primary goal of the high-level protocol communication is enterprise application integration (EAI) of heterogeneous and complex services.
[ESB image]


### 2. Business Process Management

Many companies have tried to solve business process problems by the implementation of Business Process Management approach. This approach takes into consideration the IT assets and systems as activities or tasks that participate in well synchronized and well-orchestrated business procedures.BPM tools are mostly used at the time of modeling and designing procedures rather than using them to construct processes that can reach integration objectives. This is the main challenge of BPM. By BPM solutions on their own are enough to meet SOA requirements because they do not consist of the runtime environment that is needed for loosely coupled modules.

In BPM frameworks, solutions are nearly always based on a workflow or set of workflows. The concept is that work in a real-time business environment should not be static, rather it should progress through a series of steps (‘a process’) in time. Basing a solution on sequential activities is effective in encouraging teams to reach completion of goals within a set period. The process platform encourages progression through tasks by sending the participants reminders and indications of their completion status and due date. Because of this, teams who use these solutions tend to perform faster and accomplish goals more consistently.



### 3. OSGi framework

```
OSGi (Open Service Gateway Initiative) is a Java framework for developing and deploying modular software
programs and libraries. Each bundle is a tightly coupled, dynamically loadable collection of classes, jars, 
and configuration files that explicitly declare their external dependencies.
```

### 4. Web API: REST - SOAP (protocol)

A Web API is a development in web services which implemented as Simple Object Access Protocol (SOAP) either as representational state transfer (REST) based communications. Web services make functional building-blocks accessible over standard Internet protocols independent of platforms and programming languages. All web-applications with decoupled functionality from the presentation of the application and moved to a web-services layer (API) are consist an implementation of an SOA methodology. 


Discuss SOA best practices.




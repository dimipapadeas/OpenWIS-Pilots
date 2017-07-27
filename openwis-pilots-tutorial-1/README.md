## OWT-1: Service Oriented Architecture (SOA)

<!-- todo -->
Abstract 

Service-oriented architecture (SOA) is an approach used to create an architecture based upon the use of services. Services carry out some small function, such as producing data, validating a customer, or providing simple analytics. The basic principles of service-oriented architecture are independent of vendors, products and technologies. A service is a discrete unit of functionality that can be accessed remotely and acted upon and updated independently.

According to SOA, a service has the following properties:
- It logically represents a business activity with a specified outcome.
- It is self-contained.
- It is a black box for its consumers.
- It may consist of other underlying services.

Since the definition of SOA does not enforce any technological standards, its implementation can take many forms, such as the following:
- OSGi Services
- ESBs
- REST APIs

This tutorial intends to:
1. Examine the general SOA principles.
2. Illustrate possbile SOA implementations.
3. Discuss SOA best practices.


---

# OWT1 - Service Oriented Architecture (SOA)


## Introduction

### From monolithic to modular

In software engineering, a monolithic application has been used to describe a single-tiered application in which
all MVC components are combined into a single program within a single platform. A monolithic application is self-contained, and independent from other applications. Consider a monolithic application as a big container where in all components of the application are assembled together and tightly packaged in various formats such as EAR, WAR, JAR etc. Which is finally deployed as a single unit on the application server.

---
### The problem 
Monolithic services tend to get tightly coupled and entangled as the application evolves, making it difficult to isolate services for purposes such as independency scaling or mainainance. Monolithic architectures are also much harder to understand, because there may be dependencies, side-effects etc which are not obvious when you’re looking at a particular service or controller.




Aspects where monolithic architectures are not doing well:


Agility

In a monolithic application even if a small component in an application has to be changed, the entire application needs to be repackaged and assembled together.

Scalability

Service-wise, while some resources are utilized other services in the same application sare getting wasted since they don’t have a need to scale.

DevOps Cycle

In any case of Continuous delivery, a monolithic application even for a small change in the application, 
application delivery time increases tremendously and it definitely decreases frequency of Deployments. 

Availability

If one service fails under monolithic application wherein entire application has to be brought down.

Fault Tolerance
When a specific service is under heavy pressure it brings the whole application down with it.
For instance in cases when Database connection pool is getting exhausted the entire application bogging down.

---


## Service-oriented architecture (SOA) Definition


Service-oriented architecture (SOA) is an approach used to create an architecture based upon the use of services. Services carry out some small function, such as producing data, validating a customer, or providing simple analytics. The basic principles of service-oriented architecture are independent of vendors, products and technologies. A service is a discrete unit of functionality that can be accessed remotely and acted upon and updated independently.

^







## Defining concepts
A manifesto was published for service-oriented architecture in October, 2009. This came up with six core values which are listed as follows:[SOA Manifesto](www.soa-manifesto.org)

1. Business value is given more importance than technical strategy.
2. Strategic goals are given more importance than project-specific benefits.
3. Intrinsic inter-operability is given more importance than custom integration.
4. Shared services are given more importance than specific-purpose implementations.
5. Flexibility is given more importance than optimization.
6. Evolutionary refinement is given more importance than pursuit of initial perfection.



 ## Why SOA ?
The solution to [Monolithic services problem](path), is not to rip and replace systems or applications, nor to completely renovate them, but rather to find a way to leverage existing software investments so that overall organizational goals are effectively supported. That soloution is to eliminate dependencies and enable quick testing and deployment of code changes, greater modularity, loose coupling and all hold promise in simplifying the integration task. In other words Service Oriented Architecture (SOA). Service orientation helps to accomplish these goals by making systems more responsive to business needs, simpler to develop and easier to maintain and manage. Implementing a solution architecture based upon service orientation helps organizations plan ahead for change, rather than responding reactively.

---

## General SOA principles

According to SOA, a service must have the following Principles:


- Standardized service contract

Services adhere to a standard communications agreements, as defined collectively by one or more service-description documents within a given set of services.
- Service reference autonomy (an aspect of loose coupling)

The relationship between services is minimized to the level that they are only aware of their existence.

- Service location transparency (an aspect of loose coupling)

Services can be called from anywhere within the network that it is located no matter where it is present.

- Service longevity

Services should be designed to be long lived. Where possible services should avoid forcing consumers to change if they do not require new features, if you call a service today you should be able to call the same service tomorrow.

- Service abstraction

The services act as black boxes, that is their inner logic is hidden from the consumers.

- Service autonomy

Services are independent and control the functionality they encapsulate, from a Design-time and a run-time perspective.

- Service statelessness

Services are stateless, that is either return the requested value or give an exception hence minimizing resource use.
- Service granularity

A principle to ensure services have an adequate size and scope. The functionality provided by the service to the user must be relevant.

- Service normalization

Services are decomposed or consolidated (normalized) to minimize redundancy. In some, this may not be done, These are the cases where performance optimization, access, and aggregation are required.[15]

- Service composability

Services can be used to compose other services.

- Service discovery

Services are supplemented with communicative meta data by which they can be effectively discovered and interpreted.

- Service reusability

Logic is divided into various services, to promote reuse of code.

- Service encapsulation

Many services which were not initially planned under SOA, may get encapsulated or become a part of SOA.



Since the definition of SOA does not enforce any technological standards, its implementation can take many forms, such as the following:


---


## Illustrate possbile SOA appliances

### OSGi Services

### ESBs

An enterprise service bus (ESB) implements a communication system between mutually interacting software applications in a service-oriented architecture (SOA). It implements a software architecture as depicted on the right. As it implements a software architecture for distributed computing, it therefore also implements a special variant of the more general client-server model, wherein, in general, any application using ESB can behave as server or client in turns. ESB promotes agility and flexibility with regard to high-level protocol communication between applications. The primary goal of the high-level protocol communication is enterprise application integration (EAI) of heterogeneous and complex service or application landscapes (a view from the network level).


### REST APIs
// microservices?



Discuss SOA best practices.
why OSGi?
Today, Service Oriented Architectures (SOA) are hot and every software vendor seems intent on confusing a muddy picture even further by bringing their products under this wide umbrella. The result is that many people file OSGi under webservices, as the most popular exponent of SOA, 


----
The service registry layer in OSGi intrinsically supports service-oriented architecture (SOA). Bundles publish services to the service registry, and other bundles can discover these services from the service registry.


The Role of OSGi in a SOA Runtime
Pluggability
• Ability to extend the runtime with additional functionality
(services, containers, etc.)
Isolation
• Total control over the packages you expose and consume
Dynamism
• Bundles have a life cycle independent of the virtual machine
Dependency Management
• First and worst form of coupling you encounter
• Coupling between services
• Coupling between a service and its underlying runtime




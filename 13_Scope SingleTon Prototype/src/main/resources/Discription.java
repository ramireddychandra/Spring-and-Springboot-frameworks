/* Scopes are two types
	 SingleTOn
	 Prototype

SingleTon will return same Bean always
Prototype will return Different instance for bean call;

 Singleton : - One Object instance per Spring IOC Container

 Prototype : - possibly manu object instances per spring IOC container

Scopes appllicable only for web-aware Spring ApplicationContext

	Request -one Object instance per single HTTP request
	Session : one Object instance per user HTTP request
Application : One Object instance per web application runtime
web socket: One Object instance per wensocket instance.

Java SingleTon vs Spring Singleton

-->Java SingleTon :: Single Object Instance per JVM
-->Spring Singleton :: One Object instance per Spring IOC Container

Spring Singleton and Java Singleton might mean the same if you are only running only one spring IOC per java 
However if we are multiple spring IOC containers in JVM then both are different.


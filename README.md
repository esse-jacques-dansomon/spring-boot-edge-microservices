# Spring Boot Edge Microservices

Ce projet est un exemple de microservices avec Spring Boot et Spring Cloud. Il est conçu pour vous montrer comment créer une architecture de microservices avec des outils de développement modernes et des pratiques DevOps avancées. Le projet est basé sur le cours de [Optimisez votre architecture Microservices de OpenClassrooms](https://openclassrooms.com/fr/courses/4668216-optimisez-votre-architecture-microservices/5176545-externalisez-la-configuration-de-vos-microservices).

## microservices :
Les microservices sont les briques fondamentales de l'architecture de microservices. Dans ce projet, vous trouverez les microservices suivants :
* [Le microservice de gestion des produits avec **Spring Boot**](microservice-produits)
* [Le microservice de gestion des commandes avec **Spring Boot**](microservice-commandes)
* [Le microservice de gestion des paiements avec **Spring Boot**](microservice-paiement)
* [Le microservice de gestion des clients avec **Spring Boot**](microservice-clientui)

Chacun de ces microservices est conçu pour fonctionner de manière autonome, mais ensemble, ils forment une architecture de microservices complète et bien intégrée.
## Serveurs :
Les serveurs sont des composants clés de l'architecture de microservices. Dans ce projet, vous trouverez les serveurs suivants :
* [Le serveur de configuration avec **Spring Cloud Config**](config-server)
* [Le serveur de découverte avec **Eureka**]()
* [Le serveur de routage avec **Spring cloud gateway**]()
* Le serveur de traçage avec **Zipkin**

### Architecture

### Feign :
permet la communication entre les microservices. Il simplifie les appels HTTP en générant des clients pour les interfaces de nos microservices.

### Spring Cloud Config :
permet de centraliser tous les fichiers de configuration dans un dépôt Git, et se positionne comme serveur de fichiers de configuration. Cela permet de garder les configurations dans un emplacement unique et d'éviter les problèmes de configuration en production.

### Eureka :
agit comme un naming server pour garder les liens de vos instances de microservices. Il permet aux clients de localiser facilement les instances des services enregistrées auprès de lui.

### Spring Cloud Load Balancer :
est un load balancer qui agit comme un équilibreur de charge pour distribuer les appels entre les instances d'un service.

### API Gateway :
est le point d'entrée de notre microservice et permet de router les appels vers les différents services en fonction des règles de routage que nous avons définies. Nous utiliserons Zuul pour l'authentification et l'autorisation.

### Spring Cloud Gateway :
est un proxy inverse qui sert de point d’entrée à nos applications. Il permet de router les appels vers les différents services, et nous permet d'ajouter des filtres pour gérer l'authentification et l'autorisation.

### Zipkin :
permet de tracer les requêtes et les appels entre les microservices. Cela permet de déboguer les problèmes de performance et d'identifier les problèmes dans l'ensemble du système.~~~~


Ce repository est un test d'implémentation de plusieurs design patterns.

# Observer pattern

L'objectif est de séparer ce qui est observé (subject, observable) des observateurs (observers). Plusieurs observateurs peuvent réagir aux changements de l'observé.

# Factory pattern

Le pattern Factory permet de cacher la logique de création d'un objet.

# Decorator pattern

## Exemple sans l'utilisation du design pattern Decorator avec combinaison de classes

Sans utiliser le design pattern Decorator, il y a beaucoup de classes à créer. Dès que l'on veut rajouter une option, il faut créer une ou plusieurs classes. Exemple, si l'on veut rajouter une troisème option disponible une crêpe et une gauffre, il faut créer 8 classes.

## Exemple avec le pattern decorator

Le design est plus flexible. On crée les classes de bases et les ingrédients puis on compose le tout au runtime.

## Phase 2 : challenge du pattern (règles métiers)

Comment intégrer des régles métiers en utilisant le design decorator ?
Par exemple crepe double chocolat est possible mais pas une crepe double chantilly.

- solution 1 : on rajoute dans le constructeur les vérifications (voir commentaire dans le constructeur Chantilly).
- solution 2 : on couple le design pattern decorator avec le design pattern factory.
C'est la factory qui a la responsabilité de faire respecter les règles métiers. Cette solution semble mieux respecter le principe de Single Responsability (SOLID).

# Singleton
Le pattern Singleton sert à avoir la possibilité d'avoir qu'une instance d'un objet. Ce design pattern peut-être utilisé par exemple pour avoir qu'une seule instance d'un logger ou d'une connexion à la base de données (DAO).
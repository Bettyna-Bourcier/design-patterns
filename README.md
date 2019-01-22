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
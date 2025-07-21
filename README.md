# Java Application avec Maven

Ce guide explique comment cloner un dépôt, installer les dépendances, exécuter une application Java simple, renseigner les commandes de la tondeuse, et lancer les tests unitaires en utilisant Maven.

## Prérequis

Assurez-vous d'avoir installé les éléments suivants sur votre machine :

- [Git](https://git-scm.com/)
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)

## Étapes pour lancer l'application

### 1. Cloner le dépôt

Pour commencer, clonez le dépôt contenant le projet sur votre machine locale :

```bash
git clone <https://github.com/CaptainBaguettes/kata_tondeuse.git>
cd <kata_tondeuse>
```
### 2. Renseigner les commandes de la tondeuse dans input.txt

Avant de lancer l'application, assurez-vous que les commandes pour la tondeuse sont correctement renseignées dans le fichier input.txt. Voici un exemple de format à suivre :

5 5 </br>
1 2 N </br>
GAGAGAGAA </br>
3 3 E </br>
AADAADADDA </br>

La première ligne définit les dimensions de la pelouse (largeur hauteur). </br>
Chaque paire de lignes suivantes définit la position initiale et l'orientation d'une tondeuse, suivie par une série de commandes pour cette tondeuse.

### 3. Lancer l'application 

Dans un premier temps vous allez devoir effectuer les actions maven suivantes 
- clean
- install

Ensuite vous allez pouvoir lancer l'application en éxécutant la méthode main soit dans votre ide en cliquant sur executer.

Concernant les tests unitaires, si vous avez choisit votre ide pour le lancer, ils seront lancé par défault (sauf choix de votre part).

Sinon vous pouvez les lancer unitairement dans chaques classes de test présentes dans le package test
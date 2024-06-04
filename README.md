# MovieSeriesApp

## Introduction
La chaîne de télévision internationale MovieSeriesTV a sollicité la startup OroJacksonTech pour développer une application web permettant à son audience de visionner les films et séries produits par la chaîne. Le Product Owner a confié cette mission à notre équipe afin de créer une application dotée d'un backend bien structuré et fonctionnel. L'application devra être sécurisée, évolutive et facile à maintenir.

## Table des Matières
1. [Administrateur User Stories](#administrateur-user-stories)
    - [Connexion de l'Administrateur](#connexion-de-ladministrateur)
    - [Gestion des Films](#gestion-des-films)
    - [Gestion des Séries](#gestion-des-séries)
2. [Visiteur User Stories](#visiteur-user-stories)
    - [Inscription et Connexion des Utilisateurs](#inscription-et-connexion-des-utilisateurs)
3. [Utilisateur User Stories](#utilisateur-user-stories)
    - [Gestion des Favoris](#gestion-des-favoris)
4. [Technologies Utilisées](#technologies-utilisées)


## Administrateur User Stories

### Connexion de l'Administrateur
- **En tant qu'administrateur**, je veux pouvoir me connecter à l'application en utilisant mon email et mon mot de passe, afin d'accéder aux fonctionnalités de gestion des films, séries, utilisateurs et listes de visionnage.
- **En tant qu'administrateur**, je veux pouvoir inscrire un nouvel administrateur en fournissant un email, un nom et un mot de passe, afin de permettre à cette personne de gérer l'application.
- **En tant qu'administrateur**, je veux pouvoir me déconnecter de l'application, afin de sécuriser mon compte lorsque je n'utilise pas l'application.
- **En tant qu'administrateur**, je veux pouvoir réinitialiser mon mot de passe en cas d'oubli, afin de regagner l'accès à mon compte.

### Gestion des Films
- **Ajouter un Film** : En tant qu'administrateur, je veux pouvoir ajouter un nouveau film en renseignant son titre, description, date de sortie, durée, genre, réalisateur, acteurs et note, afin d'enrichir la base de données de films.
- **Afficher la Liste des Films** : En tant qu'administrateur, je veux voir une liste de tous les films disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film à consulter ou à regarder.
- **Voir les Détails d'un Film** : En tant qu'utilisateur, je veux pouvoir cliquer sur un film pour voir ses détails complets, y compris la liste des acteurs et une bande-annonce (si disponible), afin d'obtenir des informations plus approfondies sur le film.
- **Mettre à Jour les Détails d'un Film** : En tant qu'administrateur, je veux pouvoir modifier les détails d'un film existant, afin de corriger des erreurs ou mettre à jour des informations.
- **Supprimer un Film** : En tant qu'administrateur, je veux pouvoir supprimer un film de la base de données, afin de maintenir la liste des films à jour et pertinente.

### Gestion des Séries
- **Ajouter une Série** : En tant qu'administrateur, je veux pouvoir ajouter une nouvelle série en renseignant son titre, description, date de début, date de fin, nombre de saisons, genre, créateur, acteurs et note, afin d'enrichir la base de données de séries.
- **Afficher la Liste des Séries** : En tant qu'utilisateur, je veux voir une liste de toutes les séries disponibles avec leurs titres, dates de début et de fin, genres, créateurs et notes, afin de trouver rapidement une série à consulter ou à regarder.
- **Voir les Détails d'une Série** : En tant qu'utilisateur, je veux pouvoir cliquer sur une série pour voir ses détails complets, y compris la liste des acteurs et des bandes-annonces (si disponibles), afin d'obtenir des informations plus approfondies sur la série.
- **Mettre à Jour les Détails d'une Série** : En tant qu'administrateur, je veux pouvoir modifier les détails d'une série existante, afin de corriger des erreurs ou mettre à jour des informations.
- **Supprimer une Série** : En tant qu'administrateur, je veux pouvoir supprimer une série de la base de données, afin de maintenir la liste des séries à jour et pertinente.

## Visiteur User Stories

### Inscription et Connexion des Utilisateurs
- **En tant que visiteur**, je veux pouvoir m'inscrire et me connecter, afin de créer un compte personnel pour gérer mes listes de visionnage et mes préférences.
    - **Critères d'acceptation** : Un formulaire d'inscription est disponible pour créer un compte. Un formulaire de connexion permet aux utilisateurs enregistrés de se connecter. Les informations de connexion sont vérifiées avant l'accès au compte.

## Utilisateur User Stories

### Gestion des Favoris
- **Ajouter un Film ou une série aux Favoris** : En tant qu'utilisateur, je veux pouvoir ajouter un film ou une série à mes favoris, afin de le retrouver facilement plus tard.
    - **Critères d'acceptation** : Un bouton "Ajouter aux favoris" est disponible sur la page de chaque film. Le film est ajouté à une liste de favoris personnelle après clic.
- **Voir la Liste des Films ou une série** : En tant qu'utilisateur, je veux voir une liste de tous les films et les séries disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film à consulter ou à regarder.
    - **Critères d'acceptation** : La liste affiche tous les films avec les détails mentionnés. Les films peuvent être triés par différents critères (titre, date de sortie, note).
- **Voir les Détails d'un Film ou une série** : En tant qu'utilisateur, je veux pouvoir cliquer sur un film ou une série pour voir ses détails complets, y compris la liste des acteurs et une bande-annonce (si disponible), afin d'obtenir des informations plus approfondies sur le film.
    - **Critères d'acceptation** : Un clic sur un film affiche une page de détails avec toutes les informations pertinentes. Les acteurs et la bande-annonce (si disponible) sont inclus dans les détails.

## Technologies Utilisées
- **Spring Core** pour l'injection de dépendances et la gestion des composants d'application.
- **Spring MVC** pour construire l'application Web et gérer les requêtes HTTP.
- **ORM: Hibernate** pour la gestion de la persistance des données.

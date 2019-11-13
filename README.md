# TP Noté Groupe 2

Le but de ce TP est de gérer un ensemble de voitures.

Pour chaque classe (y compris celles fournies) mettez en commentaire s'il s'agit d'un Value Object, d'une Entity ou d'un Agregate.

Une voiture (Car) est identifiée par un numéro unique. Chaque voiture possède un modèle (Model), un modèle étant caractérisé par son nom et sa marque (Make).  

## Compiler le code et exécutez les tests.
Corriger le problème soulevé par l'erreur détectée dans TestCar.

Corriger le problème soulevé par l'erreur détectée dans TestCarFactory.

## Owner
On veut maintenant que toute voiture soit rattachée à un propriétaire (Owner), caractérisé par un nom. 

Deux propriétaires ne pourront avoir le même nom.

Créer une classe OwnerFactory qui permet de créer des propriétaires en s'assurant qu'ils ont tous des noms différents. 

Implémenter une classe Owners qui stocke en mémoire un ensemble de propriétaires et les véhicules qui sont associés à chacun.
On fera en sorte qu'une voiture ne pourra être possédée par deux personnes différentes.

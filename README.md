# TP Noté Groupe 2

Le but de ce TP est de gérer un ensemble d'avions, et de compagnies d'aviation.

1) Pour chaque classe (y compris celles fournies) mettez en commentaire s'il s'agit d'un Value Object, d'une Entity ou d'un Agregate.

Un avion (Plane) est identifiée par un numéro unique. Chaque avion possède un modèle (Model), un modèle étant caractérisé par son nom et son constructeur (Constructor).

2) Compiler le code et exécutez les tests.
3) Corriger le problème d'encapsulation soulevé par l'erreur détectée dans TestCar.testCar(). Le test pourra ensuite être supprimé.
4) Corriger le problème soulevé par l'erreur détectée dans TestCar.testCar2().

Fleets

On veut maintenant que tout avion voiture soit rattaché à une compagnie (Company), caractérisée par un nom.
Deux compagnies ne pourront avoir le même nom.

5) Créer une classe CompanyFactory qui permet de créer des compagnies en s'assurant qu'elles ont tous des noms différents.

6) Implémenter l'interface Fleets (flotte) dans une classe FleetsRepository en stockant en mémoire un ensemble de compagnies et les avions qui sont associés à chacune. Cette classe sera située dans un paquetage fr.ubordeaux.ao.infrastructureInMemory. On fera en sorte qu'un avion ne pourra être la propriété de deux compagnies différentes. Par contre, un avion peut passer d'une compagnie à une autre.

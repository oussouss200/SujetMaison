Game of life
=================================
Presentation:

1 - Fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :

 2 - Tests unitaires avec Junit4 pour vérifier votre implémentation.
 
Tout d'abord on commencer par le choix de la liste ainsi que le nombre qu'on va diviser sur.
   
   Exemple:
        partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
        partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
        partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
   
Requirements:

To run this implementation of SujetMaisonAdneom you need:

Java 1.8
Maven 2+

Installation:
 *Download
You can download the GameOfLife project directly from Github using the following command: git clone https://github.com/oussouss200/SujetMaison.git

 *Launch
- Import the project into an IDE (ex: intellij idea) 
- Go to the class Simulation in the package src/main/java/Partition.java
- Run 'Partition.main()' 

- About the test if you can run method by method in the class SimulationTest or you can run all one shot by runnig 'SimulationTest'



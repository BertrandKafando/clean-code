# UNIT  TEST

## Principes FAST

> F pour fast (rapide)
 Une demi-seconde, c’est déjà trop lent. Vous avez besoin que des milliers de tests soient exécutés en moins de quelques secondes.

>I pour isolé et indépendant

 chaque test organise sa propre classe de sous-tests, et ne fait qu’une assertion par test

>R pour répétable

 il doit vous dire la même chose, peu importe où, ou combien de fois, vous l’exécutez. Mais parfois les tests deviennent instables et doivent être lancés plusieurs fois pour réussir.

>S pour self-validating (autovalidation)

Cela signifie en fait que l’exécution de vos tests ne laisse aucun doute sur leur succès ou leur échec. 

>T pour thorough

 Utilisez le TDD et écrivez vos tests en écrivant votre code. Explorez toute la gamme d’actions possibles de votre méthode et écrivez beaucoup de tests unitaires.


## ...

Pour piloter la conception de votre code avec le TDD, et établir la base de votre pyramide de tests, posez-vous certaines des questions suivantes :

    Est-ce que j’ai un test de scénario nominal pour chaque cas que j’ai codé ?

    Est-ce que j’ai pensé aux scénarios alternatifs et cas limites ? Et si la date de naissance d’un vampire était après sa mort, en raison de sa résurrection ? Est-ce que mon système pourrait le gérer ? En supposant que vous travaillez en Transylvanie ? 🦇

    Est-ce que chacune de mes exceptions lancées est testée ?

    Est-ce qu’il existe un scénario où, sans changer le type de données utilisé dans mon test, je peux causer un comportement inattendu ? Que se passera-t-il si je passe une chaîne nulle ou vide ? 

    Est-ce que j’ai pensé à la sécurité en priorité ? Malheureusement, ce point est toujours le dernier de la liste. Est-ce que ce code peut uniquement être exécuté par les utilisateurs qui ont le droit de le faire ? Et si ce n’est pas le cas ?



## Use of Mocks

> dependances

    ```
            <dependency>
                <groupId>org.mockito</groupId>
                <artifactId>mockito-junit-jupiter</artifactId>
                <version>3.1.0</version>
                <scope>test</scope>
            </dependency>

    ```



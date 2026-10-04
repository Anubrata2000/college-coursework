/*max(X,Y):-
    (
       X=Y->write('Both are equal')
        ;
        (
                X>Y->Z is X,
                 write(Z)
        )
        ;
         (
                 Z is Y,
                  write(Z)
         )
    ).*/


max(X,Y,X):- X>Y.
max(X,Y,Y):- Y>X.


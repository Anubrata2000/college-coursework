delet(1,[_|T],T).

delet(P,[X|Y],[X|R]):-

    P1 is P-1,

    delet(P1,Y,R).

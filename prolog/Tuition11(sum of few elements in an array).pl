sum1([],0).
sum1([First|Rest],S):-
    sum1(Rest,SR),
    S is First+SR.

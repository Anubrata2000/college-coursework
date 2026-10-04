loop(0).
loop(N):- N>0,
          write(N),nl,
          S is N-1,loop(S).

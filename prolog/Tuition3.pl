population(china,100).
population(india,80).
population(usa,50).
area(china,7).
area(india,8).
area(usa,10).
density(X,Y):-population(X,P),
              area(X,Ar),
              Y is P/Ar.

/* Remove nth list */

result(H, Res1, [H|Res1]).
insert_nth(1, [H|T], T).
insert_nth(N, [H|T], Res):- 
	N > 1, N1 is N -1, insert_nth(N1, T, Res1), 
	result(H, Res1, Res).

go:- 
	print('Enter list []: '), read(A), 
	print('Enter location to remove: '), read(Loc), nl, nl, 
	print('List Before'), nl, 
	print(A), nl, nl, 
	print('List After'), nl, 
	insert_nth(Loc, A, Res), 
	print(Res).
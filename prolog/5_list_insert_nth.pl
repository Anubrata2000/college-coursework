/* Insert nth list */

result(H, Res1, [H|Res1]).
insert_nth(Item, 1, T, [Item|T]).
insert_nth(Item, N, [H|T], Res):- 
	N > 1, N1 is N -1, insert_nth(Item, N1, T, Res1), 
	result(H, Res1, Res).

go:- 
	print('Enter list []: '), read(A), 
	print('Enter number to insert: '), read(B), 
	print('Enter location to insert: '), read(Loc), nl, nl, 
	print('List Before'), nl, 
	print(A), nl, nl, 
	print('List After'), nl, 
	insert_nth(B, Loc, A, Res), 
	print(Res).